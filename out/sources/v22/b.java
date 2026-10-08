package v22;

import androidx.compose.ui.graphics.Color;
import eo0.EpuapApplicationType;
import eo0.Recipient;
import eo0.y0;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.l;
import o02.Epuap;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020 *\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020 *\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001bH\u0002¢\u0006\u0004\b+\u0010,J)\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\b\u0002\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020-*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lv22/b;", "Lxw/f;", "Lv22/b$a;", "Lu22/c$a;", "Lmx/c;", "labelProvider", "Lv22/a;", "correspondenceAddressMapper", "<init>", "(Lmx/c;Lv22/a;)V", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lh30/a;", "r", "(Ler/a;)Lh30/a;", "onBackAction", "onCloseAction", "Li50/a;", "q", "(Ler/a;Ler/a;)Li50/a;", "Lo02/a;", "result", "", "Lu22/c$a$b$a;", "l", "(Lo02/a;)Ljava/util/List;", "", "Leo0/k0;", "recipients", "Leo0/y0;", "messageServiceType", "Ln30/b;", "m", "(Ljava/util/List;Leo0/y0;)Ln30/b;", "Lo02/c;", "h", "(Lo02/c;)Ln30/b;", "Lo02/d;", "i", "(Lo02/d;)Ln30/b;", "Lm02/c;", "files", "c", "(Ljava/util/List;)Ln30/b;", "Lmx/a;", "title", "info", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "e", "(Lmx/a;Lmx/a;Lj70/a;)Ln50/g;", "u", "(Leo0/y0;)Lmx/a;", "params", "s", "(Lv22/b$a;)Lu22/c$a;", "a", "Lmx/c;", "b", "Lv22/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, u22.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a correspondenceAddressMapper;

    /* JADX INFO: renamed from: v22.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lv22/b$a;", "", "Lu22/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextAction", "onBackAction", "onCloseAction", "<init>", "(Lu22/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu22/b;", "d", "()Lu22/b;", "b", "Ler/a;", "c", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u22.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(u22.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final u22.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: v22.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5291b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f203333b;

        static {
            int[] iArr = new int[i22.b.values().length];
            try {
                iArr[i22.b.EPUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i22.b.MAILING_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f203332a = iArr;
            int[] iArr2 = new int[y0.values().length];
            try {
                iArr2[y0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[y0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f203333b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f203334a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(235378949);
            if (p076m2.t.k()) {
                p076m2.t.o(235378949, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.messagesummary.mapper.MessageSummaryMapper.getScaffoldData.<anonymous> (MessageSummaryMapper.kt:91)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(mx.c cVar, a aVar) {
        this.labelProvider = cVar;
        this.correspondenceAddressMapper = aVar;
    }

    private final CardListData c(List<? extends m02.c> files) {
        List<? extends m02.c> list = files;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            m02.c cVar = (m02.c) obj;
            arrayList.add(f(this, mx.b.b(cVar.getMetadata().getName() + '.' + cVar.getMetadata().getExtension(), "fileName" + i15), this.labelProvider.c(e02.a.O3), null, 4, null));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final DefaultSingleCardData e(Label title, Label info, j70.a accessibilityReadMode) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(info, null, null, 3, null), new n50.b.Title(l.b(title, accessibilityReadMode, null, 2, null)), null, 4, null), null, null, null, 3839, null);
    }

    static /* synthetic */ DefaultSingleCardData f(b bVar, Label label, Label label2, j70.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        return bVar.e(label, label2, aVar);
    }

    private final CardListData h(o02.c cVar) {
        return new CardListData(v.q(f(this, mx.b.b(cVar.getTitle(), cVar.getTitle()), this.labelProvider.c(e02.a.A0), null, 4, null), f(this, mx.b.d(cVar.getContent(), cVar.getContent()), this.labelProvider.c(e02.a.B3), null, 4, null), f(this, mx.b.d(cVar.getCaseSign(), cVar.getCaseSign()), this.labelProvider.c(e02.a.P3), null, 4, null)), null, false, null, null, 30, null);
    }

    private final CardListData i(Epuap epuap) {
        DefaultSingleCardData defaultSingleCardDataF;
        DefaultSingleCardData defaultSingleCardDataF2 = null;
        DefaultSingleCardData defaultSingleCardDataF3 = f(this, mx.b.b(epuap.getTitle(), "messageTitle"), this.labelProvider.c(e02.a.A0), null, 4, null);
        EpuapApplicationType epuapApplicationType = epuap.getEpuapApplicationType();
        if (epuapApplicationType != null) {
            defaultSingleCardDataF = f(this, mx.b.b(epuapApplicationType.getDescription(), "description"), this.labelProvider.c(e02.a.f46644y3), null, 4, null);
        } else {
            defaultSingleCardDataF = null;
        }
        String applicationName = epuap.getApplicationName();
        if (applicationName != null) {
            defaultSingleCardDataF2 = f(this, mx.b.b(applicationName, "applicationName"), this.labelProvider.c(e02.a.f46638x3), null, 4, null);
        }
        return new CardListData(v.s(defaultSingleCardDataF3, defaultSingleCardDataF, defaultSingleCardDataF2, f(this, mx.b.d(epuap.getContent(), "messageContent"), this.labelProvider.c(e02.a.B3), null, 4, null)), null, false, null, null, 30, null);
    }

    private final List<u22.c.a.Initialized.SummaryMessageSection> l(o02.a result) {
        Label labelC;
        o02.b.CorrespondenceAddress correspondenceAddress;
        if (result instanceof o02.a.Edor) {
            o02.a.Edor edor = (o02.a.Edor) result;
            List<u22.c.a.Initialized.SummaryMessageSection> listT = v.t(new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.Q3), m(edor.getAddRecipients().a(), edor.getMessageType().getServiceType())), new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.R3), h(edor.getMessageForm())));
            List<m02.c> listC = edor.getMessageForm().c();
            if (listC != null && !listC.isEmpty()) {
                listT.add(new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.f46520e), c(listC)));
            }
            return listT;
        }
        if (!(result instanceof o02.a.Epuap)) {
            throw new oq.p();
        }
        o02.a.Epuap epuap = (o02.a.Epuap) result;
        List<u22.c.a.Initialized.SummaryMessageSection> listT2 = v.t(new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.Q3), m(epuap.getAddRecipients().a(), epuap.getMessageType().getServiceType())), new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.R3), i(epuap.getMessageForm())));
        List<m02.c> listD = epuap.getMessageForm().d();
        if (listD != null && !listD.isEmpty()) {
            listT2.add(new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.f46520e), c(listD)));
        }
        DefaultSingleCardData defaultSingleCardDataF = null;
        listT2.add(new u22.c.a.Initialized.SummaryMessageSection(this.labelProvider.c(e02.a.f46562l), new CardListData(v.s(f(this, mx.b.b(c0.e(epuap.getContactDetails().getNameAndSurname()), "nameAndSurname"), this.labelProvider.c(e02.a.L), null, 4, null), e(mx.b.b(c0.e(epuap.getContactDetails().getPesel()), "pesel"), this.labelProvider.c(e02.a.f46509c0), j70.a.LETTER_BY_LETTER), c0.e(epuap.getContactDetails().getEmail()).length() > 0 ? f(this, mx.b.b(c0.e(epuap.getContactDetails().getEmail()), "email"), this.labelProvider.c(e02.a.f46622v), null, 4, null) : null, c0.e(epuap.getContactDetails().getPhoneNumber().g()).length() > 0 ? f(this, mx.b.b(c0.e(epuap.getContactDetails().getPhoneNumber().g()), "phoneNumber"), this.labelProvider.c(e02.a.f46515d0), null, 4, null) : null), null, false, null, null, 30, null)));
        Label labelC2 = this.labelProvider.c(e02.a.f46649z2);
        Label labelC3 = this.labelProvider.c(e02.a.f46643y2);
        int i15 = C5291b.f203332a[epuap.getContactMethod().getMethod().ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(e02.a.f46619u2);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(e02.a.f46631w2);
        }
        DefaultSingleCardData defaultSingleCardDataF2 = f(this, labelC, labelC3, null, 4, null);
        if (epuap.getContactMethod().getMethod() == i22.b.MAILING_ADDRESS && (correspondenceAddress = epuap.getCorrespondenceAddress()) != null) {
            defaultSingleCardDataF = f(this, mx.b.b(this.correspondenceAddressMapper.b(new a.Params(correspondenceAddress.getAddressData())), "correspondenceAddress"), this.labelProvider.c(e02.a.f46553j2), null, 4, null);
        }
        listT2.add(new u22.c.a.Initialized.SummaryMessageSection(labelC2, new CardListData(v.s(defaultSingleCardDataF2, defaultSingleCardDataF), null, false, null, null, 30, null)));
        return listT2;
    }

    private final CardListData m(List<Recipient> recipients, y0 messageServiceType) {
        List<Recipient> list = recipients;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (Recipient recipient : list) {
            arrayList.add(f(this, mx.b.b(recipient.getFullName(), recipient.getFullName()), u(messageServiceType), null, 4, null));
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final BaseScaffoldData q(er.a<i0> onBackAction, er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackAction), this.labelProvider.c(e02.a.f46641y0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f203334a, null, onCloseAction, 4, null)), null, 20, null), null, null, null, null, 61, null);
    }

    private final ButtonData r(er.a<i0> onClick) {
        k30.b.c cVar = k30.b.c.f107768a;
        d.a aVar = d.a.f107773a;
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.f46581o0), null, 2, null), aVar, cVar, onClick, 3, null);
    }

    private final Label u(y0 y0Var) {
        int i15 = y0Var == null ? -1 : C5291b.f203333b[y0Var.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return this.labelProvider.c(e02.a.f46564l1);
            }
            if (i15 == 2) {
                return this.labelProvider.c(e02.a.f46540h1);
            }
            if (i15 != 3) {
                throw new oq.p();
            }
        }
        return Label.INSTANCE.b();
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public u22.c.a b(Params params) {
        u22.b state = params.getState();
        if (state instanceof u22.b.a) {
            return new u22.c.a.Initialized(q(params.a(), params.b()), l(((u22.b.a) params.getState()).getMessageWizardResult()), r(params.c()), params.a());
        }
        if (t.c(state, u22.b.C5066b.f194542a)) {
            return u22.c.a.C5067a.f194543a;
        }
        throw new oq.p();
    }
}
