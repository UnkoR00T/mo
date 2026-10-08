package xg;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static Object a(Class cls, String str, r... rVarArr) {
        return c(cls, "isIsolated", null, false, rVarArr);
    }

    public static Object b(String str, String str2, ClassLoader classLoader, r... rVarArr) {
        return c(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, rVarArr);
    }

    private static Object c(Class cls, String str, Object obj, boolean z15, r... rVarArr) {
        int length = rVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            r rVar = rVarArr[i15];
            rVar.getClass();
            clsArr[i15] = rVar.b();
            objArr[i15] = rVarArr[i15].c();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
