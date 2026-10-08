package b3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import r0.g1;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001\u0016B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00020\u000f*\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006)"}, d2 = {"Lb3/o;", "Lb3/i;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "q", "()Ljava/util/Map;", "Lb3/r;", "map", "key", "Loq/i0;", "r", "(Lb3/r;Ljava/util/Map;Ljava/lang/Object;)V", "Lkotlin/Function0;", "content", "d", "(Ljava/lang/Object;Ler/p;Lm2/r;I)V", "a", "(Ljava/lang/Object;)V", "Ljava/util/Map;", "Lr0/t0;", "b", "Lr0/t0;", "registries", "c", "Lb3/r;", "getParentSaveableStateRegistry", "()Lb3/r;", "s", "(Lb3/r;)V", "parentSaveableStateRegistry", "Lkotlin/Function1;", "", "Ler/l;", "canBeSaved", "e", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x<o, ?> f16324f = a0.e(new er.p() { // from class: b3.k
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return o.j((b0) obj, (o) obj2);
        }
    }, new er.l() { // from class: b3.l
        @Override // er.l
        public final Object b(Object obj) {
            return o.k((Map) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, r> registries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private r parentSaveableStateRegistry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: b3.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb3/o$a;", "", "<init>", "()V", "Lb3/x;", "Lb3/o;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final x<o, ?> a() {
            return o.f16324f;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b3/o$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f16330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f16331c;

        public b(Object obj, w wVar) {
            this.f16330b = obj;
            this.f16331c = wVar;
        }

        @Override // p076m2.r0
        public void j() {
            Object objU = o.this.registries.u(this.f16330b);
            w wVar = this.f16331c;
            if (objU == wVar) {
                o oVar = o.this;
                oVar.r(wVar, oVar.savedStates, this.f16330b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 h(o oVar, Object obj, w wVar, s0 s0Var) {
        if (!oVar.registries.b(obj)) {
            oVar.savedStates.remove(obj);
            oVar.registries.x(obj, wVar);
            return oVar.new b(obj, wVar);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(o oVar, Object obj, er.p pVar, int i15, p076m2.r rVar, int i16) {
        oVar.d(obj, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(b0 b0Var, o oVar) {
        return oVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o k(Map map) {
        return new o(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(o oVar, Object obj) {
        r rVar = oVar.parentSaveableStateRegistry;
        if (rVar != null) {
            return rVar.b(obj);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004c A[LOOP:0: B:5:0x0013->B:15:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[EDGE_INSN: B:21:0x004f->B:16:0x004f BREAK  A[LOOP:0: B:5:0x0013->B:15:0x004c], SYNTHETIC] */
    private final Map<Object, Map<String, List<Object>>> q() {
        Map<Object, Map<String, List<Object>>> map = this.savedStates;
        t0<Object, r> t0Var = this.registries;
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
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
                            int i18 = (i15 << 3) + i17;
                            r((r) objArr2[i18], map, objArr[i18]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(r rVar, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapE = rVar.e();
        if (mapE.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapE);
        }
    }

    @Override // b3.i
    public void a(Object key) {
        if (this.registries.u(key) == null) {
            this.savedStates.remove(key);
        }
    }

    @Override // b3.i
    public void d(final Object obj, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(533563200);
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
            if (p076m2.t.k()) {
                p076m2.t.o(533563200, i16, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            rVarH.M(207, obj);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                if (!this.canBeSaved.b(obj).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objE = new w(u.c(this.savedStates.get(obj), this.canBeSaved));
                rVarH.v(objE);
            }
            final w wVar = (w) objE;
            d0.d(new c4[]{u.g().d(wVar), va.b.c().d(wVar)}, pVar, rVarH, (i16 & 112) | c4.f122821i);
            i0 i0Var = i0.f148189a;
            boolean zG = rVarH.G(this) | rVarH.G(obj) | rVarH.G(wVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: b3.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.h(this.f16316a, obj, wVar, (s0) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            Function0.a(i0Var, (er.l) objE2, rVarH, 6);
            rVarH.B();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: b3.n
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return o.i(this.f16319a, obj, pVar, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final void s(r rVar) {
        this.parentSaveableStateRegistry = rVar;
    }

    public o(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = g1.c();
        this.canBeSaved = new er.l() { // from class: b3.j
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(o.p(this.f16315a, obj));
            }
        };
    }

    public /* synthetic */ o(Map map, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
