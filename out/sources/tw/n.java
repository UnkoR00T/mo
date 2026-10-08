package tw;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.u0;
import h30.ButtonData;
import i40.DialogIconData;
import j30.ButtonTextData;
import mu.a0;
import mu.b0;
import mu.h0;
import mu.p0;
import mu.r0;
import mx.Label;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.r;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ltw/n;", "Landroidx/lifecycle/t0;", "", "<init>", "()V", "Lvw/a;", "Li40/a;", "j9", "(Lvw/a;)Li40/a;", "q9", "(Lvw/a;)Ljava/lang/Object;", "model", "Loq/i0;", "i9", "(Lvw/a;)V", "Lmu/a0;", "Ltw/d;", "b", "Lmu/a0;", "h9", "()Lmu/a0;", "navEvent", "Lmu/b0;", "Ltw/g;", "c", "Lmu/b0;", "_state", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0<d> navEvent = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<g> _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<g> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192500e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ NavigationDialogModel f192502g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NavigationDialogModel navigationDialogModel, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f192502g = navigationDialogModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192500e;
            if (i15 == 0) {
                u.b(obj);
                b0 b0Var = n.this._state;
                g.DataSet dataSet = new g.DataSet(n.this.j9(this.f192502g));
                this.f192500e = 1;
                if (b0Var.F(dataSet, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new a(this.f192502g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192503e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192503e;
            if (i15 == 0) {
                u.b(obj);
                a0<d> a0VarH9 = n.this.h9();
                d.a aVar = d.a.f192477a;
                this.f192503e = 1;
                if (a0VarH9.F(aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new b(eVar);
        }
    }

    public n() {
        b0<g> b0VarA = r0.a(g.b.f192482a);
        this._state = b0VarA;
        this.state = mu.i.b(b0VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i40.a j9(final NavigationDialogModel navigationDialogModel) {
        ButtonData buttonData;
        if (navigationDialogModel.getIcon() != null) {
            Label title = navigationDialogModel.getTitle();
            Label description = navigationDialogModel.getDescription();
            er.p<r, Integer, q4.e> pVarA = navigationDialogModel.a();
            DialogIconData icon = navigationDialogModel.getIcon();
            k30.d.c cVar = k30.d.c.f107775a;
            k30.c.WithText withText = new k30.c.WithText(navigationDialogModel.getPrimaryButton().getLabel(), null, 2, null);
            k30.a.b bVar = k30.a.b.f107765a;
            ButtonData buttonData2 = new ButtonData(null, null, bVar, withText, cVar, navigationDialogModel.getPrimaryButton().getButtonState(), new er.a() { // from class: tw.h
                @Override // er.a
                public final Object a() {
                    return n.k9(this.f192483a, navigationDialogModel);
                }
            }, 3, null);
            final ButtonTextData secondaryButton = navigationDialogModel.getSecondaryButton();
            return new i40.a.WithIcon(icon, null, title, description, pVarA, buttonData2, secondaryButton != null ? new ButtonData(null, null, bVar, new k30.c.WithText(secondaryButton.getLabel(), null, 2, null), cVar, secondaryButton.getButtonState(), new er.a() { // from class: tw.i
                @Override // er.a
                public final Object a() {
                    return n.l9(this.f192485a, navigationDialogModel, secondaryButton);
                }
            }, 3, null) : null, null, new er.a() { // from class: tw.j
                @Override // er.a
                public final Object a() {
                    return n.m9(navigationDialogModel, this);
                }
            }, 130, null);
        }
        Label title2 = navigationDialogModel.getTitle();
        Label description2 = navigationDialogModel.getDescription();
        er.p<r, Integer, q4.e> pVarA2 = navigationDialogModel.a();
        k30.d.c cVar2 = k30.d.c.f107775a;
        k30.c.WithText withText2 = new k30.c.WithText(navigationDialogModel.getPrimaryButton().getLabel(), null, 2, null);
        k30.a.b bVar2 = k30.a.b.f107765a;
        ButtonData buttonData3 = new ButtonData(null, null, bVar2, withText2, cVar2, navigationDialogModel.getPrimaryButton().getButtonState(), new er.a() { // from class: tw.k
            @Override // er.a
            public final Object a() {
                return n.n9(this.f192490a, navigationDialogModel);
            }
        }, 3, null);
        final ButtonTextData secondaryButton2 = navigationDialogModel.getSecondaryButton();
        if (secondaryButton2 != null) {
            buttonData = new ButtonData(null, null, bVar2, new k30.c.WithText(secondaryButton2.getLabel(), null, 2, null), cVar2, secondaryButton2.getButtonState(), new er.a() { // from class: tw.l
                @Override // er.a
                public final Object a() {
                    return n.o9(this.f192492a, navigationDialogModel, secondaryButton2);
                }
            }, 3, null);
        } else {
            buttonData = null;
        }
        return new i40.a.WithText(null, title2, description2, pVarA2, buttonData3, buttonData, null, new er.a() { // from class: tw.m
            @Override // er.a
            public final Object a() {
                return n.p9(navigationDialogModel, this);
            }
        }, 65, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(n nVar, NavigationDialogModel navigationDialogModel) {
        nVar.q9(navigationDialogModel);
        navigationDialogModel.getPrimaryButton().d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(n nVar, NavigationDialogModel navigationDialogModel, ButtonTextData buttonTextData) {
        nVar.q9(navigationDialogModel);
        buttonTextData.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(NavigationDialogModel navigationDialogModel, n nVar) {
        if (navigationDialogModel.getPopDestination() == NavigationDialogModel.EnumC5473a.ON_ANY_INTERACTION) {
            nVar.q9(navigationDialogModel);
        }
        er.a<i0> aVarD = navigationDialogModel.d();
        if (aVarD != null) {
            aVarD.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, NavigationDialogModel navigationDialogModel) {
        nVar.q9(navigationDialogModel);
        navigationDialogModel.getPrimaryButton().d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, NavigationDialogModel navigationDialogModel, ButtonTextData buttonTextData) {
        nVar.q9(navigationDialogModel);
        buttonTextData.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(NavigationDialogModel navigationDialogModel, n nVar) {
        if (navigationDialogModel.getPopDestination() == NavigationDialogModel.EnumC5473a.ON_ANY_INTERACTION) {
            nVar.q9(navigationDialogModel);
        }
        er.a<i0> aVarD = navigationDialogModel.d();
        if (aVarD != null) {
            aVarD.a();
        }
        return i0.f148189a;
    }

    private final Object q9(NavigationDialogModel navigationDialogModel) {
        return navigationDialogModel.getPopDestination() != NavigationDialogModel.EnumC5473a.NEVER ? ju.k.d(u0.a(this), null, null, new b(null), 3, null) : i0.f148189a;
    }

    public p0<g> getState() {
        return this.state;
    }

    public a0<d> h9() {
        return this.navEvent;
    }

    public final void i9(NavigationDialogModel model) {
        ju.k.d(u0.a(this), null, null, new a(model, null), 3, null);
    }
}
