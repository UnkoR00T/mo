package ja;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B7\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR<\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lja/o1;", "T1", "T2", "", "Lkotlin/Function4;", "Lja/h;", "Ltq/e;", "Loq/i0;", "send", "<init>", "(Ler/r;)V", "", "index", "value", "a", "(ILjava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Ler/r;", "Lju/x;", "b", "Lju/x;", "initialDispatched", "Lsu/a;", "c", "Lsu/a;", "lock", "", "d", "[Lju/x;", "valueReceived", "e", "[Ljava/lang/Object;", "values", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1<T1, T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.r<T1, T2, h, tq.e<? super oq.i0>, Object> send;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0> initialDispatched = ju.z.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final su.a lock = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0>[] valueReceived;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f101107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f101110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o1<T1, T2> f101111h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f101112j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1<T1, T2> o1Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f101111h = o1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101110g = obj;
            this.f101112j |= PKIFailureInfo.systemUnavail;
            return this.f101111h.a(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o1(er.r<? super T1, ? super T2, ? super h, ? super tq.e<? super oq.i0>, ? extends Object> rVar) {
        this.send = rVar;
        ju.x<oq.i0>[] xVarArr = new ju.x[2];
        for (int i15 = 0; i15 < 2; i15++) {
            xVarArr[i15] = ju.z.c(null, 1, null);
        }
        this.valueReceived = xVarArr;
        Object[] objArr = new Object[2];
        for (int i16 = 0; i16 < 2; i16++) {
            objArr[i16] = n.f101056a;
        }
        this.values = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: all -> 0x00a5, LOOP:0: B:33:0x0096->B:37:0x00a2, LOOP_END, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x00a5, LOOP:1: B:42:0x00b1->B:46:0x00bd, LOOP_END, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i15, Object obj, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        Object obj2;
        su.a aVar2;
        Throwable th4;
        su.a aVar3;
        Object[] objArr;
        int length;
        int i16;
        boolean z15;
        Object[] objArr2;
        int length2;
        int i17;
        h hVar;
        er.r<T1, T2, h, tq.e<? super oq.i0>, Object> rVar;
        Object obj3;
        Object obj4;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i18 = aVar.f101112j;
            if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f101112j = i18 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj5 = aVar.f101110g;
        Object objE = uq.b.e();
        int i19 = aVar.f101112j;
        if (i19 == 0) {
            oq.u.b(obj5);
            if (this.valueReceived[i15].r()) {
                ju.x<oq.i0> xVar = this.initialDispatched;
                aVar.f101108e = obj;
                aVar.f101107d = i15;
                aVar.f101112j = 1;
                if (xVar.I(aVar) != objE) {
                }
                return objE;
            }
            vq.b.a(this.valueReceived[i15].d0(oq.i0.f148189a));
        } else {
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (su.a) aVar.f101108e;
                    try {
                        oq.u.b(obj5);
                        this.initialDispatched.d0(oq.i0.f148189a);
                        oq.i0 i0Var = oq.i0.f148189a;
                        aVar3.r(null);
                        return oq.i0.f148189a;
                    } catch (Throwable th5) {
                        th4 = th5;
                        aVar3.r(null);
                        throw th4;
                    }
                }
                i15 = aVar.f101107d;
                aVar2 = (su.a) aVar.f101109f;
                obj2 = aVar.f101108e;
                oq.u.b(obj5);
                try {
                    objArr = this.values;
                    length = objArr.length;
                    i16 = 0;
                    while (true) {
                        if (i16 < length) {
                            z15 = false;
                            break;
                        }
                        if (objArr[i16] == n.f101056a) {
                            z15 = true;
                            break;
                        }
                        i16++;
                    }
                    objArr2 = this.values;
                    objArr2[i15] = obj2;
                    length2 = objArr2.length;
                    i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            if (z15) {
                                hVar = h.INITIAL;
                            } else if (i15 == 0) {
                                hVar = h.RECEIVER;
                            } else {
                                hVar = h.OTHER;
                            }
                            rVar = this.send;
                            Object[] objArr3 = this.values;
                            obj3 = objArr3[0];
                            obj4 = objArr3[1];
                            aVar.f101108e = aVar2;
                            aVar.f101109f = null;
                            aVar.f101112j = 3;
                            if (rVar.g((T1) obj3, (T2) obj4, hVar, aVar) != objE) {
                                aVar3 = aVar2;
                                this.initialDispatched.d0(oq.i0.f148189a);
                                break;
                            }
                            return objE;
                        }
                        if (objArr2[i17] == n.f101056a) {
                            aVar3 = aVar2;
                            break;
                        }
                        i17++;
                    }
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    aVar3.r(null);
                    return oq.i0.f148189a;
                } catch (Throwable th6) {
                    su.a aVar4 = aVar2;
                    th4 = th6;
                    aVar3 = aVar4;
                    aVar3.r(null);
                    throw th4;
                }
            }
            i15 = aVar.f101107d;
            obj = aVar.f101108e;
            oq.u.b(obj5);
        }
        su.a aVar5 = this.lock;
        aVar.f101108e = obj;
        aVar.f101109f = aVar5;
        aVar.f101107d = i15;
        aVar.f101112j = 2;
        if (aVar5.h(null, aVar) != objE) {
            obj2 = obj;
            aVar2 = aVar5;
            objArr = this.values;
            length = objArr.length;
            i16 = 0;
            while (true) {
                if (i16 < length) {
                    z15 = false;
                    break;
                }
                if (objArr[i16] == n.f101056a) {
                    z15 = true;
                    break;
                }
                i16++;
            }
            objArr2 = this.values;
            objArr2[i15] = obj2;
            length2 = objArr2.length;
            i17 = 0;
            while (true) {
                if (i17 < length2) {
                    if (z15) {
                        hVar = h.INITIAL;
                    } else if (i15 == 0) {
                        hVar = h.RECEIVER;
                    } else {
                        hVar = h.OTHER;
                    }
                    rVar = this.send;
                    Object[] objArr4 = this.values;
                    obj3 = objArr4[0];
                    obj4 = objArr4[1];
                    aVar.f101108e = aVar2;
                    aVar.f101109f = null;
                    aVar.f101112j = 3;
                    if (rVar.g((T1) obj3, (T2) obj4, hVar, aVar) != objE) {
                        aVar3 = aVar2;
                        this.initialDispatched.d0(oq.i0.f148189a);
                        break;
                    }
                } else {
                    if (objArr2[i17] == n.f101056a) {
                        aVar3 = aVar2;
                        break;
                    }
                    i17++;
                }
            }
            oq.i0 i0Var3 = oq.i0.f148189a;
            aVar3.r(null);
            return oq.i0.f148189a;
        }
        return objE;
    }
}
