package vk2;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e20.k;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.List;
import l60.KeyValueData;
import lk2.MidCardScopeDataContainer;
import lk2.PersonalAddressContainer;
import mx.Label;
import mz3.z;
import n20.State;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import o20.BaseDocumentData;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import uk2.DocumentStateData;
import uk2.Error;
import uk2.u;
import uk2.w;
import uk2.x;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002[YB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J§\u0001\u00101\u001a\b\u0012\u0004\u0012\u0002000,2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0012\u0004\u0012\u00020#0+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b1\u00102J\u008d\u0001\u00106\u001a\u0002052\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010,2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0012\u0004\u0012\u00020#0+H\u0002¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0002082\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u00020>2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bJ\u0010KJ\u001b\u0010M\u001a\u0004\u0018\u00010I2\b\u0010L\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001a\u00020N*\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010Q\u001a\u00020I*\u00020IH\u0002¢\u0006\u0004\bQ\u0010RJ\u0013\u0010T\u001a\u00020A*\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0018\u0010W\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010c¨\u0006e"}, d2 = {"Lvk2/f;", "Lxw/f;", "Lvk2/f$b;", "Luk2/x$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lez/e;", "dateFormatter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lp20/c;", "giloshScreenMapper", "<init>", "(Lmx/c;Lez/c;Lez/e;Lrz/a;Liy/a;Lp20/c;)V", "Luk2/t;", "documentStateData", "Lcb4/i;", "dialogVMS", "Luk2/u;", "state", "Ly20/b;", "animationsState", "Lvk2/f$b$a;", "actionHandler", "Luk2/x$a$a;", "u", "(Luk2/t;Lcb4/i;Luk2/u;Ly20/b;Lvk2/f$b$a;)Luk2/x$a$a;", "Lo20/k;", "q", "(Luk2/t;Luk2/u;Ly20/b;Lvk2/f$b$a;)Lo20/k;", "Lkotlin/Function0;", "Loq/i0;", "onIdDocumentDetailPressed", "onVerificationClicked", "onRestrictPeselClicked", "onFineClicked", "onElectionsClicked", "onUpdateClicked", "onDeleteClicked", "Lkotlin/Function1;", "", "Lg70/b;", "toMoreDialog", "copySerialNumberClicked", "Lo20/l;", "f", "(Luk2/t;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)Ljava/util/List;", "Lrq0/c;", "availableServices", "Lo20/l$f;", "m", "(Ljava/util/List;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)Lo20/l$f;", "Lo20/l$e;", "l", "(Luk2/t;Ler/a;)Lo20/l$e;", "Lo20/l$c;", "h", "(Luk2/t;)Lo20/l$c;", "Lo20/l$k;", "i", "(Luk2/t;Ler/a;)Lo20/l$k;", "Lmx/a;", "info", "title", "Ln50/g;", "F", "(Lmx/a;Lmx/a;)Ln50/g;", "Llk2/h;", "date", "", "x", "(Llk2/h;)Ljava/lang/String;", "addressData", "v", "", "E", "(Ljava/lang/String;)Z", i.f37087n, "(Ljava/lang/String;)Ljava/lang/String;", "Lxw/e;", "G", "(Lxw/e;)Lmx/a;", "params", "z", "(Lvk2/f$b;)Luk2/x$a;", "a", "Lmx/c;", "b", "Lez/c;", "c", "Lez/e;", "d", "Lrz/a;", "e", "Liy/a;", "Lp20/c;", "g", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, x.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f207185h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: vk2.f$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvk2/f$b;", "", "Luk2/u;", "state", "Ly20/b;", "animationsState", "Lvk2/f$b$a;", "action", "<init>", "(Luk2/u;Ly20/b;Lvk2/f$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luk2/u;", "c", "()Luk2/u;", "b", "Ly20/b;", "()Ly20/b;", "Lvk2/f$b$a;", "()Lvk2/f$b$a;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f207192d = y20.b.f223429b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y20.b animationsState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ActionHandler action;

        /* JADX INFO: renamed from: vk2.f$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b+\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b)\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b/\u0010$R)\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b0\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b%\u0010.¨\u00061"}, d2 = {"Lvk2/f$b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onIdDocumentDetailPressed", "onVerificationClicked", "onRestrictPeselCicked", "onFineClicked", "onElectionsClicked", "Lkotlin/Function1;", "Lmz3/z$b;", "onUpdateClicked", "onDeleteClicked", "onGoToInfoScreen", "", "Lg70/b;", "toMoreDialog", "copySerialNumberClicked", "onBack", "Ln20/a;", "dispatchAction", "<init>", "(Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "h", "()Ler/a;", "b", "k", "c", "i", "d", "f", "e", "Ler/l;", "j", "()Ler/l;", "g", "l", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onIdDocumentDetailPressed;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onVerificationClicked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onRestrictPeselCicked;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onFineClicked;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onElectionsClicked;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<z.b, i0> onUpdateClicked;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onDeleteClicked;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToInfoScreen;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<List<ShortcutMoreTransferData>, i0> toMoreDialog;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> copySerialNumberClicked;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<n20.a, i0> dispatchAction;

            /* JADX WARN: Multi-variable type inference failed */
            public ActionHandler(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super z.b, i0> lVar, er.a<i0> aVar6, er.a<i0> aVar7, l<? super List<ShortcutMoreTransferData>, i0> lVar2, er.a<i0> aVar8, er.a<i0> aVar9, l<? super n20.a, i0> lVar3) {
                this.onIdDocumentDetailPressed = aVar;
                this.onVerificationClicked = aVar2;
                this.onRestrictPeselCicked = aVar3;
                this.onFineClicked = aVar4;
                this.onElectionsClicked = aVar5;
                this.onUpdateClicked = lVar;
                this.onDeleteClicked = aVar6;
                this.onGoToInfoScreen = aVar7;
                this.toMoreDialog = lVar2;
                this.copySerialNumberClicked = aVar8;
                this.onBack = aVar9;
                this.dispatchAction = lVar3;
            }

            public final er.a<i0> a() {
                return this.copySerialNumberClicked;
            }

            public final l<n20.a, i0> b() {
                return this.dispatchAction;
            }

            public final er.a<i0> c() {
                return this.onBack;
            }

            public final er.a<i0> d() {
                return this.onDeleteClicked;
            }

            public final er.a<i0> e() {
                return this.onElectionsClicked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionHandler)) {
                    return false;
                }
                ActionHandler actionHandler = (ActionHandler) other;
                return t.c(this.onIdDocumentDetailPressed, actionHandler.onIdDocumentDetailPressed) && t.c(this.onVerificationClicked, actionHandler.onVerificationClicked) && t.c(this.onRestrictPeselCicked, actionHandler.onRestrictPeselCicked) && t.c(this.onFineClicked, actionHandler.onFineClicked) && t.c(this.onElectionsClicked, actionHandler.onElectionsClicked) && t.c(this.onUpdateClicked, actionHandler.onUpdateClicked) && t.c(this.onDeleteClicked, actionHandler.onDeleteClicked) && t.c(this.onGoToInfoScreen, actionHandler.onGoToInfoScreen) && t.c(this.toMoreDialog, actionHandler.toMoreDialog) && t.c(this.copySerialNumberClicked, actionHandler.copySerialNumberClicked) && t.c(this.onBack, actionHandler.onBack) && t.c(this.dispatchAction, actionHandler.dispatchAction);
            }

            public final er.a<i0> f() {
                return this.onFineClicked;
            }

            public final er.a<i0> g() {
                return this.onGoToInfoScreen;
            }

            public final er.a<i0> h() {
                return this.onIdDocumentDetailPressed;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.onIdDocumentDetailPressed.hashCode() * 31) + this.onVerificationClicked.hashCode()) * 31) + this.onRestrictPeselCicked.hashCode()) * 31) + this.onFineClicked.hashCode()) * 31) + this.onElectionsClicked.hashCode()) * 31) + this.onUpdateClicked.hashCode()) * 31) + this.onDeleteClicked.hashCode()) * 31) + this.onGoToInfoScreen.hashCode()) * 31) + this.toMoreDialog.hashCode()) * 31) + this.copySerialNumberClicked.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.dispatchAction.hashCode();
            }

            public final er.a<i0> i() {
                return this.onRestrictPeselCicked;
            }

            public final l<z.b, i0> j() {
                return this.onUpdateClicked;
            }

            public final er.a<i0> k() {
                return this.onVerificationClicked;
            }

            public final l<List<ShortcutMoreTransferData>, i0> l() {
                return this.toMoreDialog;
            }

            public String toString() {
                return "ActionHandler(onIdDocumentDetailPressed=" + this.onIdDocumentDetailPressed + ", onVerificationClicked=" + this.onVerificationClicked + ", onRestrictPeselCicked=" + this.onRestrictPeselCicked + ", onFineClicked=" + this.onFineClicked + ", onElectionsClicked=" + this.onElectionsClicked + ", onUpdateClicked=" + this.onUpdateClicked + ", onDeleteClicked=" + this.onDeleteClicked + ", onGoToInfoScreen=" + this.onGoToInfoScreen + ", toMoreDialog=" + this.toMoreDialog + ", copySerialNumberClicked=" + this.copySerialNumberClicked + ", onBack=" + this.onBack + ", dispatchAction=" + this.dispatchAction + ')';
            }
        }

        public Params(u uVar, y20.b bVar, ActionHandler actionHandler) {
            this.state = uVar;
            this.animationsState = bVar;
            this.action = actionHandler;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionHandler getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y20.b getAnimationsState() {
            return this.animationsState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final u getState() {
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
            return t.c(this.state, params.state) && t.c(this.animationsState, params.animationsState) && t.c(this.action, params.action);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.animationsState.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", animationsState=" + this.animationsState + ", action=" + this.action + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207208a;

        static {
            int[] iArr = new int[xw.e.values().length];
            try {
                iArr[xw.e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xw.e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f207208a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f207209a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1145235997);
            if (p076m2.t.k()) {
                p076m2.t.o(1145235997, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.midcard.mapper.MIdCardMapper.getDocumentView.<anonymous> (MIdCardMapper.kt:164)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar, ez.c cVar2, ez.e eVar, rz.a aVar, iy.a aVar2, p20.c cVar3) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.dateFormatter = eVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.giloshScreenMapper = cVar3;
    }

    private final boolean E(String str) {
        return str == null || str.length() == 0 || fu.r.b0(str, this.labelProvider.c(ik2.a.f93204k0).getText(), true);
    }

    private final DefaultSingleCardData F(Label info, Label title) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(info, null, null, 3, null), new n50.b.Title(n50.l.b(title, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final Label G(xw.e eVar) {
        int i15 = c.f207208a[eVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(ik2.a.f93214p0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(ik2.a.f93210n0);
        }
        throw new oq.p();
    }

    private final String H(String str) {
        StringBuilder sb5 = new StringBuilder(str);
        sb5.insert(2, "-");
        return sb5.toString();
    }

    private final List<o20.l> f(DocumentStateData documentStateData, er.a<i0> onIdDocumentDetailPressed, er.a<i0> onVerificationClicked, er.a<i0> onRestrictPeselClicked, er.a<i0> onFineClicked, er.a<i0> onElectionsClicked, er.a<i0> onUpdateClicked, er.a<i0> onDeleteClicked, l<? super List<ShortcutMoreTransferData>, i0> toMoreDialog, er.a<i0> copySerialNumberClicked) {
        return v.q(m(documentStateData.a(), onIdDocumentDetailPressed, onVerificationClicked, onRestrictPeselClicked, onFineClicked, onElectionsClicked, onDeleteClicked, toMoreDialog), l(documentStateData, copySerialNumberClicked), h(documentStateData), i(documentStateData, onUpdateClicked));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    private final o20.l.Expandable h(DocumentStateData documentStateData) {
        DefaultSingleCardData defaultSingleCardDataF;
        DefaultSingleCardData defaultSingleCardDataF2;
        DefaultSingleCardData defaultSingleCardDataF3;
        DefaultSingleCardData defaultSingleCardDataF4;
        DefaultSingleCardData defaultSingleCardDataF5;
        DefaultSingleCardData defaultSingleCardDataF6;
        Label labelC = this.labelProvider.c(ik2.a.G);
        b0 familyName = documentStateData.getData().getScope().getData().getPersonalData().getFamilyName();
        DefaultSingleCardData defaultSingleCardDataF7 = null;
        if (familyName == null) {
            defaultSingleCardDataF = null;
        } else {
            if (E(c0.e(familyName))) {
                familyName = null;
            }
            if (familyName != null) {
                defaultSingleCardDataF = F(this.labelProvider.c(ik2.a.f93186b0), mx.b.d(c0.e(familyName), "familyName"));
            } else {
                defaultSingleCardDataF = null;
            }
        }
        xw.e gender = documentStateData.getData().getScope().getData().getPersonalData().getGender();
        DefaultSingleCardData defaultSingleCardDataF8 = gender != null ? F(this.labelProvider.c(ik2.a.f93212o0), G(gender)) : null;
        b0 fatherFamilySurname = documentStateData.getData().getScope().getData().getPersonalData().getFatherFamilySurname();
        if (fatherFamilySurname == null) {
            defaultSingleCardDataF2 = null;
        } else {
            if (E(c0.e(fatherFamilySurname))) {
                fatherFamilySurname = null;
            }
            if (fatherFamilySurname != null) {
                defaultSingleCardDataF2 = F(this.labelProvider.c(ik2.a.f93188c0), mx.b.d(c0.e(fatherFamilySurname), "MdowodFatherFamilyNameValue"));
            } else {
                defaultSingleCardDataF2 = null;
            }
        }
        b0 motherFamilySurname = documentStateData.getData().getScope().getData().getPersonalData().getMotherFamilySurname();
        if (motherFamilySurname == null) {
            defaultSingleCardDataF3 = null;
        } else {
            if (E(c0.e(motherFamilySurname))) {
                motherFamilySurname = null;
            }
            if (motherFamilySurname != null) {
                defaultSingleCardDataF3 = F(this.labelProvider.c(ik2.a.f93202j0), mx.b.d(c0.e(motherFamilySurname), "MdowodMotherFamilyNameValue"));
            } else {
                defaultSingleCardDataF3 = null;
            }
        }
        String birthPlace = documentStateData.getData().getScope().getData().getPersonalData().getBirthPlace();
        if (birthPlace == null) {
            defaultSingleCardDataF4 = null;
        } else {
            if (E(birthPlace)) {
                birthPlace = null;
            }
            if (birthPlace != null) {
                defaultSingleCardDataF4 = F(this.labelProvider.c(ik2.a.I), mx.b.d(birthPlace, "MdowodBirthPlaceValue"));
            } else {
                defaultSingleCardDataF4 = null;
            }
        }
        String birthCountry = documentStateData.getData().getScope().getData().getPersonalData().getBirthCountry();
        if (birthCountry == null) {
            defaultSingleCardDataF5 = null;
        } else {
            if (E(birthCountry)) {
                birthCountry = null;
            }
            if (birthCountry != null) {
                defaultSingleCardDataF5 = F(this.labelProvider.c(ik2.a.H), mx.b.d(birthCountry, "MdowodBirthCountryValue"));
            } else {
                defaultSingleCardDataF5 = null;
            }
        }
        PersonalAddressContainer permanentAddress = documentStateData.getData().getScope().getData().getPersonalData().getPermanentAddress();
        boolean z15 = true;
        if (permanentAddress == null) {
            defaultSingleCardDataF6 = null;
        } else {
            String strV = v(permanentAddress);
            if (strV == null || strV.length() == 0) {
                permanentAddress = null;
            }
            if (permanentAddress != null) {
                defaultSingleCardDataF6 = F(this.labelProvider.c(ik2.a.f93206l0), mx.b.d(v(permanentAddress), "MdowodRegisteredAddressPermanentResidenceValue"));
            } else {
                defaultSingleCardDataF6 = null;
            }
        }
        PersonalAddressContainer permanentAddress2 = documentStateData.getData().getScope().getData().getPersonalData().getPermanentAddress();
        if (permanentAddress2 != null) {
            String strX = x(permanentAddress2);
            if (strX != null && strX.length() != 0) {
                z15 = false;
            }
            if (z15) {
                permanentAddress2 = null;
            }
            if (permanentAddress2 != null) {
                defaultSingleCardDataF7 = F(this.labelProvider.c(ik2.a.f93208m0), mx.b.d(x(permanentAddress2), "MdowodRegisteredDatePermanentResidenceValue"));
            }
        }
        return new o20.l.Expandable(labelC, new CardListData(v.s(defaultSingleCardDataF, defaultSingleCardDataF8, defaultSingleCardDataF2, defaultSingleCardDataF3, defaultSingleCardDataF4, defaultSingleCardDataF5, defaultSingleCardDataF6, defaultSingleCardDataF7), null, false, null, null, 30, null));
    }

    private final o20.l.UpdateDataItem i(DocumentStateData documentStateData, er.a<i0> onUpdateClicked) {
        return new o20.l.UpdateDataItem(this.labelProvider.c(ik2.a.f93211o), mx.b.d(this.dateFormatter.d(new fz.b.OffsetDateTime(documentStateData.getData().getScope().getDataHeader().getTs()), fz.c.DOTTED), "DocumentCardFooterLastUpdateValue"), this.labelProvider.c(ik2.a.f93213p), null, onUpdateClicked, 8, null);
    }

    private final o20.l.Section l(DocumentStateData documentStateData, er.a<i0> copySerialNumberClicked) {
        Label labelC = Label.INSTANCE.c();
        MidCardScopeDataContainer data = documentStateData.getData().getScope().getData();
        String strE = null;
        CustomSingleCardData customSingleCardData = new CustomSingleCardData("MdowodDocumentNumberCard", new ok2.b(Label.f(this.labelProvider.c(ik2.a.Z), "MobileIdCard", null, 2, null), mx.b.b(data.getMobileIdCard().getNumber(), "MdowodDocumentDetailsMdowodNumberValueMobileIdCard"), Label.f(this.labelProvider.c(ik2.a.Y), "MobileIdCard", null, 2, null), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(Label.f(this.labelProvider.c(ik2.a.f93187c), "MobileIdCard", null, 2, null), this.labelProvider.c(ik2.a.f93199i)), k30.d.a.f107773a, null, copySerialNumberClicked, 35, null)), null, false, null, null, false, null, 252, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.S), "MobileIdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(pk2.a.a(this.dateFormatter, data.getMobileIdCard().getValidTo().getDate(), "MdowodDocumentDetailsDrawerOtherValidityTermValueMobileIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.P), "MobileIdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(pk2.a.a(this.dateFormatter, data.getMobileIdCard().getValidFrom().getDate(), "MdowodDocumentDetailsDrawerOtherReleaseDateValueMobileIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.M), "MobileIdCard", null, 2, null), null, null, 0, 0, null, 62, null);
        b0 fatherName = data.getPersonalData().getFatherName();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(pk2.a.b(fatherName != null ? c0.e(fatherName) : null, this.labelProvider), "MdowodDocumentDetailsDrawerOtherFatherNameValueMobileIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.O), "MobileIdCard", null, 2, null), null, null, 0, 0, null, 62, null);
        b0 motherName = data.getPersonalData().getMotherName();
        if (motherName != null) {
            strE = c0.e(motherName);
        }
        return new o20.l.Section(labelC, v.s(customSingleCardData, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.b(pk2.a.b(strE, this.labelProvider), "MdowodDocumentDetailsDrawerOtherMotherNameValueMobileIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)));
    }

    private final o20.l.Shortcuts m(List<? extends rq0.c> availableServices, er.a<i0> onIdDocumentDetailPressed, er.a<i0> onVerificationClicked, er.a<i0> onRestrictPeselClicked, er.a<i0> onFineClicked, er.a<i0> onElectionsClicked, er.a<i0> onDeleteClicked, l<? super List<ShortcutMoreTransferData>, i0> toMoreDialog) {
        Label labelC = this.labelProvider.c(ik2.a.f93220u);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = null;
        SmallCardData smallCardData2 = new SmallCardData(null, labelC, null, i15, cVar, false, onVerificationClicked, 37, null);
        SmallCardData smallCardData3 = new SmallCardData(null, this.labelProvider.c(ik2.a.J), null, jz.a.f106787h3, new o50.f.Custom(null, null, 3, null), false, onIdDocumentDetailPressed, 37, null);
        SmallCardData smallCardData4 = (availableServices == null || !availableServices.contains(rq0.c.PESEL_RESTRICTION)) ? null : new SmallCardData(null, this.labelProvider.c(ik2.a.E), null, jz.a.f106854r0, cVar, false, onRestrictPeselClicked, 37, null);
        SmallCardData smallCardData5 = (availableServices == null || !availableServices.contains(rq0.c.FINES)) ? null : new SmallCardData(null, this.labelProvider.c(ik2.a.D), null, jz.a.A0, cVar, false, onFineClicked, 37, null);
        SmallCardData smallCardData6 = new SmallCardData(null, this.labelProvider.c(ik2.a.C), null, jz.a.D0, cVar, false, onElectionsClicked, 37, null);
        if (availableServices != null && availableServices.contains(rq0.c.ELECTORAL_REGISTER)) {
            smallCardData = smallCardData6;
        }
        return new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(smallCardData2, smallCardData3, smallCardData4, smallCardData5, smallCardData, new SmallCardData(null, this.labelProvider.c(ik2.a.f93203k), null, jz.a.f106727a, o50.f.b.f142477a, false, onDeleteClicked, 37, null)), new ShortcutMoreData(this.labelProvider.c(ik2.a.f93221v), toMoreDialog)));
    }

    private final BaseDocumentData q(DocumentStateData documentStateData, u state, y20.b animationsState, final Params.ActionHandler actionHandler) {
        Object objB;
        String string;
        List<o20.l> listF = f(documentStateData, actionHandler.h(), actionHandler.k(), actionHandler.i(), actionHandler.f(), actionHandler.e(), new er.a() { // from class: vk2.d
            @Override // er.a
            public final Object a() {
                return f.r(actionHandler);
            }
        }, actionHandler.d(), actionHandler.l(), actionHandler.a());
        p20.c cVar = this.giloshScreenMapper;
        List listQ = v.q(new u2.Flag(k.Poland, this.labelProvider.c(ik2.a.f93201j)), new u2.Hologram(null, null, 3, null));
        State state2 = new State(state, animationsState);
        o20.p.x xVar = o20.p.x.f140968c;
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, c0.e(documentStateData.getData().getScope().getData().getPersonalIdCard().getPicture()), null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        Bitmap bitmapA = aVar.a((byte[]) objB);
        boolean zE = documentStateData.getStatus().e();
        Label labelC = documentStateData.getStatus().e() ? this.labelProvider.c(ik2.a.f93215q) : this.labelProvider.c(ik2.a.f93209n);
        b0 name = documentStateData.getData().getScope().getData().getPersonalData().getName();
        if (name != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c0.e(name));
            b0 secondName = documentStateData.getData().getScope().getData().getPersonalData().getSecondName();
            if (secondName != null) {
                sb5.append(' ' + c0.e(secondName));
            }
            string = sb5.toString();
        } else {
            string = null;
        }
        KeyValueData keyValueData = new KeyValueData(mx.b.d(string, "namesValue"), this.labelProvider.c(ik2.a.f93217r), false, 4, null);
        b0 surname = documentStateData.getData().getScope().getData().getPersonalData().getSurname();
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(surname != null ? c0.e(surname) : null, "surnameValue"), this.labelProvider.c(ik2.a.f93219t), false, 4, null);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(documentStateData.getData().getScope().getData().getPersonalData().getCitizenship(), "citizenShipValue"), this.labelProvider.c(ik2.a.f93207m), false, 4, null);
        fz.b.LocalDate birthDate = documentStateData.getData().getScope().getData().getPersonalData().getBirthDate();
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d(birthDate != null ? this.dateConverter.a(birthDate.getDate()) : null, "birthDateValue"), this.labelProvider.c(ik2.a.f93205l), false, 4, null);
        b0 pesel = documentStateData.getData().getScope().getData().getPersonalData().getPesel();
        return new BaseDocumentData(null, null, null, cVar.b(new p20.c.Params(listQ, state2, xVar, bitmapA, null, null, null, zE, labelC, this.labelProvider.c(ik2.a.f93191e), new er.a() { // from class: vk2.e
            @Override // er.a
            public final Object a() {
                return f.s(actionHandler);
            }
        }, v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(mx.b.d(pesel != null ? c0.e(pesel) : null, "peselValue"), this.labelProvider.c(ik2.a.f93218s), true)), null, null, actionHandler.b(), documentStateData.getDocumentVMS(), 12400, null)), listF, null, null, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params.ActionHandler actionHandler) {
        actionHandler.j().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params.ActionHandler actionHandler) {
        actionHandler.j().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    private final x.a.DocumentView u(DocumentStateData documentStateData, cb4.i dialogVMS, u state, y20.b animationsState, Params.ActionHandler actionHandler) {
        Label labelN;
        String shortName = documentStateData.getShortName();
        if (shortName == null || (labelN = mx.b.b(shortName, "toolbarTitle")) == null) {
            labelN = this.labelProvider.c(ik2.a.f93184a0).n("toolbarTitle");
        }
        return new x.a.DocumentView(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), actionHandler.c()), labelN, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, d.f207209a, null, actionHandler.g(), 4, null)), null, 20, null), null, null, null, null, 61, null), dialogVMS, q(documentStateData, state, animationsState, actionHandler), actionHandler.c());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    private final String v(PersonalAddressContainer addressData) {
        b0 apartmentNumber;
        StringBuilder sb5 = null;
        if (addressData == null) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        if (addressData.getStreetPrefix() != null || addressData.getStreetName() != null) {
            b0 streetPrefix = addressData.getStreetPrefix();
            if (streetPrefix != null) {
                sb6.append(c0.e(streetPrefix) + ' ');
            }
            b0 streetName = addressData.getStreetName();
            if (streetName != null) {
                sb6.append(c0.e(streetName) + ' ');
            }
        }
        if (addressData.getStreetPrefix() == null && addressData.getStreetName() == null && addressData.getLocality() != null) {
            StringBuilder sb7 = new StringBuilder();
            b0 locality = addressData.getLocality();
            sb7.append(locality != null ? c0.e(locality) : null);
            sb7.append(' ');
            sb6.append(sb7.toString());
        }
        b0 houseNumber = addressData.getHouseNumber();
        if (houseNumber != null) {
            sb6.append(c0.e(houseNumber));
            b0 apartmentNumber2 = addressData.getApartmentNumber();
            if (apartmentNumber2 != null) {
                sb6.append('/' + c0.e(apartmentNumber2));
                sb5 = sb6;
            }
            if (sb5 == null) {
                apartmentNumber = addressData.getApartmentNumber();
                if (apartmentNumber != null) {
                    sb6.append(c0.e(apartmentNumber));
                }
            }
        } else {
            apartmentNumber = addressData.getApartmentNumber();
            if (apartmentNumber != null) {
                sb6.append(c0.e(apartmentNumber));
            }
        }
        if (addressData.getPostalCode() != null || addressData.getLocality() != null) {
            if (sb6.length() > 0) {
                sb6.append("\n");
            }
            b0 postalCode = addressData.getPostalCode();
            if (postalCode != null) {
                sb6.append(H(c0.e(postalCode)) + ' ');
            }
            b0 locality2 = addressData.getLocality();
            if (locality2 != null) {
                sb6.append(c0.e(locality2));
            }
        }
        return sb6.toString();
    }

    private final String x(PersonalAddressContainer date) {
        fz.b.LocalDate permanentAddressRegistrationDate;
        LocalDate date2 = (date == null || (permanentAddressRegistrationDate = date.getPermanentAddressRegistrationDate()) == null) ? null : permanentAddressRegistrationDate.getDate();
        if (date2 != null) {
            return this.dateConverter.a(date2);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public x.a b(Params params) {
        u state = params.getState();
        if (state instanceof w) {
            return x.a.c.f198905a;
        }
        if (state instanceof u.a) {
            return u(((u.a) state).getStateData(), state instanceof u.a.Dialog ? ((u.a.Dialog) state).getDialogVMS() : null, state, params.getAnimationsState(), params.getAction());
        }
        if (state instanceof u.c.Error) {
            return new x.a.Error(((u.c.Error) state).getErrorVMS());
        }
        if (state instanceof u.c) {
            return u(((u.c) state).getStateData(), state instanceof u.c.Dialog ? ((u.c.Dialog) state).getDialogVMS() : null, state, params.getAnimationsState(), params.getAction());
        }
        if (state instanceof u.b) {
            return u(((u.b) state).getStateData(), null, state, params.getAnimationsState(), params.getAction());
        }
        if (state instanceof Error) {
            return new x.a.Error(((Error) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
