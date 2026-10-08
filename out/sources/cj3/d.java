package cj3;

import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcj3/d;", "Lcj3/c;", "Lbw0/c;", "getVehicleHistoryUseCase", "Lbw0/a;", "getVehicleHistoryAbroadUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lbw0/c;Lbw0/a;Lmx/c;)V", "Ldx/b;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "Lcj3/c$a;", "params", "Ldx/i;", "Luv0/s;", "e", "(Lcj3/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbw0/c;", "b", "Lbw0/a;", "c", "Lmx/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bw0.c getVehicleHistoryUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bw0.a getVehicleHistoryAbroadUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27474h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f27475j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f27477l;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27475j = obj;
            this.f27477l |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(bw0.c cVar, bw0.a aVar, mx.c cVar2) {
        this.getVehicleHistoryUseCase = cVar;
        this.getVehicleHistoryAbroadUseCase = aVar;
        this.labelProvider = cVar2;
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r15 == r1) goto L25;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(cj3.c.Params r14, tq.e<? super dx.i<? extends dx.b, ? extends uv0.s>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj3.d.c(cj3.c$a, tq.e):java.lang.Object");
    }
}
