package ig;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public class t {
    public static <ResultT> void a(Status status, ResultT resultt, vh.m<ResultT> mVar) {
        if (status.C()) {
            mVar.c(resultt);
        } else {
            mVar.b(jg.b.a(status));
        }
    }

    public static void b(Status status, vh.m<Void> mVar) {
        a(status, null, mVar);
    }

    public static <ResultT> boolean c(Status status, ResultT resultt, vh.m<ResultT> mVar) {
        return status.C() ? mVar.e(resultt) : mVar.d(jg.b.a(status));
    }
}
