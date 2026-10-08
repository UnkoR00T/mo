package hg;

import com.google.android.gms.common.api.Status;
import ig.r;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static h<Status> a(Status status, f fVar) {
        s.m(status, "Result must not be null");
        r rVar = new r(fVar);
        rVar.e(status);
        return rVar;
    }
}
