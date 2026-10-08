package b3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;
import r0.g1;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR2\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001d\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, d2 = {"Lb3/s;", "Lb3/r;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Ler/l;)V", "value", "b", "(Ljava/lang/Object;)Z", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Lb3/r$a;", "c", "(Ljava/lang/String;Ler/a;)Lb3/r$a;", "e", "()Ljava/util/Map;", "a", "Ler/l;", "Lr0/t0;", "Lr0/t0;", "", "valueProviders", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t0<String, List<Object>> restored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t0<String, List<er.a<Object>>> valueProviders;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b3/s$a", "Lb3/r$a;", "Loq/i0;", "a", "()V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0<String, List<er.a<Object>>> f16335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<Object> f16337c;

        a(t0<String, List<er.a<Object>>> t0Var, String str, er.a<? extends Object> aVar) {
            this.f16335a = t0Var;
            this.f16336b = str;
            this.f16337c = aVar;
        }

        @Override // b3.r.a
        public void a() {
            List<er.a<Object>> listU = this.f16335a.u(this.f16336b);
            if (listU != null) {
                listU.remove(this.f16337c);
            }
            List<er.a<Object>> list = listU;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f16335a.x(this.f16336b, listU);
        }
    }

    public s(Map<String, ? extends List<? extends Object>> map, er.l<Object, Boolean> lVar) {
        this.canBeSaved = lVar;
        this.restored = (map == null || map.isEmpty()) ? null : u.h(map);
    }

    @Override // b3.r
    public boolean b(Object value) {
        return this.canBeSaved.b(value).booleanValue();
    }

    @Override // b3.r
    public r.a c(String key, er.a<? extends Object> valueProvider) {
        if (u.f(key)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        t0<String, List<er.a<Object>>> t0VarC = this.valueProviders;
        if (t0VarC == null) {
            t0VarC = g1.c();
            this.valueProviders = t0VarC;
        }
        List<er.a<Object>> listE = t0VarC.e(key);
        if (listE == null) {
            listE = new ArrayList<>();
            t0VarC.x(key, listE);
        }
        listE.add(valueProvider);
        return new a(t0VarC, key, valueProvider);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    @Override // b3.r
    public Map<String, List<Object>> e() {
        char c15;
        long j15;
        long j16;
        long j17;
        long[] jArr;
        int i15;
        long[] jArr2;
        int i16;
        t0<String, List<Object>> t0Var = this.restored;
        if (t0Var == null && this.valueProviders == null) {
            return v0.i();
        }
        int i17 = 0;
        int i18 = t0Var != null ? t0Var.get_size() : 0;
        t0<String, List<er.a<Object>>> t0Var2 = this.valueProviders;
        HashMap map = new HashMap(i18 + (t0Var2 != null ? t0Var2.get_size() : 0));
        t0<String, List<Object>> t0Var3 = this.restored;
        char c16 = 7;
        long j18 = -9187201950435737472L;
        int i19 = 8;
        if (t0Var3 != null) {
            Object[] objArr = t0Var3.keys;
            Object[] objArr2 = t0Var3.values;
            long[] jArr3 = t0Var3.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i25 = 0;
                j16 = 128;
                while (true) {
                    long j19 = jArr3[i25];
                    j17 = 255;
                    if ((((~j19) << c16) & j19 & j18) != j18) {
                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j19 & 255) < 128) {
                                int i28 = (i25 << 3) + i27;
                                map.put((String) objArr[i28], (List) objArr2[i28]);
                            }
                            j19 >>= 8;
                            i27++;
                            c16 = c16;
                            j18 = j18;
                        }
                        c15 = c16;
                        j15 = j18;
                        if (i26 != 8) {
                            break;
                        }
                    } else {
                        c15 = c16;
                        j15 = j18;
                    }
                    if (i25 == length) {
                        break;
                    }
                    i25++;
                    c16 = c15;
                    j18 = j15;
                }
            } else {
                c15 = 7;
                j15 = -9187201950435737472L;
                j16 = 128;
                j17 = 255;
            }
        } else {
            c15 = 7;
            j15 = -9187201950435737472L;
            j16 = 128;
            j17 = 255;
        }
        t0<String, List<er.a<Object>>> t0Var4 = this.valueProviders;
        if (t0Var4 != null) {
            Object[] objArr3 = t0Var4.keys;
            Object[] objArr4 = t0Var4.values;
            long[] jArr4 = t0Var4.metadata;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i29 = 0;
                while (true) {
                    long j25 = jArr4[i29];
                    if ((((~j25) << c15) & j25 & j15) != j15) {
                        int i35 = 8 - ((~(i29 - length2)) >>> 31);
                        int i36 = i17;
                        while (i36 < i35) {
                            if ((j25 & j17) < j16) {
                                int i37 = (i29 << 3) + i36;
                                Object obj = objArr3[i37];
                                List list = (List) objArr4[i37];
                                String str = (String) obj;
                                i16 = i19;
                                if (list.size() == 1) {
                                    Object objA = ((er.a) list.get(i17)).a();
                                    if (objA != null) {
                                        if (!b(objA)) {
                                            throw new IllegalStateException(f.e(objA).toString());
                                        }
                                        map.put(str, pq.v.g(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i17 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((er.a) list.get(i17)).a();
                                        if (objA2 != null && !b(objA2)) {
                                            throw new IllegalStateException(f.e(objA2).toString());
                                        }
                                        arrayList.add(objA2);
                                        i17++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i16 = i19;
                            }
                            j25 >>= i16;
                            i36++;
                            i19 = i16;
                            jArr4 = jArr2;
                            i17 = 0;
                        }
                        jArr = jArr4;
                        i15 = i19;
                        if (i35 != i15) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i15 = i19;
                    }
                    if (i29 == length2) {
                        break;
                    }
                    i29++;
                    i19 = i15;
                    jArr4 = jArr;
                    i17 = 0;
                }
            }
        }
        return map;
    }

    @Override // b3.r
    public Object f(String key) {
        t0<String, List<Object>> t0Var;
        t0<String, List<Object>> t0Var2 = this.restored;
        List<Object> listU = t0Var2 != null ? t0Var2.u(key) : null;
        List<Object> list = listU;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listU.size() > 1 && (t0Var = this.restored) != null) {
            t0Var.r(key, listU.subList(1, listU.size()));
        }
        return listU.get(0);
    }
}
