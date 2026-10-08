package fr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends f implements mr.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f66402h;

    public k0(Object obj, Class cls, String str, String str2, int i15) {
        super(obj, cls, str, str2, (i15 & 1) == 1);
        this.f66402h = (i15 & 2) == 2;
    }

    @Override // fr.f
    public mr.b c() {
        return this.f66402h ? this : super.c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return i().equals(k0Var.i()) && getName().equals(k0Var.getName()) && r().equals(k0Var.r()) && t.c(h(), k0Var.h());
        }
        if (obj instanceof mr.l) {
            return obj.equals(c());
        }
        return false;
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + getName().hashCode()) * 31) + r().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public mr.l m() {
        if (this.f66402h) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (mr.l) super.m();
    }

    public String toString() {
        mr.b bVarC = c();
        if (bVarC != this) {
            return bVarC.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
