package fr;

/* JADX INFO: loaded from: classes4.dex */
public class p extends f implements o, mr.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f66409h;

    public p(int i15, Object obj, Class cls, String str, String str2, int i16) {
        super(obj, cls, str, str2, (i16 & 1) == 1);
        this.f66409h = i15;
    }

    @Override // fr.f
    protected mr.b e() {
        return q0.b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getName().equals(pVar.getName()) && r().equals(pVar.r()) && t.c(h(), pVar.h()) && t.c(i(), pVar.i());
        }
        if (obj instanceof mr.g) {
            return obj.equals(c());
        }
        return false;
    }

    public int hashCode() {
        return (((i() == null ? 0 : i().hashCode() * 31) + getName().hashCode()) * 31) + r().hashCode();
    }

    @Override // fr.o
    /* JADX INFO: renamed from: p */
    public int getArity() {
        return this.f66409h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public mr.g m() {
        return (mr.g) super.m();
    }

    public String toString() {
        mr.b bVarC = c();
        if (bVarC != this) {
            return bVarC.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
