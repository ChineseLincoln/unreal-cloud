@javax.persistence.Entity
@javax.persistence.Table(name = "gate_log", schema = "ag_admin", catalog = "")
public class GateLogEntity {
    private int id;
    private String menu;
    private String opt;
    private String uri;
    private Timestamp crtTime;
    private String crtUser;
    private String crtName;
    private String crtHost;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "menu")
    public java.lang.String getMenu() {
        return menu;
    }

    public void setMenu(java.lang.String menu) {
        this.menu = menu;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "opt")
    public java.lang.String getOpt() {
        return opt;
    }

    public void setOpt(java.lang.String opt) {
        this.opt = opt;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "uri")
    public java.lang.String getUri() {
        return uri;
    }

    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_time")
    public java.sql.Timestamp getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(java.sql.Timestamp crtTime) {
        this.crtTime = crtTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_user")
    public java.lang.String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(java.lang.String crtUser) {
        this.crtUser = crtUser;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_name")
    public java.lang.String getCrtName() {
        return crtName;
    }

    public void setCrtName(java.lang.String crtName) {
        this.crtName = crtName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_host")
    public java.lang.String getCrtHost() {
        return crtHost;
    }

    public void setCrtHost(java.lang.String crtHost) {
        this.crtHost = crtHost;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        GateLogEntity that = (GateLogEntity) object;

        if (id != that.id) return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (opt != null ? !opt.equals(that.opt) : that.opt != null) return false;
        if (uri != null ? !uri.equals(that.uri) : that.uri != null) return false;
        if (crtTime != null ? !crtTime.equals(that.crtTime) : that.crtTime != null) return false;
        if (crtUser != null ? !crtUser.equals(that.crtUser) : that.crtUser != null) return false;
        if (crtName != null ? !crtName.equals(that.crtName) : that.crtName != null) return false;
        if (crtHost != null ? !crtHost.equals(that.crtHost) : that.crtHost != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (opt != null ? opt.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        result = 31 * result + (crtTime != null ? crtTime.hashCode() : 0);
        result = 31 * result + (crtUser != null ? crtUser.hashCode() : 0);
        result = 31 * result + (crtName != null ? crtName.hashCode() : 0);
        result = 31 * result + (crtHost != null ? crtHost.hashCode() : 0);
        return result;
    }
}
