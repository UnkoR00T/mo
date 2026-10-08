package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import androidx.p016lifecycle.q;
import b3.u;
import c5.t;
import er.p;
import fr.w;
import g4.s1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a[\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Lf3/m;", "modifier", "Loq/i0;", "update", "b", "(Ler/l;Lf3/m;Ler/l;Lm2/r;II)V", "onReset", "onRelease", "a", "(Ler/l;Lf3/m;Ler/l;Ler/l;Ler/l;Lm2/r;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/g;", "d", "(Ler/l;Lm2/r;I)Ler/a;", "Lm2/n6;", "", "compositeKeyHash", "Lc5/d;", "density", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lua/j;", "savedStateRegistryOwner", "Lc5/t;", "layoutDirection", "Lm2/e0;", "compositionLocalMap", "g", "(Lm2/r;Lf3/m;ILc5/d;Landroidx/lifecycle/q;Lua/j;Lc5/t;Lm2/e0;)V", "Landroidx/compose/ui/viewinterop/o;", "f", "(Landroidx/compose/ui/node/g;)Landroidx/compose/ui/viewinterop/o;", "Ler/l;", "e", "()Ler/l;", "NoOpUpdate", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.l<View, i0> f10968a = h.f10986b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Context, T> f10969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f10970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<T, i0> f10971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super Context, ? extends T> lVar, f3.m mVar, er.l<? super T, i0> lVar2, int i15, int i16) {
            super(2);
            this.f10969b = lVar;
            this.f10970c = mVar;
            this.f10971d = lVar2;
            this.f10972e = i15;
            this.f10973f = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            e.b(this.f10969b, this.f10970c, this.f10971d, rVar, g4.a(this.f10972e | 1), this.f10973f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "Loq/i0;", "it", "c", "(Landroidx/compose/ui/node/g;Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class b<T> extends w implements p<androidx.compose.ui.node.g, er.l<? super T, ? extends i0>, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10974b = new b();

        b() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, Object obj) {
            c(gVar, (er.l) obj);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, er.l<? super T, i0> lVar) {
            e.f(gVar).setResetBlock(lVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "Loq/i0;", "it", "c", "(Landroidx/compose/ui/node/g;Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends w implements p<androidx.compose.ui.node.g, er.l<? super T, ? extends i0>, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10975b = new c();

        c() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, Object obj) {
            c(gVar, (er.l) obj);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, er.l<? super T, i0> lVar) {
            e.f(gVar).setUpdateBlock(lVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "Loq/i0;", "it", "c", "(Landroidx/compose/ui/node/g;Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class d<T> extends w implements p<androidx.compose.ui.node.g, er.l<? super T, ? extends i0>, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f10976b = new d();

        d() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, Object obj) {
            c(gVar, (er.l) obj);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, er.l<? super T, i0> lVar) {
            e.f(gVar).setReleaseBlock(lVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "Loq/i0;", "it", "c", "(Landroidx/compose/ui/node/g;Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0237e<T> extends w implements p<androidx.compose.ui.node.g, er.l<? super T, ? extends i0>, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0237e f10977b = new C0237e();

        C0237e() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, Object obj) {
            c(gVar, (er.l) obj);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, er.l<? super T, i0> lVar) {
            e.f(gVar).setUpdateBlock(lVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "Loq/i0;", "it", "c", "(Landroidx/compose/ui/node/g;Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class f<T> extends w implements p<androidx.compose.ui.node.g, er.l<? super T, ? extends i0>, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f10978b = new f();

        f() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, Object obj) {
            c(gVar, (er.l) obj);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, er.l<? super T, i0> lVar) {
            e.f(gVar).setReleaseBlock(lVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Context, T> f10979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f10980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<T, i0> f10981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.l<T, i0> f10982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<T, i0> f10983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10985h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(er.l<? super Context, ? extends T> lVar, f3.m mVar, er.l<? super T, i0> lVar2, er.l<? super T, i0> lVar3, er.l<? super T, i0> lVar4, int i15, int i16) {
            super(2);
            this.f10979b = lVar;
            this.f10980c = mVar;
            this.f10981d = lVar2;
            this.f10982e = lVar3;
            this.f10983f = lVar4;
            this.f10984g = i15;
            this.f10985h = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            e.a(this.f10979b, this.f10980c, this.f10981d, this.f10982e, this.f10983f, rVar, g4.a(this.f10984g | 1), this.f10985h);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Loq/i0;", "c", "(Landroid/view/View;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends w implements er.l<View, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f10986b = new h();

        h() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(View view) {
            c(view);
            return i0.f148189a;
        }

        public final void c(View view) {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/g;", "c", "()Landroidx/compose/ui/node/g;"}, k = 3, mv = {2, 1, 0})
    static final class i extends w implements er.a<androidx.compose.ui.node.g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f10987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<Context, T> f10988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f10989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.r f10990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f10992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, er.l<? super Context, ? extends T> lVar, v vVar, b3.r rVar, int i15, View view) {
            super(0);
            this.f10987b = context;
            this.f10988c = lVar;
            this.f10989d = vVar;
            this.f10990e = rVar;
            this.f10991f = i15;
            this.f10992g = view;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.node.g a() {
            return new o(this.f10987b, this.f10988c, this.f10989d, this.f10990e, this.f10991f, (Owner) this.f10992g).getLayoutNode();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Lf3/m;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Lf3/m;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends w implements p<androidx.compose.ui.node.g, f3.m, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f10993b = new j();

        j() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, f3.m mVar) {
            c(gVar, mVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, f3.m mVar) {
            e.f(gVar).setModifier(mVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Lc5/d;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Lc5/d;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends w implements p<androidx.compose.ui.node.g, c5.d, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f10994b = new k();

        k() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, c5.d dVar) {
            c(gVar, dVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, c5.d dVar) {
            e.f(gVar).setDensity(dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/lifecycle/q;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Landroidx/lifecycle/q;)V"}, k = 3, mv = {2, 1, 0})
    static final class l extends w implements p<androidx.compose.ui.node.g, q, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f10995b = new l();

        l() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, q qVar) {
            c(gVar, qVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, q qVar) {
            e.f(gVar).setLifecycleOwner(qVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Lua/j;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Lua/j;)V"}, k = 3, mv = {2, 1, 0})
    static final class m extends w implements p<androidx.compose.ui.node.g, ua.j, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f10996b = new m();

        m() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, ua.j jVar) {
            c(gVar, jVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, ua.j jVar) {
            e.f(gVar).setSavedStateRegistryOwner(jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Lc5/t;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Lc5/t;)V"}, k = 3, mv = {2, 1, 0})
    static final class n extends w implements p<androidx.compose.ui.node.g, t, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f10997b = new n();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10998a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f10998a = iArr;
            }
        }

        n() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(androidx.compose.ui.node.g gVar, t tVar) {
            c(gVar, tVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.g gVar, t tVar) {
            o oVarF = e.f(gVar);
            int i15 = a.f10998a[tVar.ordinal()];
            int i16 = 1;
            if (i15 == 1) {
                i16 = 0;
            } else if (i15 != 2) {
                throw new oq.p();
            }
            oVarF.setLayoutDirection(i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0159  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void a(er.l<? super Context, ? extends T> lVar, f3.m mVar, er.l<? super T, i0> lVar2, er.l<? super T, i0> lVar3, er.l<? super T, i0> lVar4, r rVar, int i15, int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        er.l<? super T, i0> lVar5;
        int i19;
        int i25;
        er.l<? super T, i0> lVar6;
        int i26;
        int i27;
        er.l<? super T, i0> lVar7;
        int i28;
        boolean z15;
        f3.m mVar3;
        er.l<? super T, i0> lVar8;
        er.l<? super T, i0> lVar9;
        d5 d5VarM;
        int iHashCode;
        f3.m mVarE;
        c5.d dVar;
        t tVar;
        e0 e0VarT;
        q qVar;
        ua.j jVar;
        er.a<androidx.compose.ui.node.g> aVarD;
        er.a<androidx.compose.ui.node.g> aVarD2;
        r rVarH = rVar.h(-180024211);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    lVar5 = lVar2;
                    if (rVarH.G(lVar5)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        lVar6 = lVar3;
                        if (rVarH.G(lVar6)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((i15 & 24576) == 0) {
                            lVar7 = lVar4;
                            if (rVarH.G(lVar7)) {
                                i28 = 16384;
                            } else {
                                i28 = PKIFailureInfo.certRevoked;
                            }
                            i17 |= i28;
                        }
                        if ((i17 & 9363) != 9362) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i29 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar2;
                            }
                            if (i18 != 0) {
                                lVar5 = null;
                            }
                            if (i25 != 0) {
                                lVar6 = f10968a;
                            }
                            if (i27 != 0) {
                                lVar7 = f10968a;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                            mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                            dVar = (c5.d) rVarH.N(g1.f());
                            tVar = (t) rVarH.N(g1.l());
                            e0VarT = rVarH.t();
                            qVar = (q) rVarH.N(m7.n.c());
                            jVar = (ua.j) rVarH.N(va.b.c());
                            if (lVar5 != null) {
                                rVarH.X(1313917368);
                                aVarD2 = d(lVar, rVarH, i17 & 14);
                                if (!(rVarH.l() instanceof s1)) {
                                    p076m2.m.d();
                                }
                                rVarH.K();
                                if (rVarH.getInserting()) {
                                    rVarH.H(aVarD2);
                                } else {
                                    rVarH.u();
                                }
                                r rVarC = n6.c(rVarH);
                                g(rVarC, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                                n6.i(rVarC, lVar5, b.f10974b);
                                n6.i(rVarC, lVar7, c.f10975b);
                                n6.i(rVarC, lVar6, d.f10976b);
                                rVarH.x();
                                rVarH.R();
                            } else {
                                rVarH.X(1314774735);
                                aVarD = d(lVar, rVarH, i17 & 14);
                                if (!(rVarH.l() instanceof s1)) {
                                    p076m2.m.d();
                                }
                                rVarH.n();
                                if (rVarH.getInserting()) {
                                    rVarH.H(aVarD);
                                } else {
                                    rVarH.u();
                                }
                                r rVarC2 = n6.c(rVarH);
                                g(rVarC2, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                                n6.i(rVarC2, lVar7, C0237e.f10977b);
                                n6.i(rVarC2, lVar6, f.f10978b);
                                rVarH.x();
                                rVarH.R();
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                        }
                        lVar8 = lVar5;
                        lVar9 = lVar7;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                        }
                    }
                    i17 |= 24576;
                    lVar7 = lVar4;
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i29 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            lVar5 = null;
                        }
                        if (i25 != 0) {
                            lVar6 = f10968a;
                        }
                        if (i27 != 0) {
                            lVar7 = f10968a;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                        dVar = (c5.d) rVarH.N(g1.f());
                        tVar = (t) rVarH.N(g1.l());
                        e0VarT = rVarH.t();
                        qVar = (q) rVarH.N(m7.n.c());
                        jVar = (ua.j) rVarH.N(va.b.c());
                        if (lVar5 != null) {
                            rVarH.X(1313917368);
                            aVarD2 = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD2);
                            } else {
                                rVarH.u();
                            }
                            r rVarC3 = n6.c(rVarH);
                            g(rVarC3, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC3, lVar5, b.f10974b);
                            n6.i(rVarC3, lVar7, c.f10975b);
                            n6.i(rVarC3, lVar6, d.f10976b);
                            rVarH.x();
                            rVarH.R();
                        } else {
                            rVarH.X(1314774735);
                            aVarD = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.n();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD);
                            } else {
                                rVarH.u();
                            }
                            r rVarC4 = n6.c(rVarH);
                            g(rVarC4, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC4, lVar7, C0237e.f10977b);
                            n6.i(rVarC4, lVar6, f.f10978b);
                            rVarH.x();
                            rVarH.R();
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                    }
                    lVar8 = lVar5;
                    lVar9 = lVar7;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                    }
                }
                i17 |= 3072;
                lVar6 = lVar3;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (rVarH.G(lVar7)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i29 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            lVar5 = null;
                        }
                        if (i25 != 0) {
                            lVar6 = f10968a;
                        }
                        if (i27 != 0) {
                            lVar7 = f10968a;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                        dVar = (c5.d) rVarH.N(g1.f());
                        tVar = (t) rVarH.N(g1.l());
                        e0VarT = rVarH.t();
                        qVar = (q) rVarH.N(m7.n.c());
                        jVar = (ua.j) rVarH.N(va.b.c());
                        if (lVar5 != null) {
                            rVarH.X(1313917368);
                            aVarD2 = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD2);
                            } else {
                                rVarH.u();
                            }
                            r rVarC5 = n6.c(rVarH);
                            g(rVarC5, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC5, lVar5, b.f10974b);
                            n6.i(rVarC5, lVar7, c.f10975b);
                            n6.i(rVarC5, lVar6, d.f10976b);
                            rVarH.x();
                            rVarH.R();
                        } else {
                            rVarH.X(1314774735);
                            aVarD = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.n();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD);
                            } else {
                                rVarH.u();
                            }
                            r rVarC6 = n6.c(rVarH);
                            g(rVarC6, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC6, lVar7, C0237e.f10977b);
                            n6.i(rVarC6, lVar6, f.f10978b);
                            rVarH.x();
                            rVarH.R();
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                    }
                    lVar8 = lVar5;
                    lVar9 = lVar7;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                    }
                }
                i17 |= 24576;
                lVar7 = lVar4;
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC7 = n6.c(rVarH);
                        g(rVarC7, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC7, lVar5, b.f10974b);
                        n6.i(rVarC7, lVar7, c.f10975b);
                        n6.i(rVarC7, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC8 = n6.c(rVarH);
                        g(rVarC8, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC8, lVar7, C0237e.f10977b);
                        n6.i(rVarC8, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            lVar5 = lVar2;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar6 = lVar3;
                    if (rVarH.G(lVar6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (rVarH.G(lVar7)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i29 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            lVar5 = null;
                        }
                        if (i25 != 0) {
                            lVar6 = f10968a;
                        }
                        if (i27 != 0) {
                            lVar7 = f10968a;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                        dVar = (c5.d) rVarH.N(g1.f());
                        tVar = (t) rVarH.N(g1.l());
                        e0VarT = rVarH.t();
                        qVar = (q) rVarH.N(m7.n.c());
                        jVar = (ua.j) rVarH.N(va.b.c());
                        if (lVar5 != null) {
                            rVarH.X(1313917368);
                            aVarD2 = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD2);
                            } else {
                                rVarH.u();
                            }
                            r rVarC9 = n6.c(rVarH);
                            g(rVarC9, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC9, lVar5, b.f10974b);
                            n6.i(rVarC9, lVar7, c.f10975b);
                            n6.i(rVarC9, lVar6, d.f10976b);
                            rVarH.x();
                            rVarH.R();
                        } else {
                            rVarH.X(1314774735);
                            aVarD = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.n();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD);
                            } else {
                                rVarH.u();
                            }
                            r rVarC10 = n6.c(rVarH);
                            g(rVarC10, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC10, lVar7, C0237e.f10977b);
                            n6.i(rVarC10, lVar6, f.f10978b);
                            rVarH.x();
                            rVarH.R();
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                    }
                    lVar8 = lVar5;
                    lVar9 = lVar7;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                    }
                }
                i17 |= 24576;
                lVar7 = lVar4;
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC11 = n6.c(rVarH);
                        g(rVarC11, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC11, lVar5, b.f10974b);
                        n6.i(rVarC11, lVar7, c.f10975b);
                        n6.i(rVarC11, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC12 = n6.c(rVarH);
                        g(rVarC12, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC12, lVar7, C0237e.f10977b);
                        n6.i(rVarC12, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= 3072;
            lVar6 = lVar3;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (rVarH.G(lVar7)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC13 = n6.c(rVarH);
                        g(rVarC13, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC13, lVar5, b.f10974b);
                        n6.i(rVarC13, lVar7, c.f10975b);
                        n6.i(rVarC13, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC14 = n6.c(rVarH);
                        g(rVarC14, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC14, lVar7, C0237e.f10977b);
                        n6.i(rVarC14, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= 24576;
            lVar7 = lVar4;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar5 = null;
                }
                if (i25 != 0) {
                    lVar6 = f10968a;
                }
                if (i27 != 0) {
                    lVar7 = f10968a;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                dVar = (c5.d) rVarH.N(g1.f());
                tVar = (t) rVarH.N(g1.l());
                e0VarT = rVarH.t();
                qVar = (q) rVarH.N(m7.n.c());
                jVar = (ua.j) rVarH.N(va.b.c());
                if (lVar5 != null) {
                    rVarH.X(1313917368);
                    aVarD2 = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC15 = n6.c(rVarH);
                    g(rVarC15, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC15, lVar5, b.f10974b);
                    n6.i(rVarC15, lVar7, c.f10975b);
                    n6.i(rVarC15, lVar6, d.f10976b);
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1314774735);
                    aVarD = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.n();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD);
                    } else {
                        rVarH.u();
                    }
                    r rVarC16 = n6.c(rVarH);
                    g(rVarC16, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC16, lVar7, C0237e.f10977b);
                    n6.i(rVarC16, lVar6, f.f10978b);
                    rVarH.x();
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar8 = lVar5;
            lVar9 = lVar7;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                lVar5 = lVar2;
                if (rVarH.G(lVar5)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar6 = lVar3;
                    if (rVarH.G(lVar6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (rVarH.G(lVar7)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i29 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            lVar5 = null;
                        }
                        if (i25 != 0) {
                            lVar6 = f10968a;
                        }
                        if (i27 != 0) {
                            lVar7 = f10968a;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                        dVar = (c5.d) rVarH.N(g1.f());
                        tVar = (t) rVarH.N(g1.l());
                        e0VarT = rVarH.t();
                        qVar = (q) rVarH.N(m7.n.c());
                        jVar = (ua.j) rVarH.N(va.b.c());
                        if (lVar5 != null) {
                            rVarH.X(1313917368);
                            aVarD2 = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD2);
                            } else {
                                rVarH.u();
                            }
                            r rVarC17 = n6.c(rVarH);
                            g(rVarC17, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC17, lVar5, b.f10974b);
                            n6.i(rVarC17, lVar7, c.f10975b);
                            n6.i(rVarC17, lVar6, d.f10976b);
                            rVarH.x();
                            rVarH.R();
                        } else {
                            rVarH.X(1314774735);
                            aVarD = d(lVar, rVarH, i17 & 14);
                            if (!(rVarH.l() instanceof s1)) {
                                p076m2.m.d();
                            }
                            rVarH.n();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarD);
                            } else {
                                rVarH.u();
                            }
                            r rVarC18 = n6.c(rVarH);
                            g(rVarC18, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                            n6.i(rVarC18, lVar7, C0237e.f10977b);
                            n6.i(rVarC18, lVar6, f.f10978b);
                            rVarH.x();
                            rVarH.R();
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                    }
                    lVar8 = lVar5;
                    lVar9 = lVar7;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                    }
                }
                i17 |= 24576;
                lVar7 = lVar4;
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC19 = n6.c(rVarH);
                        g(rVarC19, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC19, lVar5, b.f10974b);
                        n6.i(rVarC19, lVar7, c.f10975b);
                        n6.i(rVarC19, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC110 = n6.c(rVarH);
                        g(rVarC110, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC110, lVar7, C0237e.f10977b);
                        n6.i(rVarC110, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= 3072;
            lVar6 = lVar3;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (rVarH.G(lVar7)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC111 = n6.c(rVarH);
                        g(rVarC111, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC111, lVar5, b.f10974b);
                        n6.i(rVarC111, lVar7, c.f10975b);
                        n6.i(rVarC111, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC112 = n6.c(rVarH);
                        g(rVarC112, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC112, lVar7, C0237e.f10977b);
                        n6.i(rVarC112, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= 24576;
            lVar7 = lVar4;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar5 = null;
                }
                if (i25 != 0) {
                    lVar6 = f10968a;
                }
                if (i27 != 0) {
                    lVar7 = f10968a;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                dVar = (c5.d) rVarH.N(g1.f());
                tVar = (t) rVarH.N(g1.l());
                e0VarT = rVarH.t();
                qVar = (q) rVarH.N(m7.n.c());
                jVar = (ua.j) rVarH.N(va.b.c());
                if (lVar5 != null) {
                    rVarH.X(1313917368);
                    aVarD2 = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC113 = n6.c(rVarH);
                    g(rVarC113, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC113, lVar5, b.f10974b);
                    n6.i(rVarC113, lVar7, c.f10975b);
                    n6.i(rVarC113, lVar6, d.f10976b);
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1314774735);
                    aVarD = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.n();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD);
                    } else {
                        rVarH.u();
                    }
                    r rVarC114 = n6.c(rVarH);
                    g(rVarC114, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC114, lVar7, C0237e.f10977b);
                    n6.i(rVarC114, lVar6, f.f10978b);
                    rVarH.x();
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar8 = lVar5;
            lVar9 = lVar7;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        lVar5 = lVar2;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                lVar6 = lVar3;
                if (rVarH.G(lVar6)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (rVarH.G(lVar7)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar5 = null;
                    }
                    if (i25 != 0) {
                        lVar6 = f10968a;
                    }
                    if (i27 != 0) {
                        lVar7 = f10968a;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                    dVar = (c5.d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    e0VarT = rVarH.t();
                    qVar = (q) rVarH.N(m7.n.c());
                    jVar = (ua.j) rVarH.N(va.b.c());
                    if (lVar5 != null) {
                        rVarH.X(1313917368);
                        aVarD2 = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD2);
                        } else {
                            rVarH.u();
                        }
                        r rVarC115 = n6.c(rVarH);
                        g(rVarC115, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC115, lVar5, b.f10974b);
                        n6.i(rVarC115, lVar7, c.f10975b);
                        n6.i(rVarC115, lVar6, d.f10976b);
                        rVarH.x();
                        rVarH.R();
                    } else {
                        rVarH.X(1314774735);
                        aVarD = d(lVar, rVarH, i17 & 14);
                        if (!(rVarH.l() instanceof s1)) {
                            p076m2.m.d();
                        }
                        rVarH.n();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarD);
                        } else {
                            rVarH.u();
                        }
                        r rVarC116 = n6.c(rVarH);
                        g(rVarC116, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                        n6.i(rVarC116, lVar7, C0237e.f10977b);
                        n6.i(rVarC116, lVar6, f.f10978b);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar8 = lVar5;
                lVar9 = lVar7;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
                }
            }
            i17 |= 24576;
            lVar7 = lVar4;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar5 = null;
                }
                if (i25 != 0) {
                    lVar6 = f10968a;
                }
                if (i27 != 0) {
                    lVar7 = f10968a;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                dVar = (c5.d) rVarH.N(g1.f());
                tVar = (t) rVarH.N(g1.l());
                e0VarT = rVarH.t();
                qVar = (q) rVarH.N(m7.n.c());
                jVar = (ua.j) rVarH.N(va.b.c());
                if (lVar5 != null) {
                    rVarH.X(1313917368);
                    aVarD2 = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC117 = n6.c(rVarH);
                    g(rVarC117, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC117, lVar5, b.f10974b);
                    n6.i(rVarC117, lVar7, c.f10975b);
                    n6.i(rVarC117, lVar6, d.f10976b);
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1314774735);
                    aVarD = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.n();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD);
                    } else {
                        rVarH.u();
                    }
                    r rVarC118 = n6.c(rVarH);
                    g(rVarC118, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC118, lVar7, C0237e.f10977b);
                    n6.i(rVarC118, lVar6, f.f10978b);
                    rVarH.x();
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar8 = lVar5;
            lVar9 = lVar7;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
            }
        }
        i17 |= 3072;
        lVar6 = lVar3;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((i15 & 24576) == 0) {
                lVar7 = lVar4;
                if (rVarH.G(lVar7)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar5 = null;
                }
                if (i25 != 0) {
                    lVar6 = f10968a;
                }
                if (i27 != 0) {
                    lVar7 = f10968a;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
                dVar = (c5.d) rVarH.N(g1.f());
                tVar = (t) rVarH.N(g1.l());
                e0VarT = rVarH.t();
                qVar = (q) rVarH.N(m7.n.c());
                jVar = (ua.j) rVarH.N(va.b.c());
                if (lVar5 != null) {
                    rVarH.X(1313917368);
                    aVarD2 = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC119 = n6.c(rVarH);
                    g(rVarC119, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC119, lVar5, b.f10974b);
                    n6.i(rVarC119, lVar7, c.f10975b);
                    n6.i(rVarC119, lVar6, d.f10976b);
                    rVarH.x();
                    rVarH.R();
                } else {
                    rVarH.X(1314774735);
                    aVarD = d(lVar, rVarH, i17 & 14);
                    if (!(rVarH.l() instanceof s1)) {
                        p076m2.m.d();
                    }
                    rVarH.n();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarD);
                    } else {
                        rVarH.u();
                    }
                    r rVarC1110 = n6.c(rVarH);
                    g(rVarC1110, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                    n6.i(rVarC1110, lVar7, C0237e.f10977b);
                    n6.i(rVarC1110, lVar6, f.f10978b);
                    rVarH.x();
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar8 = lVar5;
            lVar9 = lVar7;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
            }
        }
        i17 |= 24576;
        lVar7 = lVar4;
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i29 != 0) {
                mVar3 = f3.m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i18 != 0) {
                lVar5 = null;
            }
            if (i25 != 0) {
                lVar6 = f10968a;
            }
            if (i27 != 0) {
                lVar7 = f10968a;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-180024211, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
            }
            iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            mVarE = f3.j.e(rVarH, androidx.compose.ui.viewinterop.h.e(mVar3));
            dVar = (c5.d) rVarH.N(g1.f());
            tVar = (t) rVarH.N(g1.l());
            e0VarT = rVarH.t();
            qVar = (q) rVarH.N(m7.n.c());
            jVar = (ua.j) rVarH.N(va.b.c());
            if (lVar5 != null) {
                rVarH.X(1313917368);
                aVarD2 = d(lVar, rVarH, i17 & 14);
                if (!(rVarH.l() instanceof s1)) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarD2);
                } else {
                    rVarH.u();
                }
                r rVarC1111 = n6.c(rVarH);
                g(rVarC1111, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                n6.i(rVarC1111, lVar5, b.f10974b);
                n6.i(rVarC1111, lVar7, c.f10975b);
                n6.i(rVarC1111, lVar6, d.f10976b);
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(1314774735);
                aVarD = d(lVar, rVarH, i17 & 14);
                if (!(rVarH.l() instanceof s1)) {
                    p076m2.m.d();
                }
                rVarH.n();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarD);
                } else {
                    rVarH.u();
                }
                r rVarC1112 = n6.c(rVarH);
                g(rVarC1112, mVarE, iHashCode, dVar, qVar, jVar, tVar, e0VarT);
                n6.i(rVarC1112, lVar7, C0237e.f10977b);
                n6.i(rVarC1112, lVar6, f.f10978b);
                rVarH.x();
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        lVar8 = lVar5;
        lVar9 = lVar7;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new g(lVar, mVar3, lVar8, lVar6, lVar9, i15, i16));
        }
    }

    public static final <T extends View> void b(er.l<? super Context, ? extends T> lVar, f3.m mVar, er.l<? super T, i0> lVar2, r rVar, int i15, int i16) {
        int i17;
        f3.m mVar2;
        er.l<? super T, i0> lVar3;
        r rVarH = rVar.h(-1783766393);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            f3.m mVar3 = mVar;
            er.l<? super T, i0> lVar4 = i19 != 0 ? f10968a : lVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(-1783766393, i17, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            a(lVar, mVar3, null, f10968a, lVar4, rVarH, (i17 & 14) | 3072 | (i17 & 112) | (57344 & (i17 << 6)), 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar3;
            lVar3 = lVar4;
        } else {
            rVarH.O();
            mVar2 = mVar;
            lVar3 = lVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new a(lVar, mVar2, lVar3, i15, i16));
        }
    }

    private static final <T extends View> er.a<androidx.compose.ui.node.g> d(er.l<? super Context, ? extends T> lVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2030558801, i15, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        v vVarE = p076m2.m.e(rVar, 0);
        b3.r rVar2 = (b3.r) rVar.N(u.g());
        View view = (View) rVar.N(AndroidCompositionLocals_androidKt.g());
        boolean zG = rVar.G(context) | ((((i15 & 14) ^ 6) > 4 && rVar.W(lVar)) || (i15 & 6) == 4) | rVar.G(vVarE) | rVar.G(rVar2) | rVar.c(iHashCode) | rVar.G(view);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            Object iVar = new i(context, lVar, vVarE, rVar2, iHashCode, view);
            rVar.v(iVar);
            objE = iVar;
        }
        er.a<androidx.compose.ui.node.g> aVar = (er.a) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aVar;
    }

    public static final er.l<View, i0> e() {
        return f10968a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> o<T> f(androidx.compose.ui.node.g gVar) {
        androidx.compose.ui.viewinterop.b interopViewFactoryHolder = gVar.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (o) interopViewFactoryHolder;
        }
        d4.a.d("Required value was null.");
        throw new oq.g();
    }

    private static final <T extends View> void g(r rVar, f3.m mVar, int i15, c5.d dVar, q qVar, ua.j jVar, t tVar, e0 e0Var) {
        androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
        n6.i(rVar, e0Var, companion.f());
        n6.i(rVar, mVar, j.f10993b);
        n6.i(rVar, dVar, k.f10994b);
        n6.i(rVar, qVar, l.f10995b);
        n6.i(rVar, jVar, m.f10996b);
        n6.i(rVar, tVar, n.f10997b);
        n6.i(rVar, Integer.valueOf(i15), companion.c());
    }
}
