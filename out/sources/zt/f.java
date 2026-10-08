package zt;

/* JADX INFO: loaded from: classes4.dex */
public interface f {

    public static final class a {
        public static String a(f fVar, vr.z zVar) {
            if (fVar.a(zVar)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(vr.z zVar);

    String b(vr.z zVar);

    String getDescription();
}
