package cn;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: cn.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0728a {
        public abstract a a();

        public abstract AbstractC0728a b(boolean z15);

        public abstract AbstractC0728a c(String str);

        public abstract AbstractC0728a d(String str);
    }

    public static AbstractC0728a a(String str, String str2, String str3) {
        d dVar = new d();
        dVar.e(str);
        if (str2 == null) {
            str2 = "mlkit-google-ocr-models";
        }
        dVar.d(str2);
        dVar.c(str3);
        dVar.b(false);
        return dVar;
    }

    abstract String b();

    abstract String c();

    abstract String d();

    abstract boolean e();
}
