package mi0;

import dx.b;
import dx.i;
import ex.d;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ni0.ActionPlanDto;
import ni0.ConversationDto;
import ni0.ConversationLimitsDto;
import ni0.ConversationRatingDto;
import ni0.MessageReplyRatingDto;
import ni0.SourceDto;
import ni0.StaticMessagesDto;
import ni0.StreamMessageResponseDto;
import ni0.c;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import ri0.BEAction;
import ri0.BEConversationData;
import ri0.BELimits;
import ri0.BERateAnswerModel;
import ri0.BERateConversationModel;
import ri0.BESource;
import ri0.BEStaticMessages;
import ri0.f;
import ri0.g;
import ri0.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019*\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010(\u001a\u00020'*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010,\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lni0/d;", "Lri0/b;", "d", "(Lni0/d;)Lri0/b;", "Lni0/k;", "Lri0/i;", "g", "(Lni0/k;)Lri0/i;", "Lni0/e;", "Lri0/c;", "e", "(Lni0/e;)Lri0/c;", "Lri0/d;", "Lni0/h;", "j", "(Lri0/d;)Lni0/h;", "Lri0/f;", "Lni0/i;", "k", "(Lri0/f;)Lni0/i;", "Lri0/e;", "Lni0/f;", "i", "(Lri0/e;)Lni0/f;", "Lni0/l;", "Ldx/i;", "Ldx/b;", "Lri0/j;", "a", "(Lni0/l;)Ldx/i;", "Lni0/j;", "Lri0/h;", "f", "(Lni0/j;)Lri0/h;", "Lni0/b;", "Lri0/a;", "c", "(Lni0/b;)Lri0/a;", "Lni0/c;", "Lri0/a$a;", "b", "(Lni0/c;)Lri0/a$a;", "Lni0/a;", "Lrq0/a;", "h", "(Lni0/a;)Lrq0/a;", "chatservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: mi0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3118a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f126680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f126681d;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126678a = iArr;
            int[] iArr2 = new int[g.Selected.a.values().length];
            try {
                iArr2[g.Selected.a.LOWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g.Selected.a.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g.Selected.a.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g.Selected.a.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g.Selected.a.HIGHEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f126679b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f126680c = iArr3;
            int[] iArr4 = new int[ni0.a.values().length];
            try {
                iArr4[ni0.a.FAMILY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ni0.a.PENSIONER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ni0.a.UNIVERSITY_STUDENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ni0.a.VEHICLE_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ni0.a.DRIVING_LICENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ni0.a.MOBILE_ID_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ni0.a.NURSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ni0.a.MIDWIFE.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ni0.a.DOCTOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ni0.a.DENTIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ni0.a.ADVOCATE_DATA.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[ni0.a.DIIA_PL.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[ni0.a.ATTORNEY_AT_LAW.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[ni0.a.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[ni0.a.UUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[ni0.a.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[ni0.a.CIVIL_ENGINEER.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[ni0.a.BAILIFF.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[ni0.a.TAX_ADVISOR.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[ni0.a.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[ni0.a.AUDITOR.ordinal()] = 21;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[ni0.a.PHYSIOTERAPIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[ni0.a.PHARMACIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[ni0.a.PHD_STUDENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[ni0.a.SAFE_BUS.ordinal()] = 25;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[ni0.a.TRAIN_TICKETS.ordinal()] = 26;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[ni0.a.MEDICAL_PRESCRIPTIONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[ni0.a.ENVIRONMENTAL_VIOLATION.ordinal()] = 28;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[ni0.a.MKA_CARD.ordinal()] = 29;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[ni0.a.ABROAD_INFO.ordinal()] = 30;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[ni0.a.PENALTY_POINTS.ordinal()] = 31;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[ni0.a.PAYMENTS.ordinal()] = 32;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr4[ni0.a.PESEL_RESTRICTION.ordinal()] = 33;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[ni0.a.E_VISIT_ZUS.ordinal()] = 34;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[ni0.a.VEHICLE_HISTORY.ordinal()] = 35;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[ni0.a.AIR_QUALITY.ordinal()] = 36;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr4[ni0.a.ELECTORAL_REGISTER.ordinal()] = 37;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr4[ni0.a.FINES.ordinal()] = 38;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr4[ni0.a.MY_CASES.ordinal()] = 39;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr4[ni0.a.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 40;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr4[ni0.a.DOCUMENT_SIGN.ordinal()] = 41;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr4[ni0.a.COMPANY.ordinal()] = 42;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr4[ni0.a.VEHICLE_COLLISION.ordinal()] = 43;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr4[ni0.a.NETWORK_SECURITY_ISSUES.ordinal()] = 44;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr4[ni0.a.FLOOD_ALERT.ordinal()] = 45;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr4[ni0.a.APPLICATION_FORM_SERVICES.ordinal()] = 46;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[ni0.a.DRIVER_QUALIFICATIONS.ordinal()] = 47;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr4[ni0.a.ID_CARD_VERIFICATION.ordinal()] = 48;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr4[ni0.a.ID_CARD_COLLECTING.ordinal()] = 49;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr4[ni0.a.MY_IKP.ordinal()] = 50;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr4[ni0.a.QUALIFIED_SIGNATURE.ordinal()] = 51;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr4[ni0.a.SAFETY_GUIDE.ordinal()] = 52;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr4[ni0.a.DOCUMENT_RESTRICTION.ordinal()] = 53;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr4[ni0.a.DEFENCE_TRAINING.ordinal()] = 54;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr4[ni0.a.PASSPORT_PICKUP.ordinal()] = 55;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr4[ni0.a.LAND_REGISTER.ordinal()] = 56;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr4[ni0.a.KRS_DATA.ordinal()] = 57;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr4[ni0.a.SANITARY_VIOLATION.ordinal()] = 58;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr4[ni0.a.TRAVEL_ABROAD.ordinal()] = 59;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr4[ni0.a.VEHICLE_INSURANCE_VERIFICATION.ordinal()] = 60;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr4[ni0.a.UNKNOWN.ordinal()] = 61;
            } catch (NoSuchFieldError unused71) {
            }
            f126681d = iArr4;
        }
    }

    public static final i<b, j> a(StreamMessageResponseDto streamMessageResponseDto) {
        Object objB;
        Object content;
        List listN;
        List listN2;
        dx.j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String responseId = streamMessageResponseDto.getResponseId();
                    if (responseId != null) {
                        b0 b0VarG = c0.g(responseId);
                        List<SourceDto> listF = streamMessageResponseDto.f();
                        if (listF != null) {
                            List<SourceDto> list = listF;
                            listN = new ArrayList(v.y(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                listN.add(f((SourceDto) it.next()));
                            }
                        } else {
                            listN = null;
                        }
                        if (listN == null) {
                            listN = v.n();
                        }
                        List<ActionPlanDto> listA = streamMessageResponseDto.a();
                        if (listA != null) {
                            List<ActionPlanDto> list2 = listA;
                            listN2 = new ArrayList(v.y(list2, 10));
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                listN2.add(c((ActionPlanDto) it4.next()));
                            }
                        } else {
                            listN2 = null;
                        }
                        if (listN2 == null) {
                            listN2 = v.n();
                        }
                        List<String> listG = streamMessageResponseDto.g();
                        if (listG == null) {
                            listG = v.n();
                        }
                        Boolean showRating = streamMessageResponseDto.getShowRating();
                        if (showRating == null) {
                            aVar.b(new b.Parsing(null, 1, null));
                            throw new oq.g();
                        }
                        boolean zBooleanValue = showRating.booleanValue();
                        Integer currentMessages = streamMessageResponseDto.getCurrentMessages();
                        if (currentMessages == null) {
                            aVar.b(new b.Parsing(null, 1, null));
                            throw new oq.g();
                        }
                        content = new j.Metadata(b0VarG, listN, listN2, listG, zBooleanValue, currentMessages.intValue());
                    } else {
                        content = new j.Content(streamMessageResponseDto.getContent());
                    }
                    return new i.Right(content);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private static final BEAction.EnumC4445a b(c cVar) {
        int i15 = cVar == null ? -1 : C3118a.f126680c[cVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? BEAction.EnumC4445a.UNKNOWN : BEAction.EnumC4445a.DOCUMENT;
        }
        return BEAction.EnumC4445a.SERVICE;
    }

    private static final BEAction c(ActionPlanDto actionPlanDto) {
        return new BEAction(actionPlanDto.getName(), c0.g(actionPlanDto.getUrl()), b(actionPlanDto.getActionType()), h(actionPlanDto.getAction()));
    }

    public static final BEConversationData d(ConversationDto conversationDto) {
        return new BEConversationData(c0.g(conversationDto.getConversationId()), g(conversationDto.getStaticMessages()), e(conversationDto.getLimits()));
    }

    public static final BELimits e(ConversationLimitsDto conversationLimitsDto) {
        return new BELimits(conversationLimitsDto.getMaxQuestions(), conversationLimitsDto.getMaxCharacters());
    }

    private static final BESource f(SourceDto sourceDto) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sourceDto.getIndex());
        sb5.append(". ");
        String name = sourceDto.getName();
        if (r.t0(name)) {
            name = sourceDto.getUrl();
        }
        sb5.append(name);
        return new BESource(sb5.toString(), sourceDto.getUrl());
    }

    public static final BEStaticMessages g(StaticMessagesDto staticMessagesDto) {
        return new BEStaticMessages(staticMessagesDto.getWelcomeMessage(), staticMessagesDto.getLimitExceededWarningMessage(), staticMessagesDto.getLimitExceededMessage(), staticMessagesDto.a());
    }

    private static final rq0.a h(ni0.a aVar) {
        switch (aVar == null ? -1 : C3118a.f126681d[aVar.ordinal()]) {
            case -1:
            case 61:
                return null;
            case 0:
            default:
                throw new p();
            case 1:
                return rq0.b.d.FAMILY_CARD;
            case 2:
                return rq0.b.d.PENSIONER_CARD;
            case 3:
                return rq0.b.d.STUDENT_CARD;
            case 4:
                return rq0.b.d.VEHICLE_CARD;
            case 5:
                return rq0.b.d.DRIVING_LICENCE;
            case 6:
                return rq0.b.d.ID_CARD;
            case 7:
                return rq0.b.d.NURSE_CARD;
            case 8:
                return rq0.b.d.MIDWIFE_CARD;
            case 9:
                return rq0.b.EnumC4479b.DOCTOR;
            case 10:
                return rq0.b.EnumC4479b.DENTIST;
            case 11:
                return rq0.b.d.ADVOCATE_CARD;
            case 12:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 13:
                return rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
            case 14:
                return rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
            case 15:
                return rq0.b.d.RAILWAY_CARD;
            case 16:
                return rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            case 17:
                return rq0.b.EnumC4479b.CIVIL_ENGINEER;
            case 18:
                return rq0.b.c.BAILIFF_CARD;
            case 19:
                return rq0.b.EnumC4479b.TAX_ADVISOR;
            case 20:
                return rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 21:
                return rq0.b.EnumC4479b.AUDITOR;
            case 22:
                return rq0.b.EnumC4479b.PHYSIOTHERAPIST;
            case 23:
                return rq0.b.EnumC4479b.PHARMACIST;
            case 24:
                return rq0.b.EnumC4479b.PHD_STUDENT;
            case 25:
                return rq0.c.SAFE_BUS;
            case 26:
                return rq0.c.TRAIN_TICKETS;
            case 27:
                return rq0.c.MEDICAL_PRESCRIPTIONS;
            case 28:
                return rq0.c.GIOS;
            case 29:
                return rq0.c.CRACOW_CITY_CARD;
            case 30:
                return rq0.c.ABROAD_INFO;
            case BERTags.DATE /* 31 */:
                return rq0.c.PENALTY_POINTS;
            case 32:
                return rq0.c.E_PAYMENTS;
            case 33:
                return rq0.c.PESEL_RESTRICTION;
            case 34:
                return rq0.c.ZUS_VISIT;
            case 35:
                return rq0.c.VEHICLE_HISTORY;
            case 36:
                return rq0.c.AIR_QUALITY;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.c.ELECTORAL_REGISTER;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.c.FINES;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.c.MY_CASES;
            case 40:
                return rq0.c.PESEL_RESTRICTION_VERIFICATION;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.c.DOCUMENT_SIGNING;
            case EACTags.CURRENCY_CODE /* 42 */:
                return rq0.c.COMPANY;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.c.VEHICLE_COLLISION;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return rq0.c.NETWORK_SECURITY_ISSUES;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return rq0.c.FLOOD_ALERT;
            case 46:
                return rq0.c.APPLICATION_FORM_SERVICES;
            case 47:
                return rq0.c.DRIVER_QUALIFICATIONS;
            case 48:
                return rq0.c.ID_CARD_VERIFICATION;
            case 49:
                return rq0.c.ID_CARD_COLLECTING;
            case 50:
                return rq0.c.MY_IKP;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return rq0.c.QUALIFIED_SIGNATURE;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return rq0.c.SAFETY_GUIDE;
            case 53:
                return rq0.c.DOCUMENT_RESTRICTION;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return rq0.c.DEFENCE_TRAINING;
            case 55:
                return rq0.c.PASSPORT_PICKUP;
            case 56:
                return rq0.c.LAND_REGISTRY;
            case 57:
                return rq0.c.NATIONAL_COURT_REGISTER;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return rq0.c.SANITARY_VIOLATION;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return rq0.c.TRAVEL_ABROAD;
            case 60:
                return rq0.c.CHECK_VEHICLE_INSURANCE;
        }
    }

    public static final ConversationRatingDto i(BERateConversationModel bERateConversationModel) {
        g.Selected.a option;
        g rating = bERateConversationModel.getRating();
        Integer numValueOf = null;
        g.Selected selected = rating instanceof g.Selected ? (g.Selected) rating : null;
        if (selected != null && (option = selected.getOption()) != null) {
            int i15 = C3118a.f126679b[option.ordinal()];
            int i16 = 1;
            if (i15 != 1) {
                i16 = 2;
                if (i15 != 2) {
                    i16 = 3;
                    if (i15 != 3) {
                        i16 = 4;
                        if (i15 != 4) {
                            i16 = 5;
                            if (i15 != 5) {
                                throw new p();
                            }
                        }
                    }
                }
            }
            numValueOf = Integer.valueOf(i16);
        }
        return new ConversationRatingDto(numValueOf, bERateConversationModel.getReview());
    }

    public static final MessageReplyRatingDto j(BERateAnswerModel bERateAnswerModel) {
        return new MessageReplyRatingDto(k(bERateAnswerModel.getRating()));
    }

    public static final ni0.i k(f fVar) {
        int i15 = C3118a.f126678a[fVar.ordinal()];
        if (i15 == 1) {
            return ni0.i.POSITIVE;
        }
        if (i15 == 2) {
            return ni0.i.NEGATIVE;
        }
        if (i15 == 3) {
            return ni0.i.UNKNOWN;
        }
        throw new p();
    }
}
