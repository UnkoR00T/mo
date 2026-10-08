package oc;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Loc/j;", "", "b", "(Loc/j;)Z", "isSwapped", "a", "isRotated", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final boolean a(j jVar) {
        return jVar.getRotationDegrees() > 0;
    }

    public static final boolean b(j jVar) {
        return jVar.getRotationDegrees() == 90 || jVar.getRotationDegrees() == 270;
    }
}
