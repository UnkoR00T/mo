package p114t0;

import c5.n;
import c5.r;
import c5.t;
import er.l;
import fr.w;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lt0/e;", "Le4/w0;", "Lt0/i;", "rootScope", "<init>", "(Lt0/i;)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "a", "Lt0/i;", "()Lt0/i;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<?> rootScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2[] f186277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f186278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f186279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f186280e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2[] a2VarArr, e eVar, int i15, int i16) {
            super(1);
            this.f186277b = a2VarArr;
            this.f186278c = eVar;
            this.f186279d = i15;
            this.f186280e = i16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2[] a2VarArr = this.f186277b;
            e eVar = this.f186278c;
            int i15 = this.f186279d;
            int i16 = this.f186280e;
            int length = a2VarArr.length;
            int i17 = 0;
            while (i17 < length) {
                a2 a2Var = a2VarArr[i17];
                if (a2Var != null) {
                    long jA = eVar.a().getContentAlignment().a(r.c((((long) a2Var.getWidth()) << 32) | (((long) a2Var.getHeight()) & BodyPartID.bodyIdMax)), r.c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32)), t.Ltr);
                    a2.a.E(aVar, a2Var, n.i(jA), n.j(jA), 0.0f, 4, null);
                }
                i17++;
                a2VarArr = a2VarArr;
            }
        }
    }

    public e(i<?> iVar) {
        this.rootScope = iVar;
    }

    public final i<?> a() {
        return this.rootScope;
    }

    @Override // p036e4.w0
    public int c(p036e4.w wVar, List<? extends v> list, int i15) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).e0(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).e0(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        a2 a2Var;
        int i15;
        a2 a2Var2;
        int width;
        int height;
        int size = list.size();
        a2[] a2VarArr = new a2[size];
        long jA = r.INSTANCE.a();
        List<? extends v0> list2 = list;
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            a2Var = null;
            i15 = 1;
            if (i16 >= size2) {
                break;
            }
            v0 v0Var = list.get(i16);
            Object parentData = v0Var.getParentData();
            i.a aVar = parentData instanceof i.a ? (i.a) parentData : null;
            if (aVar != null && aVar.a()) {
                a2 a2VarO0 = v0Var.o0(j15);
                long jC = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
                i0 i0Var = i0.f148189a;
                a2VarArr[i16] = a2VarO0;
                jA = jC;
            }
            i16++;
        }
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            v0 v0Var2 = list.get(i17);
            if (a2VarArr[i17] == null) {
                a2VarArr[i17] = v0Var2.o0(j15);
            }
        }
        if (y0Var.J0()) {
            width = (int) (jA >> 32);
        } else {
            if (size != 0) {
                a2Var2 = a2VarArr[0];
                int iV0 = pq.n.v0(a2VarArr);
                if (iV0 != 0) {
                    int width2 = a2Var2 != null ? a2Var2.getWidth() : 0;
                    if (1 <= iV0) {
                        int i18 = 1;
                        while (true) {
                            a2 a2Var3 = a2VarArr[i18];
                            int width3 = a2Var3 != null ? a2Var3.getWidth() : 0;
                            if (width2 < width3) {
                                a2Var2 = a2Var3;
                                width2 = width3;
                            }
                            if (i18 == iV0) {
                                break;
                            }
                            i18++;
                        }
                    }
                }
            } else {
                a2Var2 = null;
            }
            width = a2Var2 != null ? a2Var2.getWidth() : 0;
        }
        if (y0Var.J0()) {
            height = (int) (jA & BodyPartID.bodyIdMax);
        } else {
            if (size != 0) {
                a2Var = a2VarArr[0];
                int iV1 = pq.n.v0(a2VarArr);
                if (iV1 != 0) {
                    int height2 = a2Var != null ? a2Var.getHeight() : 0;
                    if (1 <= iV1) {
                        while (true) {
                            a2 a2Var4 = a2VarArr[i15];
                            int height3 = a2Var4 != null ? a2Var4.getHeight() : 0;
                            if (height2 < height3) {
                                a2Var = a2Var4;
                                height2 = height3;
                            }
                            if (i15 == iV1) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
            }
            height = a2Var != null ? a2Var.getHeight() : 0;
        }
        if (!y0Var.J0()) {
            this.rootScope.l(r.c((((long) width) << 32) | (((long) height) & BodyPartID.bodyIdMax)));
        }
        return y0.j2(y0Var, width, height, null, new a(a2VarArr, this, width, height), 4, null);
    }

    @Override // p036e4.w0
    public int f(p036e4.w wVar, List<? extends v> list, int i15) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).n(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).n(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p036e4.w0
    public int h(p036e4.w wVar, List<? extends v> list, int i15) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).U(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).U(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p036e4.w0
    public int i(p036e4.w wVar, List<? extends v> list, int i15) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).m0(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).m0(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
