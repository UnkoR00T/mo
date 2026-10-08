package j5;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static i v(String str) {
        i iVar = new i(str.toCharArray());
        iVar.t(0L);
        iVar.s(str.length() - 1);
        return iVar;
    }

    @Override // j5.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && g().equals(((i) obj).g())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // j5.c
    public int hashCode() {
        return super.hashCode();
    }
}
