package di2;

import k34.StudentCardDataHeader;
import k34.StudentCardDocumentData;
import p071kotlin.Metadata;
import xh2.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldi2/a;", "Lk34/c0;", "b", "(Ldi2/a;)Lk34/c0;", "Lxh2/c;", "Lk34/b0;", "a", "(Lxh2/c;)Lk34/b0;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final StudentCardDataHeader a(c cVar) {
        return new StudentCardDataHeader(cVar.a(), cVar.c(), cVar.b(), cVar.d(), Long.valueOf(cVar.e()));
    }

    public static final StudentCardDocumentData b(a aVar) {
        return new StudentCardDocumentData(a(aVar.f42822a), aVar.f42823b, aVar.f42824c, aVar.f42825d, aVar.f42826e, aVar.f42827f, aVar.f42828g, aVar.f42829h, aVar.f42830j, aVar.f42831k, aVar.f42832l, aVar.f42833m, aVar.f42834n, aVar.f42835p, aVar.f42836q, aVar.f42837r, aVar.f42838s, aVar.f42839t, aVar.f42840v.booleanValue());
    }
}
