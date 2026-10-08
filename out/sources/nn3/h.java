package nn3;

import b30.AccordionData;
import b30.AccordionElement;
import bn3.DistanceMeter;
import bn3.DocumentModel;
import bn3.TimeMeter;
import bn3.VehicleDocumentContainerData;
import bn3.VehicleDocumentData;
import bn3.VehicleInsuranceModel;
import er.l;
import fr.t;
import fu.r;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iq0.q;
import j30.ButtonTextData;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kn3.m;
import kn3.n;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import o50.SmallCardData;
import on3.VehicleDetailsBottomSheetModel;
import on3.VehicleDetailsHeaderModel;
import on3.VehicleDetailsScreenModel;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'BU\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\u00020#*\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b$\u0010%J#\u0010*\u001a\u00020)2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020,*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\b\u0012\u0004\u0012\u0002000/*\u00020\u0017H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\b\u0012\u0004\u0012\u0002000/*\u00020\u0017H\u0002¢\u0006\u0004\b3\u00102J\u0019\u00104\u001a\b\u0012\u0004\u0012\u0002000/*\u00020\u0017H\u0002¢\u0006\u0004\b4\u00102J\u0015\u00107\u001a\u0004\u0018\u000106*\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\b\u0012\u0004\u0012\u0002000/*\u00020\u0017H\u0002¢\u0006\u0004\b9\u00102J\u0015\u0010:\u001a\u0004\u0018\u000106*\u000205H\u0002¢\u0006\u0004\b:\u00108J!\u0010;\u001a\b\u0012\u0004\u0012\u0002000/*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0/2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020&*\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010G\u001a\u00020,2\b\b\u0001\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bG\u0010HJ#\u0010K\u001a\u00020)2\b\u0010I\u001a\u0004\u0018\u00010&2\b\b\u0001\u0010J\u001a\u00020DH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020)2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020)¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020)¢\u0006\u0004\bU\u0010TJ\r\u0010V\u001a\u00020)¢\u0006\u0004\bV\u0010TJ\r\u0010W\u001a\u00020)¢\u0006\u0004\bW\u0010TJ\r\u0010X\u001a\u00020)¢\u0006\u0004\bX\u0010TJ\u0017\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lnn3/h;", "Lxw/f;", "Lnn3/h$a;", "Lkn3/n$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Ltn3/e;", "Ldn3/a$a;", "insuranceValidityResolver", "Ldn3/a$b;", "technicalExaminationValidityResolver", "Lv20/a;", "documentValidityBannerMapper", "Lxm3/a;", "getVehicleIconByTypeUseCase", "Ltn3/a;", "insurancePicker", "<init>", "(Lmx/c;Lez/e;Lez/c;Ltn3/e;Ltn3/e;Lv20/a;Lxm3/a;Ltn3/a;)V", "Lbn3/h;", "data", "params", "Lkn3/m$a;", "state", "Lon3/d;", "z", "(Lbn3/h;Lnn3/h$a;Lkn3/m$a;)Lon3/d;", "Lkotlin/Function0;", "Loq/i0;", "copyVinNumber", "copyRegistrationNumber", "Lon3/c;", "l", "(Lbn3/h;Ler/a;Ler/a;)Lon3/c;", "", "a", "b", "Lmx/a;", "W", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "Ln50/g;", "v", "(Lbn3/h;Lnn3/h$a;)Ln50/g;", "", "Ln50/k;", "s", "(Lbn3/h;)Ljava/util/List;", "m", "u", "Lbn3/g;", "Lbn3/c;", "R", "(Lbn3/g;)Lbn3/c;", "q", "Q", "I", "(Lbn3/h;Lnn3/h$a;)Ljava/util/List;", "Lc30/b$c;", "J", "(Lnn3/h$a;)Ljava/util/List;", "Ljava/math/BigDecimal;", "unit", "M", "(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;", "", AnnotatedPrivateKey.LABEL, "value", "r", "(ILjava/lang/String;)Ln50/g;", "text", "tagId", "T", "(Ljava/lang/String;I)Lmx/a;", "Ljava/time/OffsetDateTime;", "offsetDateTime", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/time/OffsetDateTime;)Lmx/a;", "X", "(Lnn3/h$a;)Lkn3/n$a;", "V", "()Lmx/a;", "U", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "O", ip.a.f96137b, "Ljava/time/LocalDate;", "K", "(Lbn3/h;)Ljava/time/LocalDate;", "Lmx/c;", "Lez/e;", "c", "Lez/c;", "d", "Ltn3/e;", "e", "f", "Lv20/a;", "g", "Lxm3/a;", "h", "Ltn3/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tn3.e<dn3.a.Insurance> insuranceValidityResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tn3.e<dn3.a.TechnicalExamination> technicalExaminationValidityResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v20.a documentValidityBannerMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xm3.a getVehicleIconByTypeUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final tn3.a insurancePicker;

    /* JADX INFO: renamed from: nn3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R)\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b2\u00107R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b0\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b$\u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b(\u0010+R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b8\u0010+R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b9\u00107R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b,\u0010+R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b4\u0010+¨\u0006:"}, d2 = {"Lnn3/h$a;", "", "Lkn3/m;", "vehicleListState", "Lkotlin/Function0;", "Loq/i0;", "onRefreshVehicleDetailsClick", "onVehicleHistoryClick", "onVehicleCollisionClicked", "onFinesClicked", "onPenaltyPointsClicked", "onCloseBottomSheetClick", "Lkotlin/Function1;", "", "Lg70/b;", "goToMoreDialog", "goToEuroEmissionStandardsInfo", "closeInsuranceExpirationAlert", "closeTechnicalExamExpirationAlert", "onReportErrorClick", "", "vehicleDetailsAccordionExpand", "copyVinNumber", "copyRegistrationNumber", "onCloseAction", "<init>", "(Lkn3/m;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkn3/m;", "p", "()Lkn3/m;", "b", "Ler/a;", "k", "()Ler/a;", "c", "n", "d", "m", "e", "i", "f", "j", "g", "h", "Ler/l;", "()Ler/l;", "l", "o", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m vehicleListState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefreshVehicleDetailsClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVehicleHistoryClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVehicleCollisionClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFinesClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPenaltyPointsClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseBottomSheetClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<List<ShortcutMoreTransferData>, i0> goToMoreDialog;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToEuroEmissionStandardsInfo;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeInsuranceExpirationAlert;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeTechnicalExamExpirationAlert;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReportErrorClick;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> vehicleDetailsAccordionExpand;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> copyVinNumber;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> copyRegistrationNumber;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m mVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super List<ShortcutMoreTransferData>, i0> lVar, er.a<i0> aVar7, er.a<i0> aVar8, er.a<i0> aVar9, er.a<i0> aVar10, l<? super Boolean, i0> lVar2, er.a<i0> aVar11, er.a<i0> aVar12, er.a<i0> aVar13) {
            this.vehicleListState = mVar;
            this.onRefreshVehicleDetailsClick = aVar;
            this.onVehicleHistoryClick = aVar2;
            this.onVehicleCollisionClicked = aVar3;
            this.onFinesClicked = aVar4;
            this.onPenaltyPointsClicked = aVar5;
            this.onCloseBottomSheetClick = aVar6;
            this.goToMoreDialog = lVar;
            this.goToEuroEmissionStandardsInfo = aVar7;
            this.closeInsuranceExpirationAlert = aVar8;
            this.closeTechnicalExamExpirationAlert = aVar9;
            this.onReportErrorClick = aVar10;
            this.vehicleDetailsAccordionExpand = lVar2;
            this.copyVinNumber = aVar11;
            this.copyRegistrationNumber = aVar12;
            this.onCloseAction = aVar13;
        }

        public final er.a<i0> a() {
            return this.closeInsuranceExpirationAlert;
        }

        public final er.a<i0> b() {
            return this.closeTechnicalExamExpirationAlert;
        }

        public final er.a<i0> c() {
            return this.copyRegistrationNumber;
        }

        public final er.a<i0> d() {
            return this.copyVinNumber;
        }

        public final er.a<i0> e() {
            return this.goToEuroEmissionStandardsInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.vehicleListState, params.vehicleListState) && t.c(this.onRefreshVehicleDetailsClick, params.onRefreshVehicleDetailsClick) && t.c(this.onVehicleHistoryClick, params.onVehicleHistoryClick) && t.c(this.onVehicleCollisionClicked, params.onVehicleCollisionClicked) && t.c(this.onFinesClicked, params.onFinesClicked) && t.c(this.onPenaltyPointsClicked, params.onPenaltyPointsClicked) && t.c(this.onCloseBottomSheetClick, params.onCloseBottomSheetClick) && t.c(this.goToMoreDialog, params.goToMoreDialog) && t.c(this.goToEuroEmissionStandardsInfo, params.goToEuroEmissionStandardsInfo) && t.c(this.closeInsuranceExpirationAlert, params.closeInsuranceExpirationAlert) && t.c(this.closeTechnicalExamExpirationAlert, params.closeTechnicalExamExpirationAlert) && t.c(this.onReportErrorClick, params.onReportErrorClick) && t.c(this.vehicleDetailsAccordionExpand, params.vehicleDetailsAccordionExpand) && t.c(this.copyVinNumber, params.copyVinNumber) && t.c(this.copyRegistrationNumber, params.copyRegistrationNumber) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<List<ShortcutMoreTransferData>, i0> f() {
            return this.goToMoreDialog;
        }

        public final er.a<i0> g() {
            return this.onCloseAction;
        }

        public final er.a<i0> h() {
            return this.onCloseBottomSheetClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.vehicleListState.hashCode() * 31) + this.onRefreshVehicleDetailsClick.hashCode()) * 31) + this.onVehicleHistoryClick.hashCode()) * 31) + this.onVehicleCollisionClicked.hashCode()) * 31) + this.onFinesClicked.hashCode()) * 31) + this.onPenaltyPointsClicked.hashCode()) * 31) + this.onCloseBottomSheetClick.hashCode()) * 31) + this.goToMoreDialog.hashCode()) * 31) + this.goToEuroEmissionStandardsInfo.hashCode()) * 31) + this.closeInsuranceExpirationAlert.hashCode()) * 31) + this.closeTechnicalExamExpirationAlert.hashCode()) * 31) + this.onReportErrorClick.hashCode()) * 31) + this.vehicleDetailsAccordionExpand.hashCode()) * 31) + this.copyVinNumber.hashCode()) * 31) + this.copyRegistrationNumber.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onFinesClicked;
        }

        public final er.a<i0> j() {
            return this.onPenaltyPointsClicked;
        }

        public final er.a<i0> k() {
            return this.onRefreshVehicleDetailsClick;
        }

        public final er.a<i0> l() {
            return this.onReportErrorClick;
        }

        public final er.a<i0> m() {
            return this.onVehicleCollisionClicked;
        }

        public final er.a<i0> n() {
            return this.onVehicleHistoryClick;
        }

        public final l<Boolean, i0> o() {
            return this.vehicleDetailsAccordionExpand;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final m getVehicleListState() {
            return this.vehicleListState;
        }

        public String toString() {
            return "Params(vehicleListState=" + this.vehicleListState + ", onRefreshVehicleDetailsClick=" + this.onRefreshVehicleDetailsClick + ", onVehicleHistoryClick=" + this.onVehicleHistoryClick + ", onVehicleCollisionClicked=" + this.onVehicleCollisionClicked + ", onFinesClicked=" + this.onFinesClicked + ", onPenaltyPointsClicked=" + this.onPenaltyPointsClicked + ", onCloseBottomSheetClick=" + this.onCloseBottomSheetClick + ", goToMoreDialog=" + this.goToMoreDialog + ", goToEuroEmissionStandardsInfo=" + this.goToEuroEmissionStandardsInfo + ", closeInsuranceExpirationAlert=" + this.closeInsuranceExpirationAlert + ", closeTechnicalExamExpirationAlert=" + this.closeTechnicalExamExpirationAlert + ", onReportErrorClick=" + this.onReportErrorClick + ", vehicleDetailsAccordionExpand=" + this.vehicleDetailsAccordionExpand + ", copyVinNumber=" + this.copyVinNumber + ", copyRegistrationNumber=" + this.copyRegistrationNumber + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    public h(mx.c cVar, ez.e eVar, ez.c cVar2, tn3.e<dn3.a.Insurance> eVar2, tn3.e<dn3.a.TechnicalExamination> eVar3, v20.a aVar, xm3.a aVar2, tn3.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.insuranceValidityResolver = eVar2;
        this.technicalExaminationValidityResolver = eVar3;
        this.documentValidityBannerMapper = aVar;
        this.getVehicleIconByTypeUseCase = aVar2;
        this.insurancePicker = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params) {
        params.k().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params) {
        params.k().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params) {
        params.b().a();
        return i0.f148189a;
    }

    private final List<k> I(VehicleDocumentData vehicleDocumentData, Params params) {
        DefaultSingleCardData defaultSingleCardDataR;
        String str;
        String strN;
        BigDecimal avgTrackWidth;
        BigDecimal maxTrackWidth;
        BigDecimal minTrackWidth;
        BigDecimal maxAllowedAxisEmphasis;
        BigDecimal wheelbase;
        BigDecimal axisQuantity;
        BigDecimal seats;
        BigDecimal standingPlaces;
        BigDecimal allPlaces;
        BigDecimal maxWeigthOfTrailerWithoutBrake;
        BigDecimal maxAllowedWeightOfCarSet;
        BigDecimal maxLoad;
        BigDecimal maxWeight;
        BigDecimal maxAllowedWeight;
        BigDecimal kerbWeight;
        BigDecimal co2Emission;
        BigDecimal combinedFuelConsumptionWLTP;
        BigDecimal combinedFuelConsumption;
        BigDecimal maxPower;
        BigDecimal engineCapacity;
        Date firstRegistrationDate;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR2 = r(um3.b.R, data != null ? data.getMake() : null);
        VehicleDocumentContainerData data2 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR3 = r(um3.b.f199240l0, data2 != null ? data2.getType() : null);
        VehicleDocumentContainerData data3 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR4 = r(um3.b.f199210b0, data3 != null ? data3.getModel() : null);
        VehicleDocumentContainerData data4 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR5 = r(um3.b.P, data4 != null ? data4.getKind() : null);
        VehicleDocumentContainerData data5 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR6 = r(um3.b.f199237k0, data5 != null ? data5.getSubKind() : null);
        VehicleDocumentContainerData data6 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR7 = r(um3.b.E, data6 != null ? data6.getVehicleCategory() : null);
        VehicleDocumentContainerData data7 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR8 = r(um3.b.f199225g0, data7 != null ? data7.getProductionYear() : null);
        VehicleDocumentContainerData data8 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR9 = r(um3.b.M, (data8 == null || (firstRegistrationDate = data8.getFirstRegistrationDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(firstRegistrationDate), fz.c.DOTTED));
        VehicleDocumentContainerData data9 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR10 = r(um3.b.f199243m0, data9 != null ? data9.getVin() : null);
        VehicleDocumentContainerData data10 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR11 = r(um3.b.f199228h0, data10 != null ? data10.getPurpose() : null);
        VehicleDocumentContainerData data11 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR12 = r(um3.b.f199219e0, data11 != null ? data11.getOrigin() : null);
        VehicleDocumentContainerData data12 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR13 = r(um3.b.f199222f0, data12 != null ? data12.getVehicleProductionMethod() : null);
        VehicleDocumentContainerData data13 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR14 = r(um3.b.f199216d0, data13 != null ? data13.getIsIdNumberStamped() : null);
        VehicleDocumentContainerData data14 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR15 = r(um3.b.f199213c0, data14 != null ? data14.getNameplate() : null);
        VehicleDocumentContainerData data15 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR16 = r(um3.b.f199278z, data15 != null ? data15.getVehicleApprovalCategoryCertificate() : null);
        VehicleDocumentContainerData data16 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR17 = r(um3.b.C, data16 != null ? data16.getIsCarHook() : null);
        VehicleDocumentContainerData data17 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR18 = r(um3.b.J, (data17 == null || (engineCapacity = data17.getEngineCapacity()) == null) ? null : M(engineCapacity, "cm3"));
        VehicleDocumentContainerData data18 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR19 = r(um3.b.W, (data18 == null || (maxPower = data18.getMaxPower()) == null) ? null : M(maxPower, "kW"));
        VehicleDocumentContainerData data19 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR20 = r(um3.b.N, data19 != null ? data19.getFuelType() : null);
        VehicleDocumentContainerData data20 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR21 = r(um3.b.L, data20 != null ? data20.getFirstAlternativeFuelType() : null);
        VehicleDocumentContainerData data21 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR22 = r(um3.b.H, (data21 == null || (combinedFuelConsumption = data21.getCombinedFuelConsumption()) == null) ? null : M(combinedFuelConsumption, "l/100km"));
        VehicleDocumentContainerData data22 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR23 = r(um3.b.I, (data22 == null || (combinedFuelConsumptionWLTP = data22.getCombinedFuelConsumptionWLTP()) == null) ? null : M(combinedFuelConsumptionWLTP, "l/100km"));
        VehicleDocumentContainerData data23 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR24 = r(um3.b.F, (data23 == null || (co2Emission = data23.getCo2Emission()) == null) ? null : M(co2Emission, "g/km"));
        VehicleDocumentContainerData data24 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR25 = r(um3.b.G, data24 != null ? data24.getCo2EmissionWLTP() : null);
        VehicleDocumentContainerData data25 = vehicleDocumentData.getScope().getData();
        if (t.c(data25 != null ? Boolean.valueOf(data25.getIsEuroNorm()) : null, Boolean.TRUE)) {
            VehicleDocumentContainerData data26 = vehicleDocumentData.getScope().getData();
            defaultSingleCardDataR = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(um3.b.K), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(T(data26 != null ? data26.getEmissionLevelEuro() : null, um3.b.K), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(um3.b.f199224g), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null)), null, 2815, null);
        } else {
            VehicleDocumentContainerData data27 = vehicleDocumentData.getScope().getData();
            defaultSingleCardDataR = r(um3.b.f199274x, data27 != null ? data27.getEmissionLevelEuro() : null);
        }
        VehicleDocumentContainerData data28 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR26 = r(um3.b.D, data28 != null ? data28.getIsCatalyst() : null);
        VehicleDocumentContainerData data29 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR27 = r(um3.b.O, (data29 == null || (kerbWeight = data29.getKerbWeight()) == null) ? null : M(kerbWeight, "kg"));
        VehicleDocumentContainerData data30 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR28 = r(um3.b.U, (data30 == null || (maxAllowedWeight = data30.getMaxAllowedWeight()) == null) ? null : M(maxAllowedWeight, "kg"));
        VehicleDocumentContainerData data31 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR29 = r(um3.b.Y, (data31 == null || (maxWeight = data31.getMaxWeight()) == null) ? null : M(maxWeight, "kg"));
        VehicleDocumentContainerData data32 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR30 = r(um3.b.V, (data32 == null || (maxLoad = data32.getMaxLoad()) == null) ? null : M(maxLoad, "kg"));
        VehicleDocumentContainerData data33 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR31 = r(um3.b.T, (data33 == null || (maxAllowedWeightOfCarSet = data33.getMaxAllowedWeightOfCarSet()) == null) ? null : M(maxAllowedWeightOfCarSet, "kg"));
        VehicleDocumentContainerData data34 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR32 = r(um3.b.Z, (data34 == null || (maxWeigthOfTrailerWithoutBrake = data34.getMaxWeigthOfTrailerWithoutBrake()) == null) ? null : M(maxWeigthOfTrailerWithoutBrake, "kg"));
        VehicleDocumentContainerData data35 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR33 = r(um3.b.f199276y, (data35 == null || (allPlaces = data35.getAllPlaces()) == null) ? null : N(this, allPlaces, null, 1, null));
        VehicleDocumentContainerData data36 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR34 = r(um3.b.f199234j0, (data36 == null || (standingPlaces = data36.getStandingPlaces()) == null) ? null : N(this, standingPlaces, null, 1, null));
        VehicleDocumentContainerData data37 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR35 = r(um3.b.f199231i0, (data37 == null || (seats = data37.getSeats()) == null) ? null : N(this, seats, null, 1, null));
        VehicleDocumentContainerData data38 = vehicleDocumentData.getScope().getData();
        if (data38 == null || (axisQuantity = data38.getAxisQuantity()) == null) {
            str = null;
            strN = null;
        } else {
            str = null;
            strN = N(this, axisQuantity, null, 1, null);
        }
        DefaultSingleCardData defaultSingleCardDataR36 = r(um3.b.B, strN);
        VehicleDocumentContainerData data39 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR37 = r(um3.b.f199246n0, (data39 == null || (wheelbase = data39.getWheelbase()) == null) ? str : M(wheelbase, "mm"));
        VehicleDocumentContainerData data40 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR38 = r(um3.b.S, (data40 == null || (maxAllowedAxisEmphasis = data40.getMaxAllowedAxisEmphasis()) == null) ? str : M(maxAllowedAxisEmphasis, "kN"));
        VehicleDocumentContainerData data41 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR39 = r(um3.b.f199207a0, (data41 == null || (minTrackWidth = data41.getMinTrackWidth()) == null) ? str : M(minTrackWidth, "mm"));
        VehicleDocumentContainerData data42 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR40 = r(um3.b.X, (data42 == null || (maxTrackWidth = data42.getMaxTrackWidth()) == null) ? str : M(maxTrackWidth, "mm"));
        VehicleDocumentContainerData data43 = vehicleDocumentData.getScope().getData();
        return v.q(defaultSingleCardDataR2, defaultSingleCardDataR3, defaultSingleCardDataR4, defaultSingleCardDataR5, defaultSingleCardDataR6, defaultSingleCardDataR7, defaultSingleCardDataR8, defaultSingleCardDataR9, defaultSingleCardDataR10, defaultSingleCardDataR11, defaultSingleCardDataR12, defaultSingleCardDataR13, defaultSingleCardDataR14, defaultSingleCardDataR15, defaultSingleCardDataR16, defaultSingleCardDataR17, defaultSingleCardDataR18, defaultSingleCardDataR19, defaultSingleCardDataR20, defaultSingleCardDataR21, defaultSingleCardDataR22, defaultSingleCardDataR23, defaultSingleCardDataR24, defaultSingleCardDataR25, defaultSingleCardDataR, defaultSingleCardDataR26, defaultSingleCardDataR27, defaultSingleCardDataR28, defaultSingleCardDataR29, defaultSingleCardDataR30, defaultSingleCardDataR31, defaultSingleCardDataR32, defaultSingleCardDataR33, defaultSingleCardDataR34, defaultSingleCardDataR35, defaultSingleCardDataR36, defaultSingleCardDataR37, defaultSingleCardDataR38, defaultSingleCardDataR39, defaultSingleCardDataR40, r(um3.b.A, (data43 == null || (avgTrackWidth = data43.getAvgTrackWidth()) == null) ? str : M(avgTrackWidth, "mm")));
    }

    private final List<c30.b.c> J(Params params) {
        return v.q(new c30.b.c(null, null, null, this.labelProvider.c(um3.b.f199273w0), null, null, null, 119, null), new c30.b.c(null, null, this.labelProvider.c(um3.b.f199270v0), this.labelProvider.c(um3.b.f199267u0), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(um3.b.f199227h), null, null, params.l(), 13, null)), 51, null));
    }

    private final Label L(OffsetDateTime offsetDateTime) {
        return this.labelProvider.e(um3.b.f199242m, this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), fz.c.DOTTED_TIME_PLUS_DATE));
    }

    private final String M(BigDecimal bigDecimal, String str) {
        return bigDecimal + ' ' + str;
    }

    static /* synthetic */ String N(h hVar, BigDecimal bigDecimal, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "";
        }
        return hVar.M(bigDecimal, str);
    }

    private final DocumentModel Q(VehicleDocumentContainerData vehicleDocumentContainerData) {
        List<DocumentModel> listD = vehicleDocumentContainerData.D();
        Object obj = null;
        if (listD == null) {
            return null;
        }
        for (Object obj2 : listD) {
            if (r.H(((DocumentModel) obj2).getDocumentType(), "Dowód rejestracyjny", false, 2, null)) {
                obj = obj2;
                break;
            }
        }
        return (DocumentModel) obj;
    }

    private final DocumentModel R(VehicleDocumentContainerData vehicleDocumentContainerData) {
        List<DocumentModel> listD = vehicleDocumentContainerData.D();
        Object obj = null;
        if (listD == null) {
            return null;
        }
        for (Object obj2 : listD) {
            if (r.H(((DocumentModel) obj2).getDocumentType(), "Pozwolenie czasowe", false, 2, null)) {
                obj = obj2;
                break;
            }
        }
        return (DocumentModel) obj;
    }

    private final Label T(String text, int tagId) {
        return Label.f(this.labelProvider.b(mx.b.d(text, "value").getText(), tagId), "Value", null, 2, null);
    }

    private final Label W(String a15, String b15) {
        return mx.b.d(v.v0(v.s(a15, b15), " ", null, null, 0, null, null, 62, null), "VehicleDetailsScreenDetailsSectionVehicleNameLabel");
    }

    private final VehicleDetailsHeaderModel l(VehicleDocumentData vehicleDocumentData, er.a<i0> aVar, er.a<i0> aVar2) {
        String lowerCase;
        String kind;
        Locale locale;
        bn3.l vehicleType;
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(um3.b.f199209b), null, null, aVar, 13, null);
        ButtonTextData buttonTextData2 = new ButtonTextData(null, this.labelProvider.c(um3.b.f199209b), null, null, aVar2, 13, null);
        xm3.a aVar3 = this.getVehicleIconByTypeUseCase;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        int iIntValue = aVar3.a(new xm3.a.Params((data == null || (vehicleType = data.getVehicleType()) == null) ? null : an3.a.a(vehicleType))).intValue();
        VehicleDocumentContainerData data2 = vehicleDocumentData.getScope().getData();
        if (data2 == null || (kind = data2.getKind()) == null || (lowerCase = kind.toLowerCase((locale = Locale.ROOT))) == null) {
            lowerCase = null;
        } else if (lowerCase.length() > 0) {
            lowerCase = ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
        }
        Label labelT = T(lowerCase, um3.b.P);
        VehicleDocumentContainerData data3 = vehicleDocumentData.getScope().getData();
        String make = data3 != null ? data3.getMake() : null;
        VehicleDocumentContainerData data4 = vehicleDocumentData.getScope().getData();
        Label labelW = W(make, data4 != null ? data4.getModel() : null);
        Label labelC = this.labelProvider.c(um3.b.f199258r0);
        VehicleDocumentContainerData data5 = vehicleDocumentData.getScope().getData();
        Label labelT2 = T(data5 != null ? data5.getRegistrationNumber() : null, um3.b.f199258r0);
        Label labelC2 = this.labelProvider.c(um3.b.f199264t0);
        VehicleDocumentContainerData data6 = vehicleDocumentData.getScope().getData();
        return new VehicleDetailsHeaderModel(this.labelProvider.c(um3.b.G0), (dn3.a.Insurance) tn3.e.a(this.insuranceValidityResolver, vehicleDocumentData.getScope().getData(), false, 2, null), (dn3.a.Insurance) this.insuranceValidityResolver.b(vehicleDocumentData.getScope().getData(), true), (dn3.a.TechnicalExamination) tn3.e.a(this.technicalExaminationValidityResolver, vehicleDocumentData.getScope().getData(), false, 2, null), labelC, labelC2, buttonTextData, buttonTextData2, labelW, labelT, iIntValue, labelT2, T(data6 != null ? data6.getVin() : null, um3.b.f199264t0), T(this.dateFormatter.d(new fz.b.Long(vehicleDocumentData.getScope().getDataHeader().getTimestamp()), fz.c.DOTTED), um3.b.G0));
    }

    private final List<k> m(VehicleDocumentData vehicleDocumentData) {
        VehicleInsuranceModel vehicleInsuranceModelB;
        Date insurancePeriodEnd;
        Date insurancePeriodStart;
        Date insuranceSignDay;
        List<VehicleInsuranceModel> listN;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        String strD = null;
        if (data == null || (listN = data.n()) == null) {
            vehicleInsuranceModelB = null;
        } else {
            vehicleInsuranceModelB = this.insurancePicker.b(listN);
            if (vehicleInsuranceModelB == null) {
                vehicleInsuranceModelB = this.insurancePicker.c(listN);
            }
        }
        DefaultSingleCardData defaultSingleCardDataR = r(um3.b.f199277y0, vehicleInsuranceModelB != null ? vehicleInsuranceModelB.getInsuranceInstitutionName() : null);
        DefaultSingleCardData defaultSingleCardDataR2 = r(um3.b.D0, vehicleInsuranceModelB != null ? vehicleInsuranceModelB.getInsuranceType() : null);
        DefaultSingleCardData defaultSingleCardDataR3 = r(um3.b.f199275x0, vehicleInsuranceModelB != null ? vehicleInsuranceModelB.getInsuranceId() : null);
        DefaultSingleCardData defaultSingleCardDataR4 = r(um3.b.C0, (vehicleInsuranceModelB == null || (insuranceSignDay = vehicleInsuranceModelB.getInsuranceSignDay()) == null) ? null : this.dateFormatter.d(new fz.b.Date(insuranceSignDay), fz.c.DOTTED));
        DefaultSingleCardData defaultSingleCardDataR5 = r(um3.b.A0, (vehicleInsuranceModelB == null || (insurancePeriodStart = vehicleInsuranceModelB.getInsurancePeriodStart()) == null) ? null : this.dateFormatter.d(new fz.b.Date(insurancePeriodStart), fz.c.DOTTED));
        if (vehicleInsuranceModelB != null && (insurancePeriodEnd = vehicleInsuranceModelB.getInsurancePeriodEnd()) != null) {
            strD = this.dateFormatter.d(new fz.b.Date(insurancePeriodEnd), fz.c.DOTTED);
        }
        return v.q(defaultSingleCardDataR, defaultSingleCardDataR2, defaultSingleCardDataR3, defaultSingleCardDataR4, defaultSingleCardDataR5, r(um3.b.f199279z0, strD));
    }

    private final List<k> q(VehicleDocumentData vehicleDocumentData) {
        Date expireDate;
        Date distributionDate;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        DocumentModel documentModelQ = data != null ? Q(data) : null;
        return v.q(r(um3.b.K0, documentModelQ != null ? documentModelQ.getDocumentId() : null), r(um3.b.I0, documentModelQ != null ? documentModelQ.getIsDuplicate() : null), r(um3.b.H0, (documentModelQ == null || (distributionDate = documentModelQ.getDistributionDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(distributionDate), fz.c.DOTTED)), r(um3.b.J0, (documentModelQ == null || (expireDate = documentModelQ.getExpireDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(expireDate), fz.c.DOTTED)), r(um3.b.L0, documentModelQ != null ? documentModelQ.getInstitutionName() : null));
    }

    private final DefaultSingleCardData r(int label, String value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(label), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(T(value, label), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    private final List<k> s(VehicleDocumentData vehicleDocumentData) {
        String str;
        DefaultSingleCardData defaultSingleCardDataR;
        TimeMeter timeMeter;
        String dataImporter;
        TimeMeter timeMeter2;
        Date saveDate;
        TimeMeter timeMeter3;
        DistanceMeter distanceMeter;
        DistanceMeter distanceMeter2;
        Date saveDate2;
        DistanceMeter distanceMeter3;
        Date technicalExaminationExpireDate;
        Date technicalExaminationExpireDate2;
        Date technicalExaminationActivityDate;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR2 = null;
        DefaultSingleCardData defaultSingleCardDataR3 = r(um3.b.T0, (data == null || (technicalExaminationActivityDate = data.getTechnicalExaminationActivityDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(technicalExaminationActivityDate), fz.c.DOTTED));
        VehicleDocumentContainerData data2 = vehicleDocumentData.getScope().getData();
        String strD = (data2 == null || (technicalExaminationExpireDate2 = data2.getTechnicalExaminationExpireDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(technicalExaminationExpireDate2), fz.c.DOTTED);
        Integer numValueOf = Integer.valueOf(um3.b.N0);
        VehicleDocumentContainerData data3 = vehicleDocumentData.getScope().getData();
        boolean z15 = false;
        if (!((data3 == null || (technicalExaminationExpireDate = data3.getTechnicalExaminationExpireDate()) == null) ? false : i.a(technicalExaminationExpireDate))) {
            numValueOf = null;
        }
        DefaultSingleCardData defaultSingleCardDataR4 = r(numValueOf != null ? numValueOf.intValue() : um3.b.U0, strD);
        VehicleDocumentContainerData data4 = vehicleDocumentData.getScope().getData();
        if (data4 == null || (distanceMeter3 = data4.getDistanceMeter()) == null) {
            str = null;
        } else {
            if (distanceMeter3.getValue() != null) {
                String unit = distanceMeter3.getUnit();
                if (!(unit == null || r.t0(unit))) {
                    z15 = true;
                }
            }
            if (!z15) {
                distanceMeter3 = null;
            }
            if (distanceMeter3 != null) {
                str = distanceMeter3.getValue() + ' ' + distanceMeter3.getUnit();
            } else {
                str = null;
            }
        }
        DefaultSingleCardData defaultSingleCardDataR5 = r(um3.b.W0, str);
        VehicleDocumentContainerData data5 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR6 = r(um3.b.V0, (data5 == null || (distanceMeter2 = data5.getDistanceMeter()) == null || (saveDate2 = distanceMeter2.getSaveDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(saveDate2), fz.c.DOTTED));
        VehicleDocumentContainerData data6 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR7 = r(um3.b.S0, (data6 == null || (distanceMeter = data6.getDistanceMeter()) == null) ? null : distanceMeter.getDataImporter());
        VehicleDocumentContainerData data7 = vehicleDocumentData.getScope().getData();
        if (data7 == null || (timeMeter3 = data7.getTimeMeter()) == null) {
            defaultSingleCardDataR = null;
        } else {
            defaultSingleCardDataR = r(um3.b.Z0, timeMeter3.getValue() + ' ' + timeMeter3.getUnit());
        }
        VehicleDocumentContainerData data8 = vehicleDocumentData.getScope().getData();
        DefaultSingleCardData defaultSingleCardDataR8 = (data8 == null || (timeMeter2 = data8.getTimeMeter()) == null || (saveDate = timeMeter2.getSaveDate()) == null) ? null : r(um3.b.Y0, this.dateFormatter.d(new fz.b.Date(saveDate), fz.c.DOTTED));
        VehicleDocumentContainerData data9 = vehicleDocumentData.getScope().getData();
        if (data9 != null && (timeMeter = data9.getTimeMeter()) != null && (dataImporter = timeMeter.getDataImporter()) != null) {
            defaultSingleCardDataR2 = r(um3.b.X0, dataImporter);
        }
        return v.s(defaultSingleCardDataR3, defaultSingleCardDataR4, defaultSingleCardDataR5, defaultSingleCardDataR6, defaultSingleCardDataR7, defaultSingleCardDataR, defaultSingleCardDataR8, defaultSingleCardDataR2);
    }

    private final List<k> u(VehicleDocumentData vehicleDocumentData) {
        Date expireDate;
        Date distributionDate;
        VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
        DocumentModel documentModelR = data != null ? R(data) : null;
        return v.q(r(um3.b.f199214c1, documentModelR != null ? documentModelR.getDocumentId() : null), r(um3.b.f199217d1, documentModelR != null ? documentModelR.getIsDuplicate() : null), r(um3.b.f199211b1, (documentModelR == null || (distributionDate = documentModelR.getDistributionDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(distributionDate), fz.c.DOTTED)), r(um3.b.f199220e1, (documentModelR == null || (expireDate = documentModelR.getExpireDate()) == null) ? null : this.dateFormatter.d(new fz.b.Date(expireDate), fz.c.DOTTED)), r(um3.b.f199226g1, documentModelR != null ? documentModelR.getIssueReason() : null), r(um3.b.f199223f1, documentModelR != null ? documentModelR.getInstitutionName() : null));
    }

    private final DefaultSingleCardData v(VehicleDocumentData vehicleDocumentData, final Params params) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(um3.b.G0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(T(this.dateFormatter.d(new fz.b.Long(vehicleDocumentData.getScope().getDataHeader().getTimestamp()), fz.c.DOTTED), um3.b.G0), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(um3.b.f199230i), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: nn3.g
            @Override // er.a
            public final Object a() {
                return h.x(params);
            }
        }, 35, null)), null, 2815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.k().a();
        return i0.f148189a;
    }

    private final VehicleDetailsScreenModel z(VehicleDocumentData data, final Params params, m.DataLoaded state) {
        Date date;
        List<VehicleInsuranceModel> listN;
        Date insuranceExpireDate;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.g()), this.labelProvider.c(um3.b.f199232i1), null, null, null, 28, null), null, null, null, null, 61, null);
        c30.b.C0606b[] c0606bArr = new c30.b.C0606b[2];
        v20.a aVar = this.documentValidityBannerMapper;
        VehicleDocumentContainerData data2 = data.getScope().getData();
        if (data2 == null || (listN = data2.n()) == null) {
            date = null;
        } else {
            VehicleInsuranceModel vehicleInsuranceModelA = this.insurancePicker.a(listN);
            if (vehicleInsuranceModelA == null || (insuranceExpireDate = vehicleInsuranceModelA.getInsuranceExpireDate()) == null) {
                VehicleInsuranceModel vehicleInsuranceModelB = this.insurancePicker.b(listN);
                insuranceExpireDate = vehicleInsuranceModelB != null ? vehicleInsuranceModelB.getInsuranceExpireDate() : null;
                if (insuranceExpireDate == null) {
                    VehicleInsuranceModel vehicleInsuranceModelC = this.insurancePicker.c(listN);
                    insuranceExpireDate = vehicleInsuranceModelC != null ? vehicleInsuranceModelC.getInsuranceExpireDate() : null;
                }
            }
            date = insuranceExpireDate;
        }
        c30.b.C0606b c0606bB = aVar.b(new v20.a.Params(date, um3.b.f199238k1, um3.b.f199235j1, um3.b.f199241l1, um3.b.f199244m1, new er.a() { // from class: nn3.d
            @Override // er.a
            public final Object a() {
                return h.F(params);
            }
        }, new v20.a.b.ShowAlways(new ButtonTextData(null, this.labelProvider.c(um3.b.f199221f), null, null, new er.a() { // from class: nn3.c
            @Override // er.a
            public final Object a() {
                return h.E(params);
            }
        }, 13, null))));
        if (!state.getExpirationInsuranceAlertVisible()) {
            c0606bB = null;
        }
        c0606bArr[0] = c0606bB;
        v20.a aVar2 = this.documentValidityBannerMapper;
        VehicleDocumentContainerData data3 = data.getScope().getData();
        c30.b.C0606b c0606bB2 = aVar2.b(new v20.a.Params(data3 != null ? data3.getTechnicalExaminationExpireDate() : null, um3.b.f199250o1, um3.b.f199247n1, um3.b.f199253p1, um3.b.f199256q1, new er.a() { // from class: nn3.f
            @Override // er.a
            public final Object a() {
                return h.H(params);
            }
        }, new v20.a.b.ShowAlways(new ButtonTextData(null, this.labelProvider.c(um3.b.f199221f), null, null, new er.a() { // from class: nn3.e
            @Override // er.a
            public final Object a() {
                return h.G(params);
            }
        }, 13, null))));
        if (!state.getExpirationTechnicalExamAlertVisible()) {
            c0606bB2 = null;
        }
        c0606bArr[1] = c0606bB2;
        List listS = v.s(c0606bArr);
        VehicleDetailsHeaderModel vehicleDetailsHeaderModelL = l(data, params.d(), params.c());
        Label labelC = this.labelProvider.c(um3.b.f199254q);
        int i15 = jz.a.f106903y0;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, params.n(), 37, null);
        if (!q.a(state.c(), rq0.c.VEHICLE_HISTORY)) {
            smallCardData = null;
        }
        return new VehicleDetailsScreenModel(baseScaffoldData, listS, vehicleDetailsHeaderModelL, new ShortcutsLayoutData(v.s(smallCardData, q.a(state.c(), rq0.c.VEHICLE_COLLISION) ? new SmallCardData(null, this.labelProvider.c(um3.b.f199251p), null, jz.a.B0, cVar, false, params.m(), 37, null) : null, q.a(state.c(), rq0.c.PENALTY_POINTS) ? new SmallCardData(null, this.labelProvider.c(um3.b.f199248o), null, jz.a.f106840p0, cVar, false, params.j(), 37, null) : null, q.a(state.c(), rq0.c.FINES) ? new SmallCardData(null, this.labelProvider.c(um3.b.f199245n), null, jz.a.A0, cVar, false, params.i(), 37, null) : null), new ShortcutMoreData(this.labelProvider.c(um3.b.f199239l), params.f())), v(data, params), this.labelProvider.c(um3.b.f199208a1), s(data), J(params), new VehicleDetailsBottomSheetModel(this.labelProvider.c(um3.b.f199274x), this.labelProvider.c(um3.b.f199272w), params.h(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(um3.b.f199206a), null, 2, null), k30.d.a.f107773a, null, params.h(), 35, null)), state.getBottomSheetVisible(), state.getExpirationInsuranceAlertVisible(), state.getExpirationTechnicalExamAlertVisible(), L(state.getCurrentDateTime()), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(um3.b.f199208a1), null, false, null, false, new mn3.b(s(data)), 29, null))), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(um3.b.B0), null, false, null, false, new mn3.b(m(data)), 29, null))), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(um3.b.f199229h1), null, false, null, false, new mn3.b(u(data)), 29, null))), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(um3.b.M0), null, false, null, false, new mn3.b(q(data)), 29, null))), new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(um3.b.Q), null, state.getVehicleDetailsAccordionState(), params.o(), false, new mn3.b(I(data, params)), 5, null))));
    }

    public final LocalDate K(VehicleDocumentData data) {
        Date firstRegistrationDate;
        VehicleDocumentContainerData data2 = data.getScope().getData();
        if (data2 == null || (firstRegistrationDate = data2.getFirstRegistrationDate()) == null) {
            return null;
        }
        return this.dateConverter.l(firstRegistrationDate);
    }

    public final Label O() {
        return this.labelProvider.c(um3.b.f199212c);
    }

    public final Label P() {
        return this.labelProvider.c(um3.b.f199215d);
    }

    public final Label S() {
        return this.labelProvider.c(um3.b.f199257r);
    }

    public final Label U() {
        return this.labelProvider.c(um3.b.f199249o0);
    }

    public final Label V() {
        return this.labelProvider.c(um3.b.f199252p0);
    }

    @Override // er.l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public n.a b(Params params) {
        m vehicleListState = params.getVehicleListState();
        if (vehicleListState instanceof m.b) {
            return n.a.b.f111581a;
        }
        if (!(vehicleListState instanceof m.DataLoaded)) {
            throw new p();
        }
        m.DataLoaded dataLoaded = (m.DataLoaded) vehicleListState;
        return new n.a.DataLoaded(z(dataLoaded.getVehicleDocumentData(), params, dataLoaded));
    }
}
