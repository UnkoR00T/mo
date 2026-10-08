package b93;

import a93.State;
import a93.g;
import a93.i;
import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k40.EmptyStateData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oo0.CategoryTopics;
import oo0.Topic;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\t0 *\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lb93/b;", "Lxw/f;", "Lb93/b$a;", "La93/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Loo0/d;", "results", "La93/g;", "i", "(Lb93/b$a;Ljava/util/List;)La93/g;", "activeSearchContent", "Lkotlin/Function0;", "Loq/i0;", "clearSearchAction", "Lkotlin/Function1;", "", "searchQueryChangeAction", "", "searchActiveChangeAction", "La93/h;", "state", "Lj50/e;", "l", "(La93/g;Ler/a;Ler/l;Ler/l;La93/h;)Lj50/e;", "query", "h", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "Lmx/a;", "Ln50/k;", "e", "(Ljava/util/List;Lb93/b$a;)Ljava/util/Map;", "Loo0/u$b;", "", "q", "(Loo0/u$b;)I", "m", "(Lb93/b$a;)La93/i$a;", "a", "Lmx/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b93.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010\"R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b#\u0010\"¨\u0006%"}, d2 = {"Lb93/b$a;", "", "La93/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Loo0/u;", "onTopicClick", "clearSearchAction", "", "searchQueryChangeAction", "", "searchActiveChangeAction", "<init>", "(La93/h;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "La93/h;", "f", "()La93/h;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Topic, i0> onTopicClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> clearSearchAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> searchQueryChangeAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> searchActiveChangeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super Topic, i0> lVar, er.a<i0> aVar2, l<? super String, i0> lVar2, l<? super Boolean, i0> lVar3) {
            this.state = state;
            this.backAction = aVar;
            this.onTopicClick = lVar;
            this.clearSearchAction = aVar2;
            this.searchQueryChangeAction = lVar2;
            this.searchActiveChangeAction = lVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.clearSearchAction;
        }

        public final l<Topic, i0> c() {
            return this.onTopicClick;
        }

        public final l<Boolean, i0> d() {
            return this.searchActiveChangeAction;
        }

        public final l<String, i0> e() {
            return this.searchQueryChangeAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.onTopicClick, params.onTopicClick) && t.c(this.clearSearchAction, params.clearSearchAction) && t.c(this.searchQueryChangeAction, params.searchQueryChangeAction) && t.c(this.searchActiveChangeAction, params.searchActiveChangeAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.onTopicClick.hashCode()) * 31) + this.clearSearchAction.hashCode()) * 31) + this.searchQueryChangeAction.hashCode()) * 31) + this.searchActiveChangeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", onTopicClick=" + this.onTopicClick + ", clearSearchAction=" + this.clearSearchAction + ", searchQueryChangeAction=" + this.searchQueryChangeAction + ", searchActiveChangeAction=" + this.searchActiveChangeAction + ')';
        }
    }

    /* JADX INFO: renamed from: b93.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0432b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17713a;

        static {
            int[] iArr = new int[Topic.b.values().length];
            try {
                iArr[Topic.b.PENALTY_POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Topic.b.ENVIRONMENTAL_VIOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Topic.b.TRAIN_TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Topic.b.SAFE_BUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Topic.b.ELECTORAL_REGISTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Topic.b.GIVE_ELECTORAL_SUPPORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Topic.b.MKA_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Topic.b.PAYMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Topic.b.GAS_SUPPLEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Topic.b.MOBILE_ID_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Topic.b.DIIA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Topic.b.SCHOOL_STUDENT_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Topic.b.UNIVERSITY_STUDENT_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Topic.b.PENSIONER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Topic.b.DEPUTY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Topic.b.ADVOCATE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Topic.b.UUT_CARD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Topic.b.DRIVING_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Topic.b.VEHICLE_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Topic.b.FAMILY_CARD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Topic.b.NURSE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Topic.b.MIDWIFE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Topic.b.DOCTOR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Topic.b.DENTIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Topic.b.VEHICLE_HISTORY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Topic.b.FINES.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Topic.b.AIR_QUALITY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Topic.b.MEDICAL_PRESCRIPTIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Topic.b.E_VISIT_ZUS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Topic.b.PESEL_RESTRICTION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Topic.b.ABROAD_INFO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Topic.b.DOCUMENT_SIGN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Topic.b.COMPANY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Topic.b.ENERGY_VOUCHER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Topic.b.NETWORK_SECURITY_ISSUES.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Topic.b.VEHICLE_COLLISION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Topic.b.TRUSTED_PROFILE_BANKING.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Topic.b.OTHER_SERVICES.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Topic.b.OTHER_DOCUMENTS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[Topic.b.OTHER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[Topic.b.APPLICATION_FORM_SERVICES.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[Topic.b.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[Topic.b.TEACHER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[Topic.b.BAILIFF.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[Topic.b.CIVIL_ENGINEER.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[Topic.b.FLOOD_ALERT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[Topic.b.ATTORNEY_AT_LAW.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[Topic.b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[Topic.b.DRIVER_QUALIFICATIONS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[Topic.b.TAX_ADVISOR.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[Topic.b.DOCUMENT_RESTRICTION.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[Topic.b.ID_CARD_VERIFICATION.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[Topic.b.ID_CARD_COLLECTING.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[Topic.b.MY_CASES.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[Topic.b.AUDITOR.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[Topic.b.SOLIDARITY_CARD.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[Topic.b.MY_IKP.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[Topic.b.DEFENCE_TRAINING.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[Topic.b.QUALIFIED_SIGNATURE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[Topic.b.ELECTRONIC_DELIVERY.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[Topic.b.CHECK_VEHICLE_INSURANCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[Topic.b.LAND_REGISTRY.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[Topic.b.NATIONAL_COURT_REGISTER.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[Topic.b.SAFETY_GUIDE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[Topic.b.PASSPORT_PICKUP.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[Topic.b.PHD_STUDENT.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[Topic.b.INTERNET_ACCESS.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[Topic.b.TRAVEL_ABROAD.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[Topic.b.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[Topic.b.PHYSIOTHERAPIST.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[Topic.b.PHARMACIST.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[Topic.b.SANITARY_VIOLATION.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[Topic.b.SHOOTING_LICENCE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[Topic.b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[Topic.b.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[Topic.b.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[Topic.b.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[Topic.b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[Topic.b.VEHICLE_REGISTRATION.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[Topic.b.PENSIONER_MSWIA.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[Topic.b.EUROPE_READINESS.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[Topic.b.UNKNOWN.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            f17713a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17714a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(592565550);
            if (p076m2.t.k()) {
                p076m2.t.o(592565550, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.mapper.TopicListMapper.createScreenItems.<anonymous>.<anonymous>.<anonymous> (TopicListMapper.kt:146)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17715a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1532879856);
            if (p076m2.t.k()) {
                p076m2.t.o(1532879856, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.mapper.TopicListMapper.createScreenItems.<anonymous>.<anonymous>.<anonymous> (TopicListMapper.kt:152)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Map<Label, List<k>> e(List<CategoryTopics> list, final Params params) {
        Iterator it;
        Collection collectionN;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it4 = list.iterator();
        int i15 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            CategoryTopics categoryTopics = (CategoryTopics) next;
            Label labelB = mx.b.b(categoryTopics.getCategory().getDescription(), "categoryTopic_" + i15);
            List<Topic> listD = categoryTopics.d();
            if (listD != null) {
                List<Topic> list2 = listD;
                collectionN = new ArrayList(v.y(list2, 10));
                int i17 = 0;
                for (Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        v.x();
                    }
                    final Topic topic = (Topic) obj;
                    int iQ = q(topic.getType());
                    String label = topic.getLabel();
                    StringBuilder sb5 = new StringBuilder();
                    Iterator it5 = it4;
                    sb5.append("topic_");
                    sb5.append(i17);
                    collectionN.add(new DefaultSingleCardData(null, new er.a() { // from class: b93.a
                        @Override // er.a
                        public final Object a() {
                            return b.f(params, topic);
                        }
                    }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(label, sb5.toString()), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(iQ, null, c.f17714a, null, null, 26, null), 3, null), topic.getType() == params.getState().getSelectedTopic() ? new x0.Icon(jz.a.T1, mx.b.b("iconChecked", ""), d.f17715a) : null, null, 2301, null));
                    i17 = i18;
                    it4 = it5;
                }
                it = it4;
            } else {
                it = it4;
                collectionN = v.n();
            }
            linkedHashMap.put(labelB, collectionN);
            i15 = i16;
            it4 = it;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, Topic topic) {
        params.c().b(topic);
        return i0.f148189a;
    }

    private final List<CategoryTopics> h(List<CategoryTopics> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (CategoryTopics categoryTopics : list) {
            List<Topic> listD = categoryTopics.d();
            CategoryTopics categoryTopics2 = null;
            if (listD != null) {
                arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (fu.r.b0(((Topic) obj).getLabel(), str, true)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            CategoryTopics categoryTopicsB = CategoryTopics.b(categoryTopics, null, arrayList, 1, null);
            List<Topic> listD2 = categoryTopicsB.d();
            if (listD2 != null && (!listD2.isEmpty())) {
                categoryTopics2 = categoryTopicsB;
            }
            if (categoryTopics2 != null) {
                arrayList2.add(categoryTopics2);
            }
        }
        return arrayList2;
    }

    private final g i(Params params, List<CategoryTopics> results) {
        if (!params.getState().getIsSearchActive()) {
            return null;
        }
        if (params.getState().getSearchQuery().length() == 0) {
            return new g.Initial(this.labelProvider.c(l83.a.f117009u0));
        }
        return results.isEmpty() ? new g.Empty(new EmptyStateData(this.labelProvider.c(l83.a.f116978f), this.labelProvider.c(l83.a.f116984i), null, 4, null)) : new g.Results(e(results, params));
    }

    private final SearchBarData l(g activeSearchContent, er.a<i0> clearSearchAction, l<? super String, i0> searchQueryChangeAction, l<? super Boolean, i0> searchActiveChangeAction, State state) {
        Map<Label, List<k>> mapA;
        boolean isSearchActive = state.getIsSearchActive();
        String searchQuery = state.getSearchQuery();
        Label labelC = this.labelProvider.c(l83.a.f116982h);
        Integer numValueOf = null;
        g.Results results = activeSearchContent instanceof g.Results ? (g.Results) activeSearchContent : null;
        if (results != null && (mapA = results.a()) != null) {
            numValueOf = Integer.valueOf(mapA.size());
        }
        return new SearchBarData(searchQuery, searchQueryChangeAction, isSearchActive, searchActiveChangeAction, clearSearchAction, labelC, null, numValueOf, 64, null);
    }

    private final int q(Topic.b bVar) {
        switch (C0432b.f17713a[bVar.ordinal()]) {
            case 1:
                return jz.a.C3;
            case 2:
                return jz.a.F3;
            case 3:
                return jz.a.T2;
            case 4:
                return jz.a.O3;
            case 5:
                return jz.a.J3;
            case 6:
                return jz.a.Z3;
            case 7:
                return jz.a.Q3;
            case 8:
                return jz.a.M3;
            case 9:
                return jz.a.Z3;
            case 10:
                return jz.a.K2;
            case 11:
                return jz.a.U2;
            case 12:
                return jz.a.P2;
            case 13:
                return jz.a.Q2;
            case 14:
                return jz.a.f106779g3;
            case 15:
                return jz.a.S2;
            case 16:
                return jz.a.R2;
            case 17:
                return jz.a.T2;
            case 18:
                return jz.a.M2;
            case 19:
                return jz.a.N2;
            case 20:
                return jz.a.O2;
            case 21:
                return jz.a.V2;
            case 22:
                return jz.a.W2;
            case 23:
                return jz.a.X2;
            case 24:
                return jz.a.Y2;
            case 25:
                return jz.a.E3;
            case 26:
                return jz.a.D3;
            case 27:
                return jz.a.G3;
            case 28:
                return jz.a.f106913z3;
            case 29:
                return jz.a.N3;
            case 30:
                return jz.a.L3;
            case BERTags.DATE /* 31 */:
                return jz.a.R3;
            case 32:
                return jz.a.B3;
            case 33:
                return jz.a.A3;
            case 34:
                return jz.a.Z3;
            case 35:
                return jz.a.I3;
            case 36:
                return jz.a.U3;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return jz.a.Y3;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return jz.a.X3;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return jz.a.f106755d3;
            case 40:
                return jz.a.X3;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return jz.a.S3;
            case EACTags.CURRENCY_CODE /* 42 */:
                return jz.a.f106731a3;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return jz.a.f106747c3;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return jz.a.f106763e3;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return jz.a.f106755d3;
            case 46:
                return jz.a.H3;
            case 47:
                return jz.a.Z2;
            case 48:
                return jz.a.Z2;
            case 49:
                return jz.a.V3;
            case 50:
                return jz.a.f106771f3;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return jz.a.f106732a4;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return jz.a.f106764e4;
            case 53:
                return jz.a.f106740b4;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return jz.a.T3;
            case 55:
                return jz.a.f106794i3;
            case 56:
                return jz.a.f106808k3;
            case 57:
                return jz.a.f106772f4;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return jz.a.f106788h4;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return jz.a.f106748c4;
            case 60:
                return jz.a.f106756d4;
            case 61:
                return jz.a.f106780g4;
            case 62:
                return jz.a.f106795i4;
            case 63:
                return jz.a.f106802j4;
            case 64:
                return jz.a.f106823m4;
            case 65:
                return jz.a.f106816l4;
            case 66:
                return jz.a.f106815l3;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return jz.a.W3;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return jz.a.R3;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return jz.a.f106830n4;
            case 70:
                return jz.a.f106822m3;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return jz.a.f106829n3;
            case 72:
                return jz.a.f106837o4;
            case 73:
                return jz.a.f106878u3;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return jz.a.f106857r3;
            case EACTags.DEPRECATED /* 75 */:
                return jz.a.f106864s3;
            case 76:
                return jz.a.f106871t3;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return jz.a.f106843p3;
            case 78:
                return jz.a.f106850q3;
            case 79:
                return jz.a.f106885v3;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return jz.a.f106899x3;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return jz.a.f106892w3;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return jz.a.f106906y3;
            case 83:
                return jz.a.f106836o3;
            case 84:
                return jz.a.f106844p4;
            case 85:
                return jz.a.f106779g3;
            case 86:
                return jz.a.f106851q4;
            case 87:
                return jz.a.Z3;
            default:
                throw new oq.p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i.Data b(Params params) {
        g gVarI = i(params, h(params.getState().c(), params.getState().getSearchQuery()));
        State state = params.getState();
        x50.i.Small small = null;
        if (state.getIsSearchActive()) {
            state = null;
        }
        if (state != null) {
            small = new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(l83.a.D0), null, null, null, 28, null);
        }
        return new i.Data(new BaseScaffoldData(null, small, null, null, null, null, 61, null), params.a(), e(params.getState().c(), params), l(gVarI, params.b(), params.e(), params.d(), params.getState()), gVarI);
    }
}
