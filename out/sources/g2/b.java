package g2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import ob.n;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm2/f6;", "", "Lob/c;", "a", "(Lm2/r;I)Lm2/f6;", "adaptive"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends ob.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f69771a;

        /* JADX INFO: renamed from: g2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
        public static final class C1570a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f69772a;

            /* JADX INFO: renamed from: g2.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1571a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f69773d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f69774e;

                public C1571a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f69773d = obj;
                    this.f69774e |= PKIFailureInfo.systemUnavail;
                    return C1570a.this.F(null, this);
                }
            }

            public C1570a(mu.h hVar) {
                this.f69772a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1571a c1571a;
                if (eVar instanceof C1571a) {
                    c1571a = (C1571a) eVar;
                    int i15 = c1571a.f69774e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1571a.f69774e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1571a = new C1571a(eVar);
                    }
                } else {
                    c1571a = new C1571a(eVar);
                }
                Object obj2 = c1571a.f69773d;
                Object objE = uq.b.e();
                int i16 = c1571a.f69774e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f69772a;
                    List<ob.a> listA = ((ob.u) obj).a();
                    ArrayList arrayList = new ArrayList();
                    for (T t15 : listA) {
                        if (t15 instanceof ob.c) {
                            arrayList.add(t15);
                        }
                    }
                    c1571a.f69774e = 1;
                    if (hVar.F(arrayList, c1571a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar) {
            this.f69771a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends ob.c>> hVar, tq.e eVar) {
            Object objA = this.f69771a.a(new C1570a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public static final f6<List<ob.c>> a(r rVar, int i15) {
        if (t.k()) {
            t.o(-883534959, i15, -1, "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:74)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        boolean zW = rVar.W(context);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new a(n.INSTANCE.d(context).b(context));
            rVar.v(objE);
        }
        f6<List<ob.c>> f6VarA = x5.a((mu.g) objE, v.n(), null, rVar, 48, 2);
        if (t.k()) {
            t.n();
        }
        return f6VarA;
    }
}
