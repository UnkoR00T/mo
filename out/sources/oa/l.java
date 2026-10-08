package oa;

import java.util.Set;
import mu.r0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Loa/l;", "", "", "size", "<init>", "(I)V", "", "tableIds", "Loq/i0;", "b", "(Ljava/util/Set;)V", "Lmu/h;", "", "collector", "", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "Lmu/b0;", "Lmu/b0;", "versions", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<int[]> versions;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f143665d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f143667f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f143665d = obj;
            this.f143667f |= PKIFailureInfo.systemUnavail;
            return l.this.a(null, this);
        }
    }

    public l(int i15) {
        this.versions = r0.a(new int[i15]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(mu.h<? super int[]> hVar, tq.e<?> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f143667f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f143667f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f143665d;
        Object objE = uq.b.e();
        int i16 = aVar.f143667f;
        if (i16 == 0) {
            oq.u.b(obj);
            mu.b0<int[]> b0Var = this.versions;
            aVar.f143667f = 1;
            if (b0Var.a(hVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }

    public final void b(Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        if (tableIds.isEmpty()) {
            return;
        }
        mu.b0<int[]> b0Var = this.versions;
        do {
            value = b0Var.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i15 = 0; i15 < length; i15++) {
                iArr[i15] = tableIds.contains(Integer.valueOf(i15)) ? iArr2[i15] + 1 : iArr2[i15];
            }
        } while (!b0Var.s(value, iArr));
    }
}
