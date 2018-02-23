package com.insebre.articlesjsf;

import com.insebre.articlesjsf.util.JsfUtil;
import com.insebre.articlesjsf.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("preusController")
@SessionScoped
public class PreusController implements Serializable {

    @EJB
    private com.insebre.articlesjsf.PreusFacade ejbFacade;
    private List<Preus> items = null;
    private Preus selected;

    public PreusController() {
    }

    public Preus getSelected() {
        return selected;
    }

    public void setSelected(Preus selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
        selected.setPreusPK(new com.insebre.articlesjsf.PreusPK());
    }

    private PreusFacade getFacade() {
        return ejbFacade;
    }

    public Preus prepareCreate() {
        selected = new Preus();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("PreusCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("PreusUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("PreusDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Preus> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Preus getPreus(com.insebre.articlesjsf.PreusPK id) {
        return getFacade().find(id);
    }

    public List<Preus> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Preus> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Preus.class)
    public static class PreusControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PreusController controller = (PreusController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "preusController");
            return controller.getPreus(getKey(value));
        }

        com.insebre.articlesjsf.PreusPK getKey(String value) {
            com.insebre.articlesjsf.PreusPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.insebre.articlesjsf.PreusPK();
            key.setEmpresa(values[0]);
            key.setClau(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(com.insebre.articlesjsf.PreusPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getEmpresa());
            sb.append(SEPARATOR);
            sb.append(value.getClau());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Preus) {
                Preus o = (Preus) object;
                return getStringKey(o.getPreusPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Preus.class.getName()});
                return null;
            }
        }

    }

}
