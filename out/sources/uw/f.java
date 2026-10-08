package uw;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.u0;
import er.p;
import ju.d2;
import mu.a0;
import mu.b0;
import mu.h0;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Luw/f;", "Landroidx/lifecycle/t0;", "Luw/c;", "", "Lez/c;", "dateConverter", "Lez/e;", "dateFormatter", "<init>", "(Lez/c;Lez/e;)V", "Luw/j;", "Lg40/j;", "f9", "(Luw/j;)Lg40/j;", "Lju/d2;", "d9", "()Lju/d2;", "model", "Loq/i0;", "i9", "(Luw/j;)V", "b", "Lez/c;", "getDateConverter", "()Lez/c;", "c", "Lez/e;", "getDateFormatter", "()Lez/e;", "Lmu/a0;", "Luw/a;", "d", "Lmu/a0;", "e9", "()Lmu/a0;", "navEvent", "Lmu/b0;", "Luw/b;", "e", "Lmu/b0;", "_state", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends t0 implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a0<uw.a> navEvent = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<uw.b> _state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<uw.b> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201824e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201824e;
            if (i15 == 0) {
                u.b(obj);
                a0<uw.a> a0VarE9 = f.this.e9();
                uw.a.C5241a c5241a = uw.a.C5241a.f201814a;
                this.f201824e = 1;
                if (a0VarE9.F(c5241a, this) == objE) {
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
            return f.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201826e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f201828g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f201828g = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201826e;
            if (i15 == 0) {
                u.b(obj);
                b0 b0Var = f.this._state;
                uw.b.DataSet dataSet = new uw.b.DataSet(f.this.f9(this.f201828g));
                this.f201826e = 1;
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
            return f.this.new b(this.f201828g, eVar);
        }
    }

    public f(ez.c cVar, ez.e eVar) {
        this.dateConverter = cVar;
        this.dateFormatter = eVar;
        b0<uw.b> b0VarA = r0.a(uw.b.C5242b.f201816a);
        this._state = b0VarA;
        this.state = mu.i.b(b0VarA);
    }

    private final d2 d9() {
        return ju.k.d(u0.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g40.j f9(j jVar) {
        if (jVar instanceof j.Single) {
            j.Single single = (j.Single) jVar;
            return new g40.j.Single(new g40.b(single.getMinimumDate(), single.getMaximumDate(), this.dateConverter), single.getTitle(), single.getInitialDate(), single.d(), new er.a() { // from class: uw.d
                @Override // er.a
                public final Object a() {
                    return f.g9(this.f201817a);
                }
            });
        }
        if (!(jVar instanceof j.Range)) {
            throw new oq.p();
        }
        j.Range range = (j.Range) jVar;
        return new g40.j.Range(new g40.b(range.getMinimumDate(), range.getMaximumDate(), this.dateConverter), new h40.l(this.dateFormatter), range.getTitle(), range.getInitialRange(), range.getInitialDisplayedYearMonth(), range.e(), new er.a() { // from class: uw.e
            @Override // er.a
            public final Object a() {
                return f.h9(this.f201818a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g9(f fVar) {
        fVar.d9();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h9(f fVar) {
        fVar.d9();
        return i0.f148189a;
    }

    public a0<uw.a> e9() {
        return this.navEvent;
    }

    @Override // uw.c
    public p0<uw.b> getState() {
        return this.state;
    }

    public void i9(j model) {
        ju.k.d(u0.a(this), null, null, new b(model, null), 3, null);
    }
}
