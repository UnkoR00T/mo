package ze;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public enum v {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray<v> f234628h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f234630a;

    static {
        v vVar = DEFAULT;
        v vVar2 = UNMETERED_ONLY;
        v vVar3 = UNMETERED_OR_DAILY;
        v vVar4 = FAST_IF_RADIO_AWAKE;
        v vVar5 = NEVER;
        v vVar6 = UNRECOGNIZED;
        SparseArray<v> sparseArray = new SparseArray<>();
        f234628h = sparseArray;
        sparseArray.put(0, vVar);
        sparseArray.put(1, vVar2);
        sparseArray.put(2, vVar3);
        sparseArray.put(3, vVar4);
        sparseArray.put(4, vVar5);
        sparseArray.put(-1, vVar6);
    }

    v(int i15) {
        this.f234630a = i15;
    }
}
