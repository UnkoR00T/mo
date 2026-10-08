package jd4;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity;
import er.l;
import er.p;
import f00.f0;
import id4.e4;
import id4.i;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p024c42.e3;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import rd4.e;
import rd4.k;
import sd4.a2;
import sd4.a7;
import sd4.ai;
import sd4.b3;
import sd4.bk;
import sd4.bl;
import sd4.bm;
import sd4.c6;
import sd4.cd;
import sd4.cf;
import sd4.cj;
import sd4.de;
import sd4.dh;
import sd4.ec;
import sd4.eg;
import sd4.ep;
import sd4.f;
import sd4.f1;
import sd4.f4;
import sd4.fn;
import sd4.fo;
import sd4.g2;
import sd4.g7;
import sd4.gi;
import sd4.h3;
import sd4.hk;
import sd4.hl;
import sd4.hm;
import sd4.i6;
import sd4.id;
import sd4.ih;
import sd4.ij;
import sd4.j5;
import sd4.je;
import sd4.jf;
import sd4.kc;
import sd4.kg;
import sd4.l0;
import sd4.l4;
import sd4.ln;
import sd4.lo;
import sd4.m;
import sd4.m1;
import sd4.m2;
import sd4.m7;
import sd4.mb;
import sd4.mm;
import sd4.n3;
import sd4.o6;
import sd4.oh;
import sd4.oi;
import sd4.oj;
import sd4.ol;
import sd4.pe;
import sd4.q5;
import sd4.qc;
import sd4.qd;
import sd4.qg;
import sd4.r0;
import sd4.r4;
import sd4.rf;
import sd4.rn;
import sd4.ro;
import sd4.s2;
import sd4.s7;
import sd4.sb;
import sd4.t1;
import sd4.t3;
import sd4.tm;
import sd4.u6;
import sd4.uh;
import sd4.uk;
import sd4.ve;
import sd4.vi;
import sd4.vj;
import sd4.vl;
import sd4.w5;
import sd4.wc;
import sd4.wd;
import sd4.x4;
import sd4.xf;
import sd4.xg;
import sd4.xn;
import sd4.yb;
import sd4.yo;
import sd4.z;
import sd4.z0;
import sd4.z3;
import sd4.zm;
import td4.j;
import xd4.b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/app/Activity;", "activity", "Lid4/e4;", "appViewModel", "Lrh2/a;", "fragmentNavigator", "Lkotlin/Function0;", "", "hasOnboardingInBackStack", "Loq/i0;", "c", "(Landroid/app/Activity;Lid4/e4;Lrh2/a;Ler/a;Lm2/r;I)V", "clearProcess", "Lr54/c;", "localNotificationItem", "f", "(Lrh2/a;ZLr54/c;)V", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(final Activity activity, final e4 e4Var, final rh2.a aVar, final er.a<Boolean> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1297856870);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(activity) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(e4Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(1297856870, i16, -1, "pl.gov.mc.fringers.mobywatel.presentation.navigation.ApplicationNavigationGraph (ApplicationNavigationGraph.kt:128)");
            }
            xw.b<i> bVarY1 = e4Var.Y1();
            boolean zG = rVarH.G(aVar) | rVarH.G(activity) | ((i16 & 7168) == 2048);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: jd4.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d(aVar, activity, aVar2, (i) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarY1, (l) objE, rVarH, xw.b.f221619c);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: jd4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(activity, e4Var, aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(rh2.a aVar, Activity activity, er.a aVar2, i iVar) {
        e3 details;
        ih ihVarB;
        if (iVar instanceof i.ToHome) {
            if (((i.ToHome) iVar).getIsUserLogged()) {
                g(aVar, false, null, 4, null);
            } else {
                jj2.b.a(activity, Boolean.FALSE);
            }
        } else if (iVar instanceof i.ToLegacyLogin) {
            jj2.b.a(activity, Boolean.valueOf(((i.ToLegacyLogin) iVar).getIsLocked()));
        } else if (fr.t.c(iVar, i.q1.f91729a)) {
            activity.startActivity(new Intent(activity, (Class<?>) OssLicensesMenuActivity.class));
            OssLicensesMenuActivity.P0(activity.getString(pl.gov.mc.fringers.mobywatel.f0.f160738u));
        } else if (iVar instanceof i.ToOnboarding) {
            i.ToOnboarding toOnboarding = (i.ToOnboarding) iVar;
            if (toOnboarding.getClearProcesses() || !((Boolean) aVar2.a()).booleanValue()) {
                aVar.b(eg.INSTANCE.a(toOnboarding.getResetPassword(), toOnboarding.getShowAppNotActivatedDialog()), "TAG_ONBOARDING", toOnboarding.getClearProcesses() ? rh2.a.EnumC4442a.POP_TO_EXISTING_CLEAR_BACKSTACK_WHEN_DOES_NOT_EXIST : rh2.a.EnumC4442a.MOVE_EXISTING_TO_FRONT);
            }
        } else if (iVar instanceof i.Login) {
            i.Login login = (i.Login) iVar;
            aVar.b(qd.INSTANCE.a(login.getRedirectionPoint()), "TAG_LOGIN", login.getExistingFragmentNavigation());
        } else if (iVar instanceof i.MalwareDetected) {
            i.MalwareDetected malwareDetected = (i.MalwareDetected) iVar;
            rh2.a.a(aVar, hm.INSTANCE.a(new wd4.a.MalwareDetection(malwareDetected.getDangerousToolsName(), malwareDetected.getDangerousToolsPackage())), "TAG_SECURITY_ALERT_FRAGMENT", null, 4, null);
        } else if (fr.t.c(iVar, i.c.f91651a)) {
            rh2.a.a(aVar, hm.INSTANCE.a(wd4.a.c.f212542a), "TAG_SECURITY_ALERT_FRAGMENT", null, 4, null);
        } else if (fr.t.c(iVar, i.d.f91656a)) {
            rh2.a.a(aVar, hm.INSTANCE.a(wd4.a.b.f212540a), "TAG_SECURITY_ALERT_FRAGMENT", null, 4, null);
        } else if (iVar instanceof i.StudentCardActivated) {
            g(aVar, ((i.StudentCardActivated) iVar).getClearProcess(), null, 4, null);
            rh2.a.a(aVar, new vl(), "TAG_STUDENT_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.f.f91667a)) {
            rh2.a.a(aVar, new f(), "AboutApplicationFragment", null, 4, null);
        } else if (iVar instanceof i.ToAddDocument) {
            i.ToAddDocument toAddDocument = (i.ToAddDocument) iVar;
            rh2.a.a(aVar, !toAddDocument.getEvent().getForceLegacyScreen() ? z.INSTANCE.a(toAddDocument.getEvent().getCanNavigateBack(), toAddDocument.getEvent().getDestination(), toAddDocument.getEvent().getIsCertUpdate(), toAddDocument.getEvent().getEIdActivationData()) : z.Companion.b(z.INSTANCE, toAddDocument.getEvent().getCanNavigateBack(), zw0.a.ToAddDocument.EnumC6430a.ASYNC_DOCUMENTS_LIST, false, null, 12, null), "FRAGMENT_TAG_FEATURE_ADD_DOCUMENT", null, 4, null);
        } else if (iVar instanceof i.ToAddJuniorSchoolCard) {
            rh2.a.a(aVar, m.INSTANCE.a(((i.ToAddJuniorSchoolCard) iVar).getFromDynamicDocumentsList()), "TAG_ACTIVATE_JUNIOR_SCHOOL_CARD", null, 4, null);
        } else if (iVar instanceof i.C2175i) {
            rh2.a.a(aVar, sd4.t.Companion.b(sd4.t.INSTANCE, true, false, 2, null), "TAG_ACTIVATE_STUDENT_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.j.f91688a)) {
            rh2.a.a(aVar, new sd4.f0(), "TAG_ADVOCATE_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.k.f91696a)) {
            rh2.a.a(aVar, l0.INSTANCE.a(), "TAG_AIR_QUALITY", null, 4, null);
        } else if (fr.t.c(iVar, i.l.f91701a)) {
            rh2.a.a(aVar, ro.INSTANCE.a(), "TAG_WHATS_NEW_FRAGMENT", null, 4, null);
        } else if (fr.t.c(iVar, i.m.f91707a)) {
            rh2.a.a(aVar, e.INSTANCE.a(), "TAG_APP_RATING", null, 4, null);
        } else if (fr.t.c(iVar, i.n.f91712a)) {
            rh2.a.a(aVar, bm.INSTANCE.a(vd4.a.b.f206267a), "TAG_TECHNICAL_SUPPORT", null, 4, null);
        } else if (fr.t.c(iVar, i.o.f91717a)) {
            rh2.a.a(aVar, new r0(), "AppearanceFeatureFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.p.f91722a)) {
            rh2.a.a(aVar, g7.Companion.b(g7.INSTANCE, null, 1, null), "TAG_GENERIC_APPLICATIONS", null, 4, null);
        } else if (iVar instanceof i.ToApplicationLockGlobalEvent) {
            rh2.a.a(aVar, z0.INSTANCE.a(((i.ToApplicationLockGlobalEvent) iVar).getEntryPoint()), "ApplicationLockFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.r.f91732a)) {
            rh2.a.a(aVar, td4.f.INSTANCE.a(j.a.f189769a), "TAG_SERVICE", null, 4, null);
        } else if (fr.t.c(iVar, i.s.f91736a)) {
            rh2.a.a(aVar, new f1(), "TAG_CASES", null, 4, null);
        } else if (fr.t.c(iVar, i.t.f91740a)) {
            rh2.a.a(aVar, new m1(), "CertificatesFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.u.f91744a)) {
            rh2.a.a(aVar, new t1(), "ChatBotFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.v.f91750a)) {
            rh2.a.a(aVar, a2.INSTANCE.a(), "CHECK_VEHICLE_INSURANCE_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.w.f91754a)) {
            rh2.a.a(aVar, new g2(), "TAG_CHILD_BIRTH_REGISTRATION", null, 4, null);
        } else if (fr.t.c(iVar, i.x.f91758a)) {
            rh2.a.a(aVar, n3.INSTANCE.a(kk1.a.CHILD), "DEPENDENT_ID_INVALIDATION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.y.f91762a)) {
            rh2.a.a(aVar, t3.INSTANCE.a(mm1.a.CHILD), "DEPENDENT_ID_SUSPENSION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.z.f91766a)) {
            rh2.a.a(aVar, m2.INSTANCE.a(), "CHILD_PASSPORT_APPLICATION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.a0.f91638a)) {
            rh2.a.a(aVar, new ln(), "TAG_VEHICLE_COLLISION", null, 4, null);
        } else if (fr.t.c(iVar, i.b0.f91647a)) {
            rh2.a.a(aVar, new s2(), "CompanyFragment", null, 4, null);
        } else if (iVar instanceof i.ToConfirmation) {
            rh2.a.a(aVar, tm.INSTANCE.a(((i.ToConfirmation) iVar).getData()), "TrustedProfileConfirmationFragment", null, 4, null);
        } else if (iVar instanceof i.ToDashboard) {
            g(aVar, ((i.ToDashboard) iVar).getClearProcess(), null, 4, null);
        } else if (iVar instanceof i.ToDashboardWithNotificationNavigation) {
            i.ToDashboardWithNotificationNavigation toDashboardWithNotificationNavigation = (i.ToDashboardWithNotificationNavigation) iVar;
            f(aVar, toDashboardWithNotificationNavigation.getClearProcess(), toDashboardWithNotificationNavigation.getLocalNotificationItem());
        } else if (iVar instanceof i.ToDefaultNotificationDetails) {
            rh2.a.a(aVar, jf.INSTANCE.a(((i.ToDefaultNotificationDetails) iVar).getData()), "NotificationDetailsFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.h0.f91679a)) {
            rh2.a.a(aVar, new h3(), "DEFENCE_TRAINING_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.i0.f91684a)) {
            rh2.a.a(aVar, z3.INSTANCE.a(), "TAG_DEPUTY_CARD", null, 4, null);
        } else if (iVar instanceof i.j0) {
            aVar.b(new k(), "TAG_FRAGMENT_FEATURE", rh2.a.EnumC4442a.MOVE_EXISTING_TO_FRONT);
        } else if (fr.t.c(iVar, i.k0.f91697a)) {
            rh2.a.a(aVar, new f4(), "TAG_DIIA", null, 4, null);
        } else if (fr.t.c(iVar, i.l0.f91702a)) {
            rh2.a.a(aVar, new l4(), "DocumentRestrictionFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.m0.f91708a)) {
            rh2.a.a(aVar, r4.INSTANCE.a(), "DRIVER_QUALIFICATIONS_TAG", null, 4, null);
        } else if (iVar instanceof i.ToDrivingLicence) {
            rh2.a.a(aVar, x4.Companion.b(x4.INSTANCE, null, ((i.ToDrivingLicence) iVar).getIsTemporary(), 1, null), "DrivingLicenceFragment", null, 4, null);
        } else if (iVar instanceof i.ToDynamicDocument) {
            rh2.a.a(aVar, sd4.d5.INSTANCE.a(((i.ToDynamicDocument) iVar).getDynamicDocumentType()), "DYNAMIC_DOCUMENT", null, 4, null);
        } else if (iVar instanceof i.ToDynamicMultiDocument) {
            rh2.a.a(aVar, j5.INSTANCE.a(((i.ToDynamicMultiDocument) iVar).getDynamicMultiDocumentType()), "DYNAMIC_MUTLI_DOCUMENT", null, 4, null);
        } else if (iVar instanceof i.ToEIdServiceGlobalEvent) {
            rh2.a.a(aVar, q5.INSTANCE.a(((i.ToEIdServiceGlobalEvent) iVar).getEvent()), "EIdServicesFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.r0.f91733a)) {
            rh2.a.a(aVar, new w5(), "TAG_ELECTORAL_REGISTER", null, 4, null);
        } else if (fr.t.c(iVar, i.s0.f91737a)) {
            rh2.a.a(aVar, new c6(), "TAG_ELECTORAL_SUPPORT", null, 4, null);
        } else if (fr.t.c(iVar, i.t0.f91741a)) {
            rh2.a.a(aVar, i6.INSTANCE.a(), "TAG_ELECTRONIC_DELIVERY", null, 4, null);
        } else if (iVar instanceof i.ToExtendStudentCardValidity) {
            rh2.a.a(aVar, sd4.t.INSTANCE.a(false, ((i.ToExtendStudentCardValidity) iVar).getClearProcess()), "TAG_ACTIVATE_STUDENT_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.v0.f91751a)) {
            rh2.a.a(aVar, new o6(), "TAG_FAMILY_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.w0.f91755a)) {
            rh2.a.a(aVar, new u6(), "TAG_FINES", null, 4, null);
        } else if (fr.t.c(iVar, i.x0.f91759a)) {
            rh2.a.a(aVar, new a7(), "FloodAlertFragment", null, 4, null);
        } else if (iVar instanceof i.ToGenericApplicationForms) {
            rh2.a.a(aVar, g7.INSTANCE.a(((i.ToGenericApplicationForms) iVar).getData()), "TAG_GENERIC_APPLICATIONS", null, 4, null);
        } else if (fr.t.c(iVar, i.z0.f91767a)) {
            rh2.a.a(aVar, new m7(), "TAG_GIOS", null, 4, null);
        } else if (fr.t.c(iVar, i.a1.f91639a)) {
            rh2.a.a(aVar, bm.INSTANCE.a(vd4.a.C5389a.f206265a), "TAG_TECHNICAL_SUPPORT", null, 4, null);
        } else if (fr.t.c(iVar, i.b1.f91648a)) {
            rh2.a.a(aVar, s7.INSTANCE.a(), "HEATING_SUPPLEMENT_TAG", null, 4, null);
        } else if (iVar instanceof i.ToHistory) {
            rh2.a.a(aVar, mb.INSTANCE.a(((i.ToHistory) iVar).getExcludeItems()), "HistoryFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.e1.f91664a)) {
            rh2.a.a(aVar, td4.f.INSTANCE.a(j.c.f189773a), "TAG_SERVICE", null, 4, null);
        } else if (fr.t.c(iVar, i.f1.f91670a)) {
            rh2.a.a(aVar, sb.INSTANCE.a(), "ID_CARD_COLLECTING_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.g1.f91675a)) {
            rh2.a.a(aVar, yb.INSTANCE.a(), "ID_VERIFICATION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.h1.f91680a)) {
            rh2.a.a(aVar, ec.INSTANCE.a(), "IDENTITY_CARD_INVALIDATION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.i1.f91685a)) {
            rh2.a.a(aVar, kc.INSTANCE.a(), "IDENTITY_CARD_SUSPENSION_TAG", null, 4, null);
        } else if (iVar instanceof i.ToIdentityConfirmation) {
            rh2.a.a(aVar, vi.INSTANCE.a(((i.ToIdentityConfirmation) iVar).getDestination()), "TAG_QUALIFIED_SIGNATURE", null, 4, null);
        } else if (fr.t.c(iVar, i.k1.f91698a)) {
            rh2.a.a(aVar, new qc(), "INCIDENT_REPORT_TAG", null, 4, null);
        } else if (iVar instanceof i.ToInstantPaymentsDetails) {
            i.ToInstantPaymentsDetails toInstantPaymentsDetails = (i.ToInstantPaymentsDetails) iVar;
            rh2.a.a(aVar, ih.Companion.b(ih.INSTANCE, toInstantPaymentsDetails.getPaymentId(), null, toInstantPaymentsDetails.getNavigateBackToDashboard(), new e3.Details(toInstantPaymentsDetails.getPaymentId()), 2, null), "TAG_PAYMENTS", null, 4, null);
        } else if (fr.t.c(iVar, i.m1.f91709a)) {
            rh2.a.a(aVar, new wc(), "InternetAccessFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.n1.f91714a)) {
            rh2.a.a(aVar, new cd(), "LAND_REGISTRY_TRAINING_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.p1.f91724a)) {
            rh2.a.a(aVar, new id(), "LegalInformationFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.r1.f91734a)) {
            rh2.a.a(aVar, new wd(), "TAG_MIDCARD", null, 4, null);
        } else if (fr.t.c(iVar, i.s1.f91738a)) {
            aVar.b(new de(), "TAG_MJUNIOR", rh2.a.EnumC4442a.MOVE_EXISTING_TO_FRONT);
        } else if (iVar instanceof i.ToMakeProposalService) {
            rh2.a.a(aVar, td4.f.INSTANCE.a(new j.d(((i.ToMakeProposalService) iVar).getSupplementOrigin())), "TAG_SERVICE", null, 4, null);
        } else if (fr.t.c(iVar, i.u1.f91746a)) {
            rh2.a.a(aVar, new je(), "TAG_MIDWIFE", null, 4, null);
        } else if (fr.t.c(iVar, i.v1.f91752a)) {
            rh2.a.a(aVar, new pe(), "MY_IKP_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.w1.f91756a)) {
            rh2.a.a(aVar, new ve(), "NATIONAL_COURT_REGISTER_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.x1.f91760a)) {
            rh2.a.a(aVar, new cf(), "NetworkSecurityIssuesFragment", null, 4, null);
        } else if (iVar instanceof i.ToNotification) {
            rh2.a.a(aVar, rf.Companion.b(rf.INSTANCE, null, ((i.ToNotification) iVar).getDestination(), 1, null), "NotificationListFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.z1.f91768a)) {
            rh2.a.a(aVar, new xf(), "TAG_NURSE", null, 4, null);
        } else if (fr.t.c(iVar, i.b2.f91649a)) {
            rh2.a.a(aVar, kg.INSTANCE.a(), "PASSPORT_AGREEMENT_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.c2.f91654a)) {
            rh2.a.a(aVar, qg.INSTANCE.a(), "PASSPORT_AGREEMENT_MANAGEMENT_TAG", null, 4, null);
        } else if (iVar instanceof i.ToPassportInvalidation) {
            rh2.a.a(aVar, xg.INSTANCE.a(((i.ToPassportInvalidation) iVar).getPassportNumber()), "TAG_PASSPORT_INVALIDATION", null, 4, null);
        } else if (fr.t.c(iVar, i.e2.f91665a)) {
            rh2.a.a(aVar, new dh(), "PassportPickupFragment", null, 4, null);
        } else if (iVar instanceof i.ToPayments) {
            i.ToPayments toPayments = (i.ToPayments) iVar;
            w32.b.ToPayments.InterfaceC5522a destination = toPayments.getEvent().getDestination();
            if (destination instanceof w32.b.ToPayments.InterfaceC5522a.C5523a) {
                details = new e3.Details(((w32.b.ToPayments.InterfaceC5522a.C5523a) destination).a());
            } else {
                if (!fr.t.c(destination, w32.b.ToPayments.InterfaceC5522a.C5524b.f210183a)) {
                    throw new oq.p();
                }
                details = e3.b.f23168a;
            }
            e3 e3Var = details;
            w32.b.ToPayments.InterfaceC5522a destination2 = toPayments.getEvent().getDestination();
            if (destination2 instanceof w32.b.ToPayments.InterfaceC5522a.C5523a) {
                ihVarB = ih.Companion.b(ih.INSTANCE, ((w32.b.ToPayments.InterfaceC5522a.C5523a) destination2).a(), null, toPayments.getEvent().getNavigateBackToDashboard(), e3Var, 2, null);
            } else {
                if (!fr.t.c(destination2, w32.b.ToPayments.InterfaceC5522a.C5524b.f210183a)) {
                    throw new oq.p();
                }
                ihVarB = ih.Companion.b(ih.INSTANCE, null, null, toPayments.getEvent().getNavigateBackToDashboard(), e3Var, 3, null);
            }
            rh2.a.a(aVar, ihVarB, "TAG_PAYMENTS", null, 4, null);
        } else if (fr.t.c(iVar, i.h2.f91681a)) {
            rh2.a.a(aVar, new uh(), "TAG_PENSIONER_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.i2.f91686a)) {
            rh2.a.a(aVar, new ai(), "PeselRestrictionFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.j2.f91691a)) {
            rh2.a.a(aVar, new gi(), "PESEL_RESTRICTION_VERIFICATION", null, 4, null);
        } else if (fr.t.c(iVar, i.k2.f91699a)) {
            rh2.a.a(aVar, oi.INSTANCE.a(lv2.a.CHILD), "TAG_PHYSICAL_ID_CARD_APPLICATION", null, 4, null);
        } else if (fr.t.c(iVar, i.l2.f91705a)) {
            rh2.a.a(aVar, oi.INSTANCE.a(lv2.a.MYSELF), "TAG_PHYSICAL_ID_CARD_APPLICATION", null, 4, null);
        } else if (fr.t.c(iVar, i.m2.f91710a)) {
            rh2.a.a(aVar, oi.INSTANCE.a(lv2.a.WARD), "TAG_PHYSICAL_ID_CARD_APPLICATION", null, 4, null);
        } else if (fr.t.c(iVar, i.n2.f91715a)) {
            rh2.a.a(aVar, td4.f.INSTANCE.a(j.e.f189777a), "TAG_SERVICE", null, 4, null);
        } else if (fr.t.c(iVar, i.o2.f91720a)) {
            rh2.a.a(aVar, vi.INSTANCE.a(cz2.a.b.f38819a), "TAG_QUALIFIED_SIGNATURE", null, 4, null);
        } else if (fr.t.c(iVar, i.p2.f91725a)) {
            rh2.a.a(aVar, new cj(), "RegisteredAddressFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.q2.f91730a)) {
            rh2.a.a(aVar, bm.INSTANCE.a(vd4.a.b.f206267a), "TAG_TECHNICAL_SUPPORT", null, 4, null);
        } else if (fr.t.c(iVar, i.r2.f91735a)) {
            rh2.a.a(aVar, ij.Companion.b(ij.INSTANCE, null, 1, null), "SafeBusFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.s2.f91739a)) {
            rh2.a.a(aVar, new oj(), "SafetyGuideFragment", null, 4, null);
        } else if (fr.t.c(iVar, i.t2.f91743a)) {
            rh2.a.a(aVar, new vj(), "TAG_SANITARY", null, 4, null);
        } else if (fr.t.c(iVar, i.x2.f91761a)) {
            rh2.a.a(aVar, uk.INSTANCE.a(), "SCHOOL_DASHBOARD_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSettings) {
            rh2.a.a(aVar, ol.INSTANCE.a(((i.ToSettings) iVar).getEntryPoint(), null), "TAG_SETTINGS", null, 4, null);
        } else if (fr.t.c(iVar, i.d3.f91661a)) {
            rh2.a.a(aVar, new vl(), "TAG_STUDENT_CARD", null, 4, null);
        } else if (fr.t.c(iVar, i.e3.f91666a)) {
            rh2.a.a(aVar, mm.Companion.b(mm.INSTANCE, null, 1, null), "TRAVEL_ABROAD_TAG", null, 4, null);
        } else if (iVar instanceof i.ToTravelAbroadCountryDetails) {
            g(aVar, true, null, 4, null);
            rh2.a.a(aVar, mm.INSTANCE.a(((i.ToTravelAbroadCountryDetails) iVar).getCountryIso()), "TRAVEL_ABROAD_TAG", null, 4, null);
        } else if (iVar instanceof i.ToUserData) {
            rh2.a.a(aVar, zm.INSTANCE.a(((i.ToUserData) iVar).getForceFetchNewPassports()), "TAG_USER_DATA", null, 4, null);
        } else if (fr.t.c(iVar, i.h3.f91682a)) {
            rh2.a.a(aVar, fn.INSTANCE.a(), "TAG_UUT_CARD", null, 4, null);
        } else if (iVar instanceof i.ToVehicleCard) {
            rh2.a.a(aVar, fo.INSTANCE.a(((i.ToVehicleCard) iVar).getDestination()), "TAG_VEHICLES", null, 4, null);
        } else if (iVar instanceof i.ToVehicleHistory) {
            i.ToVehicleHistory toVehicleHistory = (i.ToVehicleHistory) iVar;
            rh2.a.a(aVar, rn.Companion.b(rn.INSTANCE, null, toVehicleHistory.getVin(), toVehicleHistory.getPlate(), toVehicleHistory.getSkipForm(), toVehicleHistory.getFirstRegistrationDate(), 1, null), "VehicleHistoryFragment", null, 4, null);
        } else if (iVar instanceof i.ToVerificationGlobalEvent) {
            rh2.a.a(aVar, b0.INSTANCE.a(((i.ToVerificationGlobalEvent) iVar).getEntryPoint()), "TAG_VERIFICATION", null, 4, null);
        } else if (fr.t.c(iVar, i.m3.f91711a)) {
            rh2.a.a(aVar, lo.INSTANCE.a(), "TAG_VOTE_IDEA", null, 4, null);
        } else if (fr.t.c(iVar, i.n3.f91716a)) {
            rh2.a.a(aVar, n3.INSTANCE.a(kk1.a.WARD), "DEPENDENT_ID_INVALIDATION_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.o3.f91721a)) {
            rh2.a.a(aVar, t3.INSTANCE.a(mm1.a.WARD), "DEPENDENT_ID_SUSPENSION_TAG", null, 4, null);
        } else if (iVar instanceof i.ToWruDocument) {
            rh2.a.a(aVar, yo.INSTANCE.a(((i.ToWruDocument) iVar).getLicenceCode()), "TAG_WRU", null, 4, null);
        } else if (fr.t.c(iVar, i.q3.f91731a)) {
            rh2.a.a(aVar, ep.INSTANCE.a(), "TAG_ZUS_VISIT", null, 4, null);
        } else if (iVar instanceof i.ToSchoolGrades) {
            rh2.a.a(aVar, bl.INSTANCE.a(((i.ToSchoolGrades) iVar).getStudentId()), "SCHOOL_GRADES_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolAttendance) {
            rh2.a.a(aVar, bk.INSTANCE.a(((i.ToSchoolAttendance) iVar).getStudentId()), "SCHOOL_ATTENDANCE_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolAbsenceStatusDetails) {
            i.ToSchoolAbsenceStatusDetails toSchoolAbsenceStatusDetails = (i.ToSchoolAbsenceStatusDetails) iVar;
            rh2.a.a(aVar, bk.INSTANCE.b(toSchoolAbsenceStatusDetails.getStudentId(), toSchoolAbsenceStatusDetails.getSemesterId(), toSchoolAbsenceStatusDetails.getAttendanceType()), "SCHOOL_ATTENDANCE_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolTimetable) {
            rh2.a.a(aVar, hl.INSTANCE.a(((i.ToSchoolTimetable) iVar).getStudentId()), "SCHOOL_TIMETABLE_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolBehavior) {
            rh2.a.a(aVar, hk.INSTANCE.a(((i.ToSchoolBehavior) iVar).getStudentId()), "SCHOOL_BEHAVIOR_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolGradesDetails) {
            i.ToSchoolGradesDetails toSchoolGradesDetails = (i.ToSchoolGradesDetails) iVar;
            rh2.a.a(aVar, bl.INSTANCE.b(toSchoolGradesDetails.getStudentId(), toSchoolGradesDetails.getGradeId()), "SCHOOL_GRADES_TAG", null, 4, null);
        } else if (iVar instanceof i.ToSchoolLessonDetails) {
            i.ToSchoolLessonDetails toSchoolLessonDetails = (i.ToSchoolLessonDetails) iVar;
            rh2.a.a(aVar, hl.INSTANCE.b(toSchoolLessonDetails.getStudentId(), toSchoolLessonDetails.getLessonId()), "SCHOOL_TIMETABLE_TAG", null, 4, null);
        } else if (fr.t.c(iVar, i.d0.f91657a)) {
            rh2.a.a(aVar, td4.f.INSTANCE.a(j.b.f189771a), "TAG_SERVICE", null, 4, null);
        } else if (fr.t.c(iVar, i.g2.f91676a)) {
            rh2.a.a(aVar, oh.INSTANCE.a(), "TAG_PENALTY_POINTS", null, 4, null);
        } else {
            if (!fr.t.c(iVar, i.k3.f91700a)) {
                throw new oq.p();
            }
            rh2.a.a(aVar, xn.INSTANCE.a(), "VEHICLE_REGISTRATION_TAG", null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Activity activity, e4 e4Var, rh2.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        c(activity, e4Var, aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void f(rh2.a aVar, boolean z15, r54.c cVar) {
        aVar.b(new b3().m2(cVar), "TAG_DASHBOARD", z15 ? rh2.a.EnumC4442a.CLEAR_BACKSTACK_AND_CREATE_NEW : rh2.a.EnumC4442a.POP_TO_EXISTING_CLEAR_BACKSTACK_WHEN_DOES_NOT_EXIST);
    }

    static /* synthetic */ void g(rh2.a aVar, boolean z15, r54.c cVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            cVar = null;
        }
        f(aVar, z15, cVar);
    }
}
