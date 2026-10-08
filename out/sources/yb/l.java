package yb;

import ac.n;
import er.q;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyb/l;", "", "", "Lzb/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Lac/n;", "trackers", "(Lac/n;)V", "Lcc/i0;", "spec", "Lmu/g;", "Lyb/b;", "a", "(Lcc/i0;)Lmu/g;", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<zb.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements mu.g<yb.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g[] f225944a;

        /* JADX INFO: renamed from: yb.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C6053a implements er.a<yb.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g[] f225945a;

            public C6053a(mu.g[] gVarArr) {
                this.f225945a = gVarArr;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final yb.b[] a() {
                return new yb.b[this.f225945a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lmu/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        public static final class b extends vq.k implements q<mu.h<? super yb.b>, yb.b[], tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f225946e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f225947f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f225948g;

            public b(tq.e eVar) {
                super(3, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                yb.b bVar;
                Object objE = uq.b.e();
                int i15 = this.f225946e;
                if (i15 == 0) {
                    u.b(obj);
                    mu.h hVar = (mu.h) this.f225947f;
                    yb.b[] bVarArr = (yb.b[]) ((Object[]) this.f225948g);
                    int length = bVarArr.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i16];
                        if (!t.c(bVar, yb.b.a.f225911a)) {
                            break;
                        }
                        i16++;
                    }
                    if (bVar == null) {
                        bVar = yb.b.a.f225911a;
                    }
                    this.f225946e = 1;
                    if (hVar.F(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.q
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object w(mu.h<? super yb.b> hVar, yb.b[] bVarArr, tq.e<? super i0> eVar) {
                b bVar = new b(eVar);
                bVar.f225947f = hVar;
                bVar.f225948g = bVarArr;
                return bVar.J(i0.f148189a);
            }
        }

        public a(mu.g[] gVarArr) {
            this.f225944a = gVarArr;
        }

        @Override // mu.g
        public Object a(mu.h<? super yb.b> hVar, tq.e eVar) {
            mu.g[] gVarArr = this.f225944a;
            Object objA = p086nu.m.a(hVar, gVarArr, new C6053a(gVarArr), new b(null), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends zb.e> list) {
        this.controllers = list;
    }

    public final mu.g<b> a(cc.i0 spec) {
        List<zb.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zb.e) obj).b(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zb.e) it.next()).a(spec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String));
        }
        return mu.i.p(new a((mu.g[]) v.f1(arrayList2).toArray(new mu.g[0])));
    }

    public l(n nVar) {
        this((List<? extends zb.e>) m.d(nVar));
    }
}
