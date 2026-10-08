package i6;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static void a(Object obj, StringBuilder sb5) {
        int iLastIndexOf;
        if (obj == null) {
            sb5.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb5.append(simpleName);
        sb5.append('{');
        sb5.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
