package ww;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.u0;
import er.p;
import ju.d2;
import mu.a0;
import mu.b0;
import mu.h0;
import mu.p0;
import mu.r0;
import n70.BaseTimePickerData;
import n70.TimeResult;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lww/l;", "Landroidx/lifecycle/t0;", "Lww/i;", "", "<init>", "()V", "Lww/a;", "Ln70/a;", "f9", "(Lww/a;)Ln70/a;", "Lju/d2;", "d9", "()Lju/d2;", "model", "Loq/i0;", "i9", "(Lww/a;)V", "Lmu/a0;", "Lww/g;", "b", "Lmu/a0;", "e9", "()Lmu/a0;", "navEvent", "Lmu/b0;", "Lww/h;", "c", "Lmu/b0;", "_state", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends t0 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0<g> navEvent = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<h> _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<h> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215501e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215501e;
            if (i15 == 0) {
                u.b(obj);
                a0<g> a0VarE9 = l.this.e9();
                g.a aVar = g.a.f215491a;
                this.f215501e = 1;
                if (a0VarE9.F(aVar, this) == objE) {
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
            return l.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215503e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ NavigationTimePickerDialogData f215505g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NavigationTimePickerDialogData navigationTimePickerDialogData, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f215505g = navigationTimePickerDialogData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215503e;
            if (i15 == 0) {
                u.b(obj);
                b0 b0Var = l.this._state;
                h.DataSet dataSet = new h.DataSet(l.this.f9(this.f215505g));
                this.f215503e = 1;
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
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new b(this.f215505g, eVar);
        }
    }

    public l() {
        b0<h> b0VarA = r0.a(h.b.f215494a);
        this._state = b0VarA;
        this.state = mu.i.b(b0VarA);
    }

    private final d2 d9() {
        return ju.k.d(u0.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseTimePickerData f9(final NavigationTimePickerDialogData navigationTimePickerDialogData) {
        return new BaseTimePickerData(navigationTimePickerDialogData.getTitle(), navigationTimePickerDialogData.getInitialHour(), navigationTimePickerDialogData.getInitialMinute(), navigationTimePickerDialogData.getConfirmButtonLabel(), navigationTimePickerDialogData.getCancelButtonLabel(), new er.l() { // from class: ww.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.g9(navigationTimePickerDialogData, this, (TimeResult) obj);
            }
        }, new er.a() { // from class: ww.k
            @Override // er.a
            public final Object a() {
                return l.h9(this.f215497a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g9(NavigationTimePickerDialogData navigationTimePickerDialogData, l lVar, TimeResult timeResult) {
        navigationTimePickerDialogData.e().b(timeResult);
        lVar.d9();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h9(l lVar) {
        lVar.d9();
        return i0.f148189a;
    }

    public a0<g> e9() {
        return this.navEvent;
    }

    @Override // ww.i
    public p0<h> getState() {
        return this.state;
    }

    public void i9(NavigationTimePickerDialogData model) {
        ju.k.d(u0.a(this), null, null, new b(model, null), 3, null);
    }
}
