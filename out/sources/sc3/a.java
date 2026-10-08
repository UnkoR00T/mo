package sc3;

import ay.h;
import ay.j;
import p071kotlin.Metadata;
import wc3.e;
import wc3.f;
import wc3.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJK\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsc3/a;", "", "<init>", "()V", "Lwc3/e;", "getPassportUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lwc3/f;", "b", "(Lwc3/e;Lac4/a;)Lwc3/f;", "Lwc3/c;", "a", "(Lwc3/e;)Lwc3/c;", "Lq10/a;", "databaseRegistry", "Lp10/f;", "dbProvider", "Liy/a;", "base64Coder", "Lay/h;", "jsonFactory", "Lez/a;", "currentTimeProvider", "Lay/j;", "jsonSerializer", "Lpx/d;", "remoteLogger", "Lvc3/a;", "c", "(Lq10/a;Lp10/f;Liy/a;Lay/h;Lez/a;Lay/j;Lpx/d;)Lvc3/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final wc3.c a(e getPassportUC) {
        return new wc3.d(getPassportUC);
    }

    public final f b(e getPassportUC, ac4.a callActionWithLoaderUseCase) {
        return new g(getPassportUC, callActionWithLoaderUseCase);
    }

    public final vc3.a c(q10.a databaseRegistry, p10.f dbProvider, iy.a base64Coder, h jsonFactory, ez.a currentTimeProvider, j jsonSerializer, px.d remoteLogger) {
        return new rc3.a(dbProvider, base64Coder, currentTimeProvider, jsonSerializer, databaseRegistry, remoteLogger, jsonFactory);
    }
}
