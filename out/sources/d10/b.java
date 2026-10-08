package d10;

import ay.j;
import dx.i;
import java.text.ParseException;
import mr.c;
import nr.e;
import oy.ParsedJwt;
import p071kotlin.Metadata;
import sn.y;
import sn.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u000e0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ld10/b;", "Loy/a;", "Lay/j;", "jsonSerializer", "<init>", "(Lay/j;)V", "", "T", "", "data", "Lmr/c;", "payloadClass", "Ldx/i;", "Ldx/b;", "Loy/b;", "", "a", "(Ljava/lang/String;Lmr/c;Ltq/e;)Ljava/lang/Object;", "Lay/j;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements oy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    public b(j jVar) {
        this.jsonSerializer = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(b bVar, c cVar, y yVar) {
        return bVar.jsonSerializer.a(yVar.toString(), e.c(cVar, null, false, null, 7, null));
    }

    @Override // oy.a
    public <T> Object a(String str, final c<T> cVar, tq.e<? super i<? extends dx.b, ParsedJwt>> eVar) {
        try {
            return new i.Right(new ParsedJwt(null, jo.b.s(str).b().e(new z() { // from class: d10.a
                @Override // sn.z
                public final Object a(y yVar) {
                    return b.c(this.f39413a, cVar, yVar);
                }
            })));
        } catch (ParseException e15) {
            return new i.Left(new dx.b.Generic(e15));
        }
    }
}
