package j6;

import android.view.View;
import android.view.ViewParent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroid/view/View;", "Leu/h;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)Leu/h;", "ancestors", "a", "allViews", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leu/j;", "Landroid/view/View;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.i implements er.p<eu.j<? super View>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f99742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f99743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f99744e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f99744e = view;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.d(r5, r4) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f99742c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f99743d
                eu.j r1 = (eu.j) r1
                oq.u.b(r5)
                goto L37
            L22:
                oq.u.b(r5)
                java.lang.Object r5 = r4.f99743d
                r1 = r5
                eu.j r1 = (eu.j) r1
                android.view.View r5 = r4.f99744e
                r4.f99743d = r1
                r4.f99742c = r3
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f99744e
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                eu.h r5 = j6.r0.b(r5)
                r3 = 0
                r4.f99743d = r3
                r4.f99742c = r2
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: j6.s0.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(eu.j<? super View> jVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(jVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f99744e, eVar);
            aVar.f99743d = obj;
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends fr.q implements er.l<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f99745j = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final ViewParent b(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final eu.h<View> a(View view) {
        return eu.k.b(new a(view, null));
    }

    public static final eu.h<ViewParent> b(View view) {
        return eu.k.o(view.getParent(), b.f99745j);
    }
}
