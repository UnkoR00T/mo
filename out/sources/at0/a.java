package at0;

import dx.i;
import er.p;
import iy.b0;
import java.time.OffsetDateTime;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import ts0.AuthorizedRequest;
import ts0.Restriction;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ^\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2.\u0010\u0010\u001a*\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH¦@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\bJ\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0004H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lat0/a;", "", "Lts0/a;", "authorizedRequest", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lts0/a;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "challenge", "Ljava/time/OffsetDateTime;", "value", "Lkotlin/Function2;", "Ltq/e;", "Lry/a;", "signBase64", "c", "(Liy/b0;Ljava/time/OffsetDateTime;Ler/p;Ltq/e;)Ljava/lang/Object;", "b", "Lts0/f;", "a", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends dx.b, Restriction>> eVar);

    Object b(AuthorizedRequest authorizedRequest, e<? super i<? extends dx.b, i0>> eVar);

    Object c(b0 b0Var, OffsetDateTime offsetDateTime, p<? super b0, ? super e<? super i<? extends dx.b, ry.a>>, ? extends Object> pVar, e<? super i<? extends dx.b, i0>> eVar);

    Object d(AuthorizedRequest authorizedRequest, e<? super i<? extends dx.b, i0>> eVar);
}
