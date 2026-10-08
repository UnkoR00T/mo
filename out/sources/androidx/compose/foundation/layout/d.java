package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import fr.t;
import fr.w;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a;\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001b\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u0004\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\n\u001a'\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\n\u001a;\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010\u0004\u001a\u001d\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\u0004\u001a\u001d\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010\u0004\u001a'\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a'\u0010*\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020)2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b*\u0010+\u001a'\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b-\u0010.\u001a'\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b/\u0010\n\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101\"\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00108\"\u0014\u0010<\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108\"\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108\"\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010@\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108¨\u0006A"}, d2 = {"Lf3/m;", "Lc5/h;", "width", "y", "(Lf3/m;F)Lf3/m;", "height", "i", "size", "t", "v", "(Lf3/m;FF)Lf3/m;", "Lc5/k;", "u", "(Lf3/m;J)Lf3/m;", "min", "max", "z", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "w", "(Lf3/m;FFFF)Lf3/m;", "s", "l", "o", "p", "m", "q", "", "fraction", "g", "c", "e", "Lf3/c$b;", "align", "", "unbounded", "F", "(Lf3/m;Lf3/c$b;Z)Lf3/m;", "Lf3/c$c;", "B", "(Lf3/m;Lf3/c$c;Z)Lf3/m;", "Lf3/c;", ip.a.f96138c, "(Lf3/m;Lf3/c;Z)Lf3/m;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/j;", "d", "Landroidx/compose/foundation/layout/j;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FillElement f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FillElement f9644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FillElement f9645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.compose.foundation.layout.j f9651i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f15) {
            super(1);
            this.f9652b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("height");
            v1Var.c(c5.h.j(this.f9652b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f15, float f16) {
            super(1);
            this.f9653b = f15;
            this.f9654c = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("heightIn");
            v1Var.getProperties().b("min", c5.h.j(this.f9653b));
            v1Var.getProperties().b("max", c5.h.j(this.f9654c));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9655b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f15) {
            super(1);
            this.f9655b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredHeight");
            v1Var.c(c5.h.j(this.f9655b));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C0198d extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0198d(float f15, float f16) {
            super(1);
            this.f9656b = f15;
            this.f9657c = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredHeightIn");
            v1Var.getProperties().b("min", c5.h.j(this.f9656b));
            v1Var.getProperties().b("max", c5.h.j(this.f9657c));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f15) {
            super(1);
            this.f9658b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredSize");
            v1Var.c(c5.h.j(this.f9658b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f15, float f16) {
            super(1);
            this.f9659b = f15;
            this.f9660c = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredSize");
            v1Var.getProperties().b("width", c5.h.j(this.f9659b));
            v1Var.getProperties().b("height", c5.h.j(this.f9660c));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class g extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f9664e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f15, float f16, float f17, float f18) {
            super(1);
            this.f9661b = f15;
            this.f9662c = f16;
            this.f9663d = f17;
            this.f9664e = f18;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredSizeIn");
            v1Var.getProperties().b("minWidth", c5.h.j(this.f9661b));
            v1Var.getProperties().b("minHeight", c5.h.j(this.f9662c));
            v1Var.getProperties().b("maxWidth", c5.h.j(this.f9663d));
            v1Var.getProperties().b("maxHeight", c5.h.j(this.f9664e));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f15) {
            super(1);
            this.f9665b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("requiredWidth");
            v1Var.c(c5.h.j(this.f9665b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class i extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f15) {
            super(1);
            this.f9666b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("size");
            v1Var.c(c5.h.j(this.f9666b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class j extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f15, float f16) {
            super(1);
            this.f9667b = f15;
            this.f9668c = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("size");
            v1Var.getProperties().b("width", c5.h.j(this.f9667b));
            v1Var.getProperties().b("height", c5.h.j(this.f9668c));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class k extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f9672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f15, float f16, float f17, float f18) {
            super(1);
            this.f9669b = f15;
            this.f9670c = f16;
            this.f9671d = f17;
            this.f9672e = f18;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("sizeIn");
            v1Var.getProperties().b("minWidth", c5.h.j(this.f9669b));
            v1Var.getProperties().b("minHeight", c5.h.j(this.f9670c));
            v1Var.getProperties().b("maxWidth", c5.h.j(this.f9671d));
            v1Var.getProperties().b("maxHeight", c5.h.j(this.f9672e));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class l extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f15) {
            super(1);
            this.f9673b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("width");
            v1Var.c(c5.h.j(this.f9673b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class m extends w implements er.l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f9674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f15, float f16) {
            super(1);
            this.f9674b = f15;
            this.f9675c = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("widthIn");
            v1Var.getProperties().b("min", c5.h.j(this.f9674b));
            v1Var.getProperties().b("max", c5.h.j(this.f9675c));
        }
    }

    static {
        FillElement.Companion aVar = FillElement.INSTANCE;
        f9643a = aVar.c(1.0f);
        f9644b = aVar.a(1.0f);
        f9645c = aVar.b(1.0f);
        androidx.compose.foundation.layout.j.Companion aVar2 = androidx.compose.foundation.layout.j.INSTANCE;
        f3.c.Companion companion = f3.c.INSTANCE;
        f9646d = aVar2.h(companion.g(), false);
        f9647e = aVar2.h(companion.k(), false);
        f9648f = aVar2.d(companion.i(), false);
        f9649g = aVar2.d(companion.l(), false);
        f9650h = aVar2.f(companion.e(), false);
        f9651i = aVar2.f(companion.o(), false);
    }

    public static /* synthetic */ f3.m A(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        return z(mVar, f15, f16);
    }

    public static final f3.m B(f3.m mVar, f3.c.InterfaceC1317c interfaceC1317c, boolean z15) {
        androidx.compose.foundation.layout.j jVarD;
        f3.c.Companion companion = f3.c.INSTANCE;
        if (!t.c(interfaceC1317c, companion.i()) || z15) {
            jVarD = (!t.c(interfaceC1317c, companion.l()) || z15) ? androidx.compose.foundation.layout.j.INSTANCE.d(interfaceC1317c, z15) : f9649g;
        } else {
            jVarD = f9648f;
        }
        return mVar.u(jVarD);
    }

    public static /* synthetic */ f3.m C(f3.m mVar, f3.c.InterfaceC1317c interfaceC1317c, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            interfaceC1317c = f3.c.INSTANCE.i();
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return B(mVar, interfaceC1317c, z15);
    }

    public static final f3.m D(f3.m mVar, f3.c cVar, boolean z15) {
        androidx.compose.foundation.layout.j jVarF;
        f3.c.Companion companion = f3.c.INSTANCE;
        if (!t.c(cVar, companion.e()) || z15) {
            jVarF = (!t.c(cVar, companion.o()) || z15) ? androidx.compose.foundation.layout.j.INSTANCE.f(cVar, z15) : f9651i;
        } else {
            jVarF = f9650h;
        }
        return mVar.u(jVarF);
    }

    public static /* synthetic */ f3.m E(f3.m mVar, f3.c cVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = f3.c.INSTANCE.e();
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return D(mVar, cVar, z15);
    }

    public static final f3.m F(f3.m mVar, f3.c.b bVar, boolean z15) {
        androidx.compose.foundation.layout.j jVarH;
        f3.c.Companion companion = f3.c.INSTANCE;
        if (!t.c(bVar, companion.g()) || z15) {
            jVarH = (!t.c(bVar, companion.k()) || z15) ? androidx.compose.foundation.layout.j.INSTANCE.h(bVar, z15) : f9647e;
        } else {
            jVarH = f9646d;
        }
        return mVar.u(jVarH);
    }

    public static /* synthetic */ f3.m G(f3.m mVar, f3.c.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = f3.c.INSTANCE.g();
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return F(mVar, bVar, z15);
    }

    public static final f3.m a(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.g(f15, f16, null));
    }

    public static /* synthetic */ f3.m b(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        return a(mVar, f15, f16);
    }

    public static final f3.m c(f3.m mVar, float f15) {
        return mVar.u(f15 == 1.0f ? f9644b : FillElement.INSTANCE.a(f15));
    }

    public static /* synthetic */ f3.m d(f3.m mVar, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        return c(mVar, f15);
    }

    public static final f3.m e(f3.m mVar, float f15) {
        return mVar.u(f15 == 1.0f ? f9645c : FillElement.INSTANCE.b(f15));
    }

    public static /* synthetic */ f3.m f(f3.m mVar, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        return e(mVar, f15);
    }

    public static final f3.m g(f3.m mVar, float f15) {
        return mVar.u(f15 == 1.0f ? f9643a : FillElement.INSTANCE.c(f15));
    }

    public static /* synthetic */ f3.m h(f3.m mVar, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        return g(mVar, f15);
    }

    public static final f3.m i(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(0.0f, f15, 0.0f, f15, true, t1.b() ? new a(f15) : t1.a(), 5, null));
    }

    public static final f3.m j(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.c(0.0f, f15, 0.0f, f16, true, t1.b() ? new b(f15, f16) : t1.a(), 5, null));
    }

    public static /* synthetic */ f3.m k(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        return j(mVar, f15, f16);
    }

    public static final f3.m l(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(0.0f, f15, 0.0f, f15, false, t1.b() ? new c(f15) : t1.a(), 5, null));
    }

    public static final f3.m m(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.c(0.0f, f15, 0.0f, f16, false, t1.b() ? new C0198d(f15, f16) : t1.a(), 5, null));
    }

    public static /* synthetic */ f3.m n(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        return m(mVar, f15, f16);
    }

    public static final f3.m o(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f15, f15, f15, false, t1.b() ? new e(f15) : t1.a(), null));
    }

    public static final f3.m p(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f16, f15, f16, false, t1.b() ? new f(f15, f16) : t1.a(), null));
    }

    public static final f3.m q(f3.m mVar, float f15, float f16, float f17, float f18) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f16, f17, f18, false, t1.b() ? new g(f15, f16, f17, f18) : t1.a(), null));
    }

    public static /* synthetic */ f3.m r(f3.m mVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            f17 = c5.h.INSTANCE.c();
        }
        if ((i15 & 8) != 0) {
            f18 = c5.h.INSTANCE.c();
        }
        return q(mVar, f15, f16, f17, f18);
    }

    public static final f3.m s(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, 0.0f, f15, 0.0f, false, t1.b() ? new h(f15) : t1.a(), 10, null));
    }

    public static final f3.m t(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f15, f15, f15, true, t1.b() ? new i(f15) : t1.a(), null));
    }

    public static final f3.m u(f3.m mVar, long j15) {
        return v(mVar, c5.k.j(j15), c5.k.i(j15));
    }

    public static final f3.m v(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f16, f15, f16, true, t1.b() ? new j(f15, f16) : t1.a(), null));
    }

    public static final f3.m w(f3.m mVar, float f15, float f16, float f17, float f18) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, f16, f17, f18, true, t1.b() ? new k(f15, f16, f17, f18) : t1.a(), null));
    }

    public static /* synthetic */ f3.m x(f3.m mVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            f17 = c5.h.INSTANCE.c();
        }
        if ((i15 & 8) != 0) {
            f18 = c5.h.INSTANCE.c();
        }
        return w(mVar, f15, f16, f17, f18);
    }

    public static final f3.m y(f3.m mVar, float f15) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, 0.0f, f15, 0.0f, true, t1.b() ? new l(f15) : t1.a(), 10, null));
    }

    public static final f3.m z(f3.m mVar, float f15, float f16) {
        return mVar.u(new androidx.compose.foundation.layout.c(f15, 0.0f, f16, 0.0f, true, t1.b() ? new m(f15, f16) : t1.a(), 10, null));
    }
}
