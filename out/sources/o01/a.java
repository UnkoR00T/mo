package o01;

import er.l;
import fr.t;
import h30.ButtonData;
import hz.b;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import n01.State;
import n01.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import t50.TextAreaData;
import t50.e;
import t50.s;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lo01/a;", "Lxw/f;", "Lo01/a$a;", "Ln01/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lp01/a;", "entryData", "Lmx/a;", "e", "(Lp01/a;)Lmx/a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lh30/a;", "f", "(Ler/a;)Lh30/a;", "", "labelStringId", "minLines", "Lkotlin/Function1;", "", "onValueChange", "content", "Lhz/b;", "validationState", "maxLength", "Lt50/d;", "h", "(IILer/l;Ljava/lang/String;Lhz/b;I)Lt50/d;", "Lt50/e;", "i", "(Lhz/b;)Lt50/e;", "params", "c", "(Lo01/a$a;)Ln01/g$a;", "a", "Lmx/c;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: o01.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lo01/a$a;", "", "Ln01/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "sendSuggestionAction", "Lkotlin/Function1;", "", "onDescriptionChangeAction", "<init>", "(Ln01/f;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln01/f;", "d", "()Ln01/f;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> sendSuggestionAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDescriptionChangeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.sendSuggestionAction = aVar2;
            this.onDescriptionChangeAction = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<String, i0> b() {
            return this.onDescriptionChangeAction;
        }

        public final er.a<i0> c() {
            return this.sendSuggestionAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.sendSuggestionAction, params.sendSuggestionAction) && t.c(this.onDescriptionChangeAction, params.onDescriptionChangeAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.sendSuggestionAction.hashCode()) * 31) + this.onDescriptionChangeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", sendSuggestionAction=" + this.sendSuggestionAction + ", onDescriptionChangeAction=" + this.onDescriptionChangeAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(p01.a entryData) {
        if ((entryData instanceof p01.a.AbstractC3723a.Other) || (entryData instanceof p01.a.c.Other)) {
            return this.labelProvider.c(d01.a.B);
        }
        if (entryData instanceof p01.a.AbstractC3723a.Specific) {
            return this.labelProvider.e(d01.a.A, ((p01.a.AbstractC3723a.Specific) entryData).getTopic().getLabel());
        }
        if (entryData instanceof p01.a.c.Specific) {
            return this.labelProvider.e(d01.a.F, ((p01.a.c.Specific) entryData).getTopic().getLabel());
        }
        if (entryData instanceof p01.a.Others) {
            return this.labelProvider.c(d01.a.D);
        }
        throw new p();
    }

    private final ButtonData f(er.a<i0> onClick) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(d01.a.E), null, 2, null), d.a.f107773a, null, onClick, 35, null);
    }

    private final TextAreaData h(int labelStringId, int minLines, l<? super String, i0> onValueChange, String content, b validationState, int maxLength) {
        int iE = v4.t.INSTANCE.e();
        return new TextAreaData(null, this.labelProvider.c(labelStringId), new s.Fix(minLines), null, i(validationState), content, false, new t50.a.Visible(maxLength, null, 2, null), null, iE, null, null, onValueChange, null, 11593, null);
    }

    private final e i(b bVar) {
        return bVar instanceof b.Invalid ? new e.Error(((b.Invalid) bVar).getMessage()) : new e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        return new g.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(d01.a.f38973v), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), this.labelProvider.c(d01.a.C), e(params.getState().getEntryData()), h(d01.a.G, 4, params.b(), params.getState().getDescriptionValue(), params.getState().getDescriptionValidationState(), 500), f(params.c()));
    }
}
