package p143z0;

import a4.PointerInputChange;
import a4.c;
import a4.k0;
import a4.o;
import er.l;
import er.p;
import er.r;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0005*\u00020\n¢\u0006\u0004\b\u000f\u0010\f\u001a\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0004*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u001a\u001a\u00020\u0004*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"La4/k0;", "", "panZoomLock", "Lkotlin/Function4;", "Lm3/e;", "", "Loq/i0;", "onGesture", "j", "(La4/k0;ZLer/r;Ltq/e;)Ljava/lang/Object;", "La4/o;", "h", "(La4/o;)F", "b", "(J)F", "i", "g", "(La4/o;)J", "useCurrent", "f", "(La4/o;Z)F", "c", "(La4/o;Z)J", "Lkotlin/Function1;", "La4/b0;", "pointerInputChangeMatcher", "d", "(La4/o;ZLer/l;)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k3 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends i implements p<c, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f231405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f231406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f231407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f231408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231410h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f231411j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f231412k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f231413l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ r<m3.e, m3.e, Float, Float, i0> f231414m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z15, r<? super m3.e, ? super m3.e, ? super Float, ? super Float, i0> rVar, e<? super a> eVar) {
            super(2, eVar);
            this.f231413l = z15;
            this.f231414m = rVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b9 A[LOOP:0: B:18:0x00a9->B:22:0x00b9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.k3.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(c cVar, e<? super i0> eVar) {
            return ((a) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f231413l, this.f231414m, eVar);
            aVar.f231412k = obj;
            return aVar;
        }
    }

    private static final float b(long j15) {
        int i15 = (int) (j15 >> 32);
        if (Float.intBitsToFloat(i15) == 0.0f && Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax))))) * 180.0f) / 3.1415927f;
    }

    public static final long c(o oVar, boolean z15) {
        return d(oVar, z15, new l() { // from class: z0.j3
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(k3.e((PointerInputChange) obj));
            }
        });
    }

    public static final long d(o oVar, boolean z15, l<? super PointerInputChange, Boolean> lVar) {
        long jC = m3.e.INSTANCE.c();
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            PointerInputChange pointerInputChange = listC.get(i16);
            if (lVar.b(pointerInputChange).booleanValue()) {
                jC = m3.e.q(jC, z15 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i15++;
            }
        }
        return i15 == 0 ? m3.e.INSTANCE.b() : m3.e.h(jC, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed();
    }

    public static final float f(o oVar, boolean z15) {
        long jC = c(oVar, z15);
        float fK = 0.0f;
        if (m3.e.j(jC, m3.e.INSTANCE.b())) {
            return 0.0f;
        }
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            PointerInputChange pointerInputChange = listC.get(i16);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fK += m3.e.k(m3.e.p(z15 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jC));
                i15++;
            }
        }
        return fK / i15;
    }

    public static final long g(o oVar) {
        long jC = c(oVar, true);
        m3.e.Companion companion = m3.e.INSTANCE;
        return m3.e.j(jC, companion.b()) ? companion.c() : m3.e.p(jC, c(oVar, false));
    }

    public static final float h(o oVar) {
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (i15 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = listC.get(i15);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i17 = 0;
            }
            i16 += i17;
            i15++;
        }
        if (i16 < 2) {
            return 0.0f;
        }
        long jC = c(oVar, true);
        long jC2 = c(oVar, false);
        List<PointerInputChange> listC2 = oVar.c();
        int size2 = listC2.size();
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i18 = 0; i18 < size2; i18++) {
            PointerInputChange pointerInputChange2 = listC2.get(i18);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jP = m3.e.p(pointerInputChange2.getPreviousPosition(), jC2);
                long jP2 = m3.e.p(position, jC);
                float fB = b(jP2) - b(jP);
                float fK = m3.e.k(m3.e.q(jP2, jP)) / 2.0f;
                if (fB > 180.0f) {
                    fB -= 360.0f;
                } else if (fB < -180.0f) {
                    fB += 360.0f;
                }
                f16 += fB * fK;
                f15 += fK;
            }
        }
        if (f15 == 0.0f) {
            return 0.0f;
        }
        return f16 / f15;
    }

    public static final float i(o oVar) {
        float f15 = f(oVar, true);
        float f16 = f(oVar, false);
        if (f15 == 0.0f || f16 == 0.0f) {
            return 1.0f;
        }
        return f15 / f16;
    }

    public static final Object j(k0 k0Var, boolean z15, r<? super m3.e, ? super m3.e, ? super Float, ? super Float, i0> rVar, e<? super i0> eVar) {
        Object objD = g1.d(k0Var, new a(z15, rVar, null), eVar);
        return objD == b.e() ? objD : i0.f148189a;
    }

    public static /* synthetic */ Object k(k0 k0Var, boolean z15, r rVar, e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return j(k0Var, z15, rVar, eVar);
    }
}
