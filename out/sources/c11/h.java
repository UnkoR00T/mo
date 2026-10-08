package c11;

import b11.o;
import b11.p;
import er.l;
import fr.t;
import fr.v0;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.Arrays;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u00020\n*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lc11/h;", "Lxw/f;", "Lc11/h$a;", "Lb11/p$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "redirectUrl", "Lkotlin/Function1;", "Loq/i0;", "goBackToSupplierAction", "Lkotlin/Function0;", "closeAction", "Lq40/f;", "h", "(Ljava/lang/String;Ler/l;Ler/a;)Lq40/f;", "Leo2/a;", "data", "params", "", "remainingTimeInSeconds", "validityPeriodInSeconds", "Lb11/p$a$b;", "l", "(Leo2/a;Lc11/h$a;JJ)Lb11/p$a$b;", "onCloseAction", "Li50/a;", "r", "(Ler/a;)Li50/a;", "Ljava/time/OffsetDateTime;", "Lfz/c;", "formatType", "q", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "time", "Lmx/a;", "m", "(J)Lmx/a;", "s", "(Lc11/h$a;)Lb11/p$a;", "a", "Lmx/c;", "b", "Lez/e;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c11.h$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lc11/h$a;", "", "Lb11/o;", "state", "Lkotlin/Function0;", "Loq/i0;", "confirmAction", "rejectAction", "closeAction", "Lkotlin/Function1;", "", "goBackToSupplierAction", "<init>", "(Lb11/o;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb11/o;", "e", "()Lb11/o;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> rejectAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> goBackToSupplierAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o oVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar) {
            this.state = oVar;
            this.confirmAction = aVar;
            this.rejectAction = aVar2;
            this.closeAction = aVar3;
            this.goBackToSupplierAction = lVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.confirmAction;
        }

        public final l<String, i0> c() {
            return this.goBackToSupplierAction;
        }

        public final er.a<i0> d() {
            return this.rejectAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final o getState() {
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
            return t.c(this.state, params.state) && t.c(this.confirmAction, params.confirmAction) && t.c(this.rejectAction, params.rejectAction) && t.c(this.closeAction, params.closeAction) && t.c(this.goBackToSupplierAction, params.goBackToSupplierAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.confirmAction.hashCode()) * 31) + this.rejectAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.goBackToSupplierAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", confirmAction=" + this.confirmAction + ", rejectAction=" + this.rejectAction + ", closeAction=" + this.closeAction + ", goBackToSupplierAction=" + this.goBackToSupplierAction + ')';
        }
    }

    public h(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final IconPageBottomContentData h(final String redirectUrl, final l<? super String, i0> goBackToSupplierAction, er.a<i0> closeAction) {
        ButtonData buttonData;
        if (redirectUrl != null) {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43591m), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: c11.e
                @Override // er.a
                public final Object a() {
                    return h.i(goBackToSupplierAction, redirectUrl);
                }
            }, 35, null);
        } else {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43579a), null, 2, null), k30.d.a.f107773a, null, closeAction, 35, null);
        }
        return new IconPageBottomContentData(buttonData, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    private final p.a.ReadyToConfirm l(eo2.a data, Params params, long remainingTimeInSeconds, long validityPeriodInSeconds) {
        BaseScaffoldData baseScaffoldDataR = r(params.a());
        Label labelB = mx.b.b(data.getMessageTitle(), "messageTitle");
        Label labelB2 = mx.b.b(data.getMessageText(), "messageText");
        Label labelB3 = mx.b.b(q(data.getMessageDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "messageDate");
        String messagePrivateText = data.getMessagePrivateText();
        return new p.a.ReadyToConfirm(baseScaffoldDataR, labelB3, labelB, labelB2, messagePrivateText != null ? mx.b.b(messagePrivateText, "messagePrivateText") : null, remainingTimeInSeconds / validityPeriodInSeconds, m(remainingTimeInSeconds), this.labelProvider.c(do2.a.f43592n), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43580b), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43582d), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.d(), 35, null), params.a());
    }

    private final Label m(long time) {
        v0 v0Var = v0.f66418a;
        long j15 = 60;
        return mx.b.b(String.format(this.labelProvider.c(do2.a.f43593o).getText(), Arrays.copyOf(new Object[]{Long.valueOf(time / j15), Long.valueOf(time % j15)}, 2)), "counterTimeFormat");
    }

    private final String q(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final BaseScaffoldData r(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, String str) {
        params.c().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, String str) {
        params.c().b(str);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p.a b(final Params params) {
        o state = params.getState();
        if ((state instanceof o.CheckTrustedProfileAuthStatus) || (state instanceof o.CheckQualifiedSignatureAuthStatus)) {
            return p.a.C0379a.f16062a;
        }
        if (state instanceof o.TrustedProfileAuth) {
            o.TrustedProfileAuth trustedProfileAuth = (o.TrustedProfileAuth) state;
            return l(trustedProfileAuth.getData(), params, trustedProfileAuth.getRemainingTimeInSeconds(), trustedProfileAuth.getValidityPeriodInSeconds());
        }
        if (state instanceof o.QualifiedSignatureAuth) {
            o.QualifiedSignatureAuth qualifiedSignatureAuth = (o.QualifiedSignatureAuth) state;
            return l(qualifiedSignatureAuth.getData(), params, qualifiedSignatureAuth.getRemainingTimeInSeconds(), qualifiedSignatureAuth.getValidityPeriodInSeconds());
        }
        if (t.c(state, o.e.f16051a)) {
            return new p.a.Success(r(params.a()), new IconPageData(j.b.c.f164688d, this.labelProvider.c(do2.a.f43586h), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43579a), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 12, null), params.a());
        }
        if (t.c(state, o.i.f16057a)) {
            return new p.a.Success(r(params.a()), new IconPageData(j.b.C4090b.f164686d, this.labelProvider.c(do2.a.f43590l), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(do2.a.f43579a), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 12, null), params.a());
        }
        if (state instanceof o.TimeExpired) {
            BaseScaffoldData baseScaffoldDataR = r(params.a());
            o.TimeExpired timeExpired = (o.TimeExpired) state;
            Label labelB = mx.b.b(timeExpired.getData().getMessageTitle(), "messageTitle");
            Label labelB2 = mx.b.b(timeExpired.getData().getMessageText(), "messageText");
            Label labelB3 = mx.b.b(q(timeExpired.getData().getMessageDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "messageDate");
            String messagePrivateText = timeExpired.getData().getMessagePrivateText();
            return new p.a.UnableToConfirm(baseScaffoldDataR, labelB3, labelB, labelB2, messagePrivateText != null ? mx.b.b(messagePrivateText, "messagePrivateText") : null, this.labelProvider.c(do2.a.f43589k), params.a());
        }
        if (state instanceof o.AlreadyConfirmed) {
            BaseScaffoldData baseScaffoldDataR2 = r(params.a());
            o.AlreadyConfirmed alreadyConfirmed = (o.AlreadyConfirmed) state;
            Label labelB4 = mx.b.b(alreadyConfirmed.getData().getMessageTitle(), "messageTitle");
            Label labelB5 = mx.b.b(alreadyConfirmed.getData().getMessageText(), "messageText");
            Label labelB6 = mx.b.b(q(alreadyConfirmed.getData().getMessageDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "messageDate");
            String messagePrivateText2 = alreadyConfirmed.getData().getMessagePrivateText();
            return new p.a.UnableToConfirm(baseScaffoldDataR2, labelB6, labelB4, labelB5, messagePrivateText2 != null ? mx.b.b(messagePrivateText2, "messagePrivateText") : null, this.labelProvider.c(do2.a.f43586h), params.a());
        }
        if (!(state instanceof o.AlreadyRejected)) {
            if (state instanceof o.QualifiedSignatureConfirmedSuccess) {
                return new p.a.Success(r(params.a()), new IconPageData(j.b.c.f164688d, this.labelProvider.c(do2.a.f43585g), null, null, null, h(((o.QualifiedSignatureConfirmedSuccess) state).getRedirectUrl(), new l() { // from class: c11.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.u(params, (String) obj);
                    }
                }, params.a()), true, 12, null), params.a());
            }
            if (state instanceof o.QualifiedSignatureRejectedSuccess) {
                return new p.a.Success(r(params.a()), new IconPageData(j.b.C4090b.f164686d, this.labelProvider.c(do2.a.f43590l), null, null, null, h(((o.QualifiedSignatureRejectedSuccess) state).getRedirectUrl(), new l() { // from class: c11.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.v(params, (String) obj);
                    }
                }, params.a()), true, 12, null), params.a());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldDataR3 = r(params.a());
        o.AlreadyRejected alreadyRejected = (o.AlreadyRejected) state;
        Label labelB7 = mx.b.b(alreadyRejected.getData().getMessageTitle(), "messageTitle");
        Label labelB8 = mx.b.b(alreadyRejected.getData().getMessageText(), "messageText");
        Label labelB9 = mx.b.b(q(alreadyRejected.getData().getMessageDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "messageDate");
        String messagePrivateText3 = alreadyRejected.getData().getMessagePrivateText();
        return new p.a.UnableToConfirm(baseScaffoldDataR3, labelB9, labelB7, labelB8, messagePrivateText3 != null ? mx.b.b(messagePrivateText3, "messagePrivateText") : null, this.labelProvider.c(do2.a.f43590l), params.a());
    }
}
