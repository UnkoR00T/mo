package de4;

import al0.s0;
import b30.AccordionData;
import b30.AccordionElement;
import be4.d;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl0.BEPassportAgreementDetails;
import jl0.BEPassportAgreementDetailsPassportChildApplicationChildData;
import jl0.BEPassportAgreementDetailsPassportChildApplicationParentData;
import jl0.i;
import jl0.j;
import jl0.k;
import jl0.l;
import jl0.o;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u000b*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u000b*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000b*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lde4/a;", "Lxw/f;", "Lde4/a$a;", "Lbe4/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ljl0/c;", "Lmx/a;", "c", "(Ljl0/c;)Lmx/a;", "Ljl0/i;", "Lr50/a$b;", "q", "(Ljl0/i;)Lr50/a$b;", "Ljl0/j;", "i", "(Ljl0/j;)Lmx/a;", "Lal0/s0;", "f", "(Lal0/s0;)Lmx/a;", "Ljl0/l;", "m", "(Ljl0/l;)Lmx/a;", "Ljl0/e;", "h", "(Ljl0/e;)Lmx/a;", "Ljl0/k;", "l", "(Ljl0/k;)Lmx/a;", "params", "e", "(Lde4/a$a;)Lbe4/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: de4.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lde4/a$a;", "", "Lbe4/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onWithdrawAgreement", "onBackAction", "<init>", "(Lbe4/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbe4/c;", "c", "()Lbe4/c;", "b", "Ler/a;", "()Ler/a;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final be4.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onWithdrawAgreement;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(be4.c cVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onWithdrawAgreement = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onWithdrawAgreement;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final be4.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onWithdrawAgreement, params.onWithdrawAgreement) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onWithdrawAgreement.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onWithdrawAgreement=" + this.onWithdrawAgreement + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f41305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f41306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f41307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f41308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f41309g;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41303a = iArr;
            int[] iArr2 = new int[s0.values().length];
            try {
                iArr2[s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f41304b = iArr2;
            int[] iArr3 = new int[i.values().length];
            try {
                iArr3[i.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[i.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[i.ASSIGNED_TO_APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[i.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f41305c = iArr3;
            int[] iArr4 = new int[j.values().length];
            try {
                iArr4[j.INVALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[j.WITHDRAWN_AT_CITIZENS_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[j.CHANGE_OF_DATA_OF_THE_PERSON_GIVES_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[j.CHANGE_IN_DATA_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[j.DEATH_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[j.DEATH_OF_THE_PERSON_FOR_WHOM_CONSENT_WAS_GIVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[j.LOSS_OF_OR_RENUNCIATION_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[j.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            f41306d = iArr4;
            int[] iArr5 = new int[l.values().length];
            try {
                iArr5[l.PERSONAL_APPEARANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[l.DOCUMENT_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[l.ESERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[l.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            f41307e = iArr5;
            int[] iArr6 = new int[jl0.e.values().length];
            try {
                iArr6[jl0.e.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[jl0.e.PHYSICAL_ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[jl0.e.SRP_VERIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[jl0.e.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[jl0.e.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            f41308f = iArr6;
            int[] iArr7 = new int[k.values().length];
            try {
                iArr7[k.ESERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[k.MISSING_SIGNATURE_MEDICAL_REASONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[k.TECHNICAL_PROBLEMS_WITH_SIGNATURE_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[k.CONSENT_WITH_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            f41309g = iArr7;
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label c(BEPassportAgreementDetails bEPassportAgreementDetails) {
        int i15;
        int i16 = b.f41304b[bEPassportAgreementDetails.getPassportType().ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.X;
        } else if (i16 == 2) {
            i15 = oq2.a.f148224a0;
        } else if (i16 == 3) {
            i15 = oq2.a.Y;
        } else if (i16 == 4) {
            i15 = oq2.a.Z;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = oq2.a.f148239i;
        }
        return this.labelProvider.e(i15, v.v0(v.s(bEPassportAgreementDetails.getChildData().getFirstName(), bEPassportAgreementDetails.getChildData().getSurname()), " ", null, null, 0, null, null, 62, null));
    }

    private final Label f(s0 s0Var) {
        int i15;
        int i16 = b.f41304b[s0Var.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.L;
        } else if (i16 == 2) {
            i15 = oq2.a.O;
        } else if (i16 == 3) {
            i15 = oq2.a.M;
        } else if (i16 == 4) {
            i15 = oq2.a.N;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = oq2.a.f148239i;
        }
        return this.labelProvider.c(i15);
    }

    private final Label h(jl0.e eVar) {
        int i15;
        int i16 = b.f41308f[eVar.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.A;
        } else if (i16 == 2) {
            i15 = oq2.a.B;
        } else if (i16 == 3) {
            i15 = oq2.a.C;
        } else if (i16 == 4) {
            i15 = oq2.a.f148260z;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = oq2.a.f148239i;
        }
        return this.labelProvider.c(i15);
    }

    private final Label i(j jVar) {
        int i15;
        switch (b.f41306d[jVar.ordinal()]) {
            case 1:
                i15 = oq2.a.f148255u;
                break;
            case 2:
                i15 = oq2.a.f148257w;
                break;
            case 3:
                i15 = oq2.a.f148252r;
                break;
            case 4:
                i15 = oq2.a.f148251q;
                break;
            case 5:
                i15 = oq2.a.f148253s;
                break;
            case 6:
                i15 = oq2.a.f148254t;
                break;
            case 7:
                i15 = oq2.a.f148256v;
                break;
            case 8:
                i15 = oq2.a.f148239i;
                break;
            default:
                throw new p();
        }
        return this.labelProvider.c(i15);
    }

    private final Label l(k kVar) {
        int i15;
        int i16 = kVar == null ? -1 : b.f41309g[kVar.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.H;
        } else if (i16 == 2) {
            i15 = oq2.a.I;
        } else if (i16 != 3) {
            i15 = i16 != 4 ? oq2.a.G : oq2.a.F;
        } else {
            i15 = oq2.a.J;
        }
        return this.labelProvider.c(i15);
    }

    private final Label m(l lVar) {
        int i15;
        int i16 = b.f41307e[lVar.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.S;
        } else if (i16 == 2) {
            i15 = oq2.a.Q;
        } else if (i16 == 3) {
            i15 = oq2.a.R;
        } else {
            if (i16 != 4) {
                throw new p();
            }
            i15 = oq2.a.f148239i;
        }
        return this.labelProvider.c(i15);
    }

    private final r50.a.WithIcon q(i iVar) {
        int i15;
        g gVar;
        int[] iArr = b.f41305c;
        int i16 = iArr[iVar.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.f148230d0;
        } else if (i16 == 2) {
            i15 = oq2.a.f148232e0;
        } else if (i16 == 3) {
            i15 = oq2.a.f148228c0;
        } else {
            if (i16 != 4) {
                throw new p();
            }
            i15 = oq2.a.f148234f0;
        }
        Label labelC = this.labelProvider.c(i15);
        int i17 = iArr[iVar.ordinal()];
        if (i17 == 1) {
            gVar = g.INFORMATIVE;
        } else if (i17 == 2) {
            gVar = g.NEGATIVE;
        } else if (i17 == 3) {
            gVar = g.POSITIVE;
        } else {
            if (i17 != 4) {
                throw new p();
            }
            gVar = g.INFORMATIVE;
        }
        return new r50.a.WithIcon(null, labelC, null, 0, false, gVar, 13, null);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x07ed  */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        Label labelC;
        be4.c state = params.getState();
        if (t.c(state, be4.c.b.f19010a)) {
            return new d.a.Initial(params.a());
        }
        if (!(state instanceof be4.c.Initialized)) {
            if (state instanceof be4.c.Error) {
                return new d.a.Error(((be4.c.Error) params.getState()).getErrorVMS(), params.a());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(oq2.a.U), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC2 = c(((be4.c.Initialized) params.getState()).getPassportAgreementDetails());
        BEPassportAgreementDetails passportAgreementDetails = ((be4.c.Initialized) params.getState()).getPassportAgreementDetails();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148247m), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(passportAgreementDetails.getAgreementNumber(), "agreement_number"), mx.b.b(dz.e.g(passportAgreementDetails.getAgreementNumber(), 1, " "), ""), null, 0, 0, null, 60, null)), null, 4, null), null, null, null, 3839, null);
        String applicationNumber = passportAgreementDetails.getApplicationNumber();
        DefaultSingleCardData defaultSingleCardData3 = applicationNumber != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148248n), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(applicationNumber, "agreement_number"), mx.b.b(dz.e.g(applicationNumber, 1, " "), ""), null, 0, 0, null, 60, null)), null, 4, null), null, null, null, 3839, null) : null;
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.T), null, null, 3, null), new n50.b.StatusBadge(q(passportAgreementDetails.getAgreementStatus())), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(oq2.a.f148245l), null, null, 3, null);
        e eVar = this.dateFormatter;
        fz.b.LocalDate agreementDate = passportAgreementDetails.getAgreementDate();
        fz.c cVar = fz.c.DOTTED;
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(mx.b.b(eVar.d(agreementDate, cVar), "registration_date"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        fz.b.LocalDate invalidationDate = passportAgreementDetails.getInvalidationDate();
        DefaultSingleCardData defaultSingleCardData6 = invalidationDate != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148249o), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(invalidationDate, cVar), "registration_date"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        j invalidationReason = passportAgreementDetails.getInvalidationReason();
        if (invalidationReason != null) {
            DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148250p), null, null, 3, null), new n50.b.Title(n50.l.b(i(invalidationReason), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
            if (passportAgreementDetails.getAgreementStatus() != i.REVOKED) {
                defaultSingleCardData7 = null;
            }
            defaultSingleCardData = defaultSingleCardData7;
        } else {
            defaultSingleCardData = null;
        }
        CardListData cardListData = new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.K), null, null, 3, null), new n50.b.Title(n50.l.b(f(passportAgreementDetails.getPassportType()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.P), null, null, 3, null), new n50.b.Title(n50.l.b(m(passportAgreementDetails.getAgreementRegistrationMode()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        BEPassportAgreementDetailsPassportChildApplicationParentData parentData = ((be4.c.Initialized) params.getState()).getPassportAgreementDetails().getParentData();
        boolean accordionInitialExpandedForScreenShotTest = ((be4.c.Initialized) params.getState()).getAccordionInitialExpandedForScreenShotTest();
        Label labelC3 = this.labelProvider.c(oq2.a.f148243k);
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148231e), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(v.v0(v.s(parentData.getFirstName(), parentData.getSecondName(), parentData.getAnotherNames()), ", ", null, null, 0, null, null, 62, null), "parentNames"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData9 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148233f), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(parentData.getSurname(), "parentSurname"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData10 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148235g), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(parentData.getPesel(), "parentPesel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData11 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148259y), null, null, 3, null), new n50.b.Title(n50.l.b(h(parentData.getIdentityVerificationMethod()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(oq2.a.D), null, null, 3, null);
        String seriesAndNumber = parentData.getSeriesAndNumber();
        if (seriesAndNumber == null) {
            seriesAndNumber = "-";
        }
        DefaultSingleCardData defaultSingleCardData12 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(n50.l.b(mx.b.b(seriesAndNumber, "document"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        String documentDescription = parentData.getDocumentDescription();
        AccordionData accordionData = new AccordionData(v.e(new AccordionElement(null, labelC3, null, accordionInitialExpandedForScreenShotTest, null, false, new ce4.b(new CardListData(v.s(defaultSingleCardData8, defaultSingleCardData9, defaultSingleCardData10, defaultSingleCardData11, defaultSingleCardData12, documentDescription != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148258x), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(documentDescription, "document"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.E), null, null, 3, null), new n50.b.Title(n50.l.b(l(parentData.getParentSignature().getMissingSignatureReason()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), 21, null)));
        BEPassportAgreementDetailsPassportChildApplicationChildData childData = ((be4.c.Initialized) params.getState()).getPassportAgreementDetails().getChildData();
        boolean accordionInitialExpandedForScreenShotTest2 = ((be4.c.Initialized) params.getState()).getAccordionInitialExpandedForScreenShotTest();
        Label labelC4 = b.f41303a[((be4.c.Initialized) params.getState()).getPassportAgreementDetails().getParentData().getConsentingPersonParentalStatus().ordinal()] == 1 ? this.labelProvider.c(oq2.a.f148229d) : this.labelProvider.c(oq2.a.f148241j);
        String strV0 = v.v0(v.s(childData.getFirstName(), childData.getSecondName(), childData.getAnotherNames()), ", ", null, null, 0, null, null, 62, null);
        DefaultSingleCardData defaultSingleCardData13 = strV0.length() > 0 ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148231e), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strV0, "childNames"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        String surname = childData.getSurname();
        DefaultSingleCardData defaultSingleCardData14 = surname != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148233f), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(surname, "parentSurname"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        String pesel = childData.getPesel();
        AccordionData accordionData2 = new AccordionData(v.e(new AccordionElement(null, labelC4, null, accordionInitialExpandedForScreenShotTest2, null, false, new ce4.b(new CardListData(v.s(defaultSingleCardData13, defaultSingleCardData14, pesel != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148235g), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(pesel, "parentPesel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148225b), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateFormatter.d(childData.getDateOfBirth(), cVar), "childBirthDate"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(oq2.a.f148227c), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(childData.getPlaceOfBirth(), "childBirthPlace"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), 21, null)));
        BEPassportAgreementDetails passportAgreementDetails2 = ((be4.c.Initialized) params.getState()).getPassportAgreementDetails();
        boolean accordionInitialExpandedForScreenShotTest3 = ((be4.c.Initialized) params.getState()).getAccordionInitialExpandedForScreenShotTest();
        Label labelC5 = this.labelProvider.c(oq2.a.f148223a);
        List<jl0.d> listF = passportAgreementDetails2.f();
        if (listF != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                String attachementName = ((jl0.d) it.next()).getAttachementName();
                if (attachementName != null) {
                    arrayList.add(attachementName);
                }
            }
            String strV1 = v.v0(arrayList, ",\n", null, null, 0, null, null, 62, null);
            if (strV1 == null || (labelC = mx.b.b(strV1, "childNames")) == null) {
                labelC = Label.INSTANCE.c();
            }
        } else {
            labelC = Label.INSTANCE.c();
        }
        AccordionData accordionData3 = new AccordionData(v.e(new AccordionElement(null, labelC5, null, accordionInitialExpandedForScreenShotTest3, null, false, new ce4.b(new CardListData(v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(labelC, null, null, 3, null)), null, 5, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), 21, null)));
        List<jl0.d> listF2 = passportAgreementDetails2.f();
        AccordionData accordionData4 = !(listF2 == null || listF2.isEmpty()) ? accordionData3 : null;
        ButtonData buttonData = new ButtonData("withdrawBtn", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oq2.a.V), null, 2, null), k30.d.a.f107773a, null, params.b(), 34, null);
        if (((be4.c.Initialized) params.getState()).getPassportAgreementDetails().getAgreementStatus() != i.REGISTERED) {
            buttonData = null;
        }
        return new d.a.Initialized(baseScaffoldData, labelC2, cardListData, accordionData, accordionData2, accordionData4, buttonData, params.a());
    }
}
