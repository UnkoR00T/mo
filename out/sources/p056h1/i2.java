package p056h1;

import b3.a0;
import b3.b0;
import b3.i;
import b3.r;
import b3.u;
import b3.x;
import er.a;
import er.l;
import er.p;
import fr.k;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import r0.i1;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\rJ#\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006'"}, d2 = {"Lh1/i2;", "Lb3/r;", "Lb3/i;", "wrappedRegistry", "wrappedHolder", "<init>", "(Lb3/r;Lb3/i;)V", "parentRegistry", "", "", "", "", "restoredValues", "(Lb3/r;Ljava/util/Map;Lb3/i;)V", "e", "()Ljava/util/Map;", "key", "Lkotlin/Function0;", "Loq/i0;", "content", "d", "(Ljava/lang/Object;Ler/p;Lm2/r;I)V", "a", "(Ljava/lang/Object;)V", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "valueProvider", "Lb3/r$a;", "c", "(Ljava/lang/String;Ler/a;)Lb3/r$a;", "value", "", "b", "(Ljava/lang/Object;)Z", "Lb3/r;", "Lb3/i;", "Lr0/u0;", "Lr0/u0;", "previouslyComposedKeys", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i2 implements r, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r wrappedRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i wrappedHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0<Object> previouslyComposedKeys;

    /* JADX INFO: renamed from: h1.i2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\n0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh1/i2$a;", "", "<init>", "()V", "Lb3/r;", "parentRegistry", "Lb3/i;", "wrappedHolder", "Lb3/x;", "Lh1/i2;", "", "", "", "c", "(Lb3/r;Lb3/i;)Lb3/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map d(b0 b0Var, i2 i2Var) {
            Map<String, List<Object>> mapE = i2Var.e();
            if (mapE.isEmpty()) {
                return null;
            }
            return mapE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i2 e(r rVar, i iVar, Map map) {
            return new i2(rVar, map, iVar);
        }

        public final x<i2, Map<String, List<Object>>> c(final r parentRegistry, final i wrappedHolder) {
            return a0.e(new p() { // from class: h1.g2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i2.Companion.d((b0) obj, (i2) obj2);
                }
            }, new l() { // from class: h1.h2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.Companion.e(parentRegistry, wrappedHolder, (Map) obj);
                }
            });
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h1/i2$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f79445b;

        public b(Object obj) {
            this.f79445b = obj;
        }

        @Override // p076m2.r0
        public void j() {
            i2.this.previouslyComposedKeys.x(this.f79445b);
        }
    }

    public i2(r rVar, i iVar) {
        this.wrappedRegistry = rVar;
        this.wrappedHolder = iVar;
        this.previouslyComposedKeys = i1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 j(i2 i2Var, Object obj, s0 s0Var) {
        i2Var.previouslyComposedKeys.v(obj);
        return i2Var.new b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i2 i2Var, Object obj, p pVar, int i15, p076m2.r rVar, int i16) {
        i2Var.d(obj, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(r rVar, Object obj) {
        if (rVar != null) {
            return rVar.b(obj);
        }
        return true;
    }

    @Override // b3.i
    public void a(Object key) {
        this.wrappedHolder.a(key);
    }

    @Override // b3.r
    public boolean b(Object value) {
        return this.wrappedRegistry.b(value);
    }

    @Override // b3.r
    public r.a c(String key, a<? extends Object> valueProvider) {
        return this.wrappedRegistry.c(key, valueProvider);
    }

    @Override // b3.i
    public void d(final Object obj, final p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-858296452);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(obj) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(this) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-858296452, i16, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i17 = i16 & 14;
            this.wrappedHolder.d(obj, pVar, rVarH, i16 & 126);
            boolean zG = rVarH.G(this) | rVarH.G(obj);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new l() { // from class: h1.d2
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i2.j(this.f79351a, obj, (s0) obj2);
                    }
                };
                rVarH.v(objE);
            }
            Function0.a(obj, (l) objE, rVarH, i17);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h1.e2
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return i2.k(this.f79359a, obj, pVar, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // b3.r
    public Map<String, List<Object>> e() {
        u0<Object> u0Var = this.previouslyComposedKeys;
        Object[] objArr = u0Var.elements;
        long[] jArr = u0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            this.wrappedHolder.a(objArr[(i15 << 3) + i17]);
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return this.wrappedRegistry.e();
    }

    @Override // b3.r
    public Object f(String key) {
        return this.wrappedRegistry.f(key);
    }

    public i2(final r rVar, Map<String, ? extends List<? extends Object>> map, i iVar) {
        this(u.c(map, new l() { // from class: h1.f2
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(i2.l(rVar, obj));
            }
        }), iVar);
    }
}
