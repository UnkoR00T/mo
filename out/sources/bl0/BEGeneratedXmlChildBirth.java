package bl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lbl0/u;", "", "Lry/a;", "unsignedBase64Xml", "Liy/b0;", "childFirstName", "childSurname", "xmlId", "childSecondName", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "d", "()Liy/b0;", "b", "c", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEGeneratedXmlChildBirth {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 unsignedBase64Xml;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 childFirstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 childSurname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 xmlId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 childSecondName;

    public /* synthetic */ BEGeneratedXmlChildBirth(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, fr.k kVar) {
        this(b0Var, b0Var2, b0Var3, b0Var4, b0Var5);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getChildFirstName() {
        return this.childFirstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getChildSecondName() {
        return this.childSecondName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getChildSurname() {
        return this.childSurname;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getUnsignedBase64Xml() {
        return this.unsignedBase64Xml;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getXmlId() {
        return this.xmlId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEGeneratedXmlChildBirth)) {
            return false;
        }
        BEGeneratedXmlChildBirth bEGeneratedXmlChildBirth = (BEGeneratedXmlChildBirth) other;
        return ry.a.d(this.unsignedBase64Xml, bEGeneratedXmlChildBirth.unsignedBase64Xml) && fr.t.c(this.childFirstName, bEGeneratedXmlChildBirth.childFirstName) && fr.t.c(this.childSurname, bEGeneratedXmlChildBirth.childSurname) && fr.t.c(this.xmlId, bEGeneratedXmlChildBirth.xmlId) && fr.t.c(this.childSecondName, bEGeneratedXmlChildBirth.childSecondName);
    }

    public int hashCode() {
        int iE = ((((((ry.a.e(this.unsignedBase64Xml) * 31) + this.childFirstName.hashCode()) * 31) + this.childSurname.hashCode()) * 31) + this.xmlId.hashCode()) * 31;
        b0 b0Var = this.childSecondName;
        return iE + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "BEGeneratedXmlChildBirth(unsignedBase64Xml=" + ry.a.f(this.unsignedBase64Xml) + ", childFirstName=" + this.childFirstName + ", childSurname=" + this.childSurname + ", xmlId=" + this.xmlId + ", childSecondName=" + this.childSecondName + ")";
    }

    private BEGeneratedXmlChildBirth(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
        this.unsignedBase64Xml = b0Var;
        this.childFirstName = b0Var2;
        this.childSurname = b0Var3;
        this.xmlId = b0Var4;
        this.childSecondName = b0Var5;
    }
}
