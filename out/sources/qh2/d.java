package qh2;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqh2/d;", "Lxw/f;", "Lqh2/d$a;", "Lph2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lph2/b$a;", "state", "Lkotlin/Function1;", "Llh2/b;", "Loq/i0;", "onCheckChanged", "", "Ln50/g;", "h", "(Lph2/b$a;Ler/l;)Ljava/util/List;", "params", "q", "(Lqh2/d$a;)Lph2/c$a;", "a", "Lmx/c;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, ph2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qh2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lqh2/d$a;", "", "Lph2/b;", "state", "Lkotlin/Function1;", "Llh2/b;", "Loq/i0;", "onCheckChanged", "Lkotlin/Function0;", "onBackAction", "<init>", "(Lph2/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lph2/b;", "c", "()Lph2/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ph2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<lh2.b, i0> onCheckChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ph2.b bVar, l<? super lh2.b, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onCheckChanged = lVar;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<lh2.b, i0> b() {
            return this.onCheckChanged;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ph2.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCheckChanged, params.onCheckChanged) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCheckChanged.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheckChanged=" + this.onCheckChanged + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> h(ph2.b.Initialized state, final l<? super lh2.b, i0> onCheckChanged) {
        return v.q(new DefaultSingleCardData(null, new er.a() { // from class: qh2.a
            @Override // er.a
            public final Object a() {
                return d.i(onCheckChanged);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jh2.a.f103010g), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(state.getSelectedLanguage() == lh2.b.POLISH, false, 2, null), null, 5, null), null, null, 3325, null), new DefaultSingleCardData(null, new er.a() { // from class: qh2.b
            @Override // er.a
            public final Object a() {
                return d.l(onCheckChanged);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jh2.a.f103009f), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(state.getSelectedLanguage() == lh2.b.ENGLISH, false, 2, null), null, 5, null), null, null, 3325, null), new DefaultSingleCardData(null, new er.a() { // from class: qh2.c
            @Override // er.a
            public final Object a() {
                return d.m(onCheckChanged);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jh2.a.f103012i), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(state.getSelectedLanguage() == lh2.b.UKRAINIAN, false, 2, null), null, 5, null), null, null, 3325, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar) {
        lVar.b(lh2.b.POLISH);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar) {
        lVar.b(lh2.b.ENGLISH);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar) {
        lVar.b(lh2.b.UKRAINIAN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ph2.c.a b(Params params) {
        ph2.b state = params.getState();
        if (!(state instanceof ph2.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(jh2.a.f103011h), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(jh2.a.f103006c);
        ph2.b.Initialized initialized = (ph2.b.Initialized) state;
        lh2.b selectedLanguage = initialized.getSelectedLanguage();
        if (selectedLanguage == null) {
            selectedLanguage = lh2.b.POLISH;
        }
        return new ph2.c.a.Initialized(baseScaffoldData, labelC, selectedLanguage, new CardListData(h(initialized, params.b()), null, false, null, null, 30, null), params.a());
    }
}
