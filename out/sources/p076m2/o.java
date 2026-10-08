package p076m2;

import er.p;
import eu.h;
import eu.j;
import eu.k;
import fr.w0;
import fu.r;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import r0.a1;
import tq.e;
import uq.b;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lm2/o;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lr0/a1;", "", "instances", "reused", "Lr0/o;", "operations", "", "lastOperation", "", "cause", "<init>", "(Lr0/a1;Lr0/a1;Lr0/o;ILjava/lang/Throwable;)V", "Leu/h;", "", "e", "()Leu/h;", "a", "Lr0/a1;", "b", "c", "Lr0/o;", "d", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a1<Object> instances;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a1<Object> reused;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0.o operations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int lastOperation;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leu/j;", "", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends i implements p<j<? super String>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f123028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f123029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f123031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f123032g;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            j jVar;
            int i16;
            int i17;
            String str;
            int i18;
            int i19;
            Object objE = b.e();
            int i25 = this.f123031f;
            if (i25 == 0) {
                u.b(obj);
                i15 = 0;
                jVar = (j) this.f123032g;
                i16 = 0;
                i17 = 0;
            } else {
                if (i25 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i26 = this.f123030e;
                int i27 = this.f123029d;
                int i28 = this.f123028c;
                jVar = (j) this.f123032g;
                u.b(obj);
                i16 = i27;
                i17 = i26;
                i15 = i28;
            }
            while (i15 < Math.min(o.this.lastOperation + 10, o.this.operations._size)) {
                int i29 = i15 + 1;
                int iE = o.this.operations.e(i15);
                switch (iE) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i35 = i16 + 1;
                        str = "down " + o.this.instances.d(i16);
                        i16 = i35;
                        break;
                    case 2:
                        str = "remove " + o.this.operations.e(i29) + ' ' + o.this.operations.e(i15 + 2);
                        i29 = i15 + 3;
                        break;
                    case 3:
                        str = "move " + o.this.operations.e(i29) + ' ' + o.this.operations.e(i15 + 2) + ' ' + o.this.operations.e(i15 + 3);
                        i29 = i15 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i18 = i15 + 2;
                        i19 = i16 + 1;
                        str = "insertBottomUp " + o.this.operations.e(i29) + ' ' + o.this.instances.d(i16);
                        i29 = i18;
                        i16 = i19;
                        break;
                    case 6:
                        i18 = i15 + 2;
                        i19 = i16 + 1;
                        str = "insertTopDown " + o.this.operations.e(i29) + ' ' + o.this.instances.d(i16);
                        i29 = i18;
                        i16 = i19;
                        break;
                    case 7:
                        p pVar = (p) w0.g(o.this.instances.d(i16), 2);
                        i16 += 2;
                        str = "apply " + pVar;
                        break;
                    case 8:
                        str = "reuse " + o.this.reused.d(i17);
                        i17++;
                        break;
                    case 9:
                        str = "recompose pending";
                        break;
                    default:
                        str = "unknown op: " + iE;
                        break;
                }
                String str2 = i15 + ": " + str;
                this.f123032g = jVar;
                this.f123028c = i29;
                this.f123029d = i16;
                this.f123030e = i17;
                this.f123031f = 1;
                if (jVar.a(str2, this) == objE) {
                    return objE;
                }
                i15 = i29;
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(j<? super String> jVar, e<? super i0> eVar) {
            return ((a) v(jVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = o.this.new a(eVar);
            aVar.f123032g = obj;
            return aVar;
        }
    }

    public o(a1<Object> a1Var, a1<Object> a1Var2, r0.o oVar, int i15, Throwable th4) {
        super(th4);
        this.instances = a1Var;
        this.reused = a1Var2;
        this.operations = oVar;
        this.lastOperation = i15;
    }

    private final h<String> e() {
        return k.b(new a(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return r.p("\n            |Failed to execute op number " + this.lastOperation + ":\n            |" + v.v0(v.Y0(k.P(e()), 50), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
