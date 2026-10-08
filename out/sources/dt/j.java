package dt;

/* JADX INFO: loaded from: classes4.dex */
public interface j {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    a v();

    b w(vr.a aVar, vr.a aVar2, vr.e eVar);
}
