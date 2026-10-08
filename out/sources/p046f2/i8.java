package p046f2;

import android.view.KeyEvent;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f1.b1;
import f1.e;
import f1.q0;
import f1.y0;
import g1.e1;
import g1.j1;
import g1.t0;
import h2.CalendarDate;
import h2.CalendarMonth;
import h2.a2;
import h2.b2;
import h2.i1;
import h2.l0;
import h2.o0;
import h2.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ju.p0;
import l2.k0;
import l2.q;
import l3.d0;
import l3.g0;
import l3.o;
import n3.y2;
import n4.ScrollAxisRange;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c4;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p114t0.a0;
import p114t0.f;
import p114t0.h;
import p114t0.l;
import p3.c;
import q4.TextStyle;
import u0.j0;
import w0.BorderStroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\u001ao\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001am\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b#\u0010$\u001a;\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b(\u0010)\u001a\u0085\u0001\u00100\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00172\u0014\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b0\u00101\u001aq\u00102\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00122\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b2\u00103\u001aM\u00108\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b8\u00109\u001a\u0087\u0001\u0010?\u001a\u00020\t2\u0006\u0010;\u001a\u00020:2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010>\u001a\u00020=H\u0003¢\u0006\u0004\b?\u0010@\u001a<\u0010A\u001a\u00020\t2\u0006\u0010;\u001a\u00020:2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\bA\u0010B\u001a\u001f\u0010C\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\bC\u0010D\u001a\u0095\u0001\u0010O\u001a\u00020\t2\u0006\u0010F\u001a\u00020E2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010G\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010\u00122\b\u0010I\u001a\u0004\u0018\u00010\u00122\b\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010N\u001a\u00060Lj\u0002`M2\u0006\u0010;\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010=2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\bR\u0010S\u001aS\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\f2\u0006\u0010V\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020:2\u0006\u0010X\u001a\u00020W2\b\u0010>\u001a\u0004\u0018\u00010=2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\bY\u0010Z\u001a7\u0010]\u001a\u00020\t2\u0006\u0010F\u001a\u00020Q2\u0006\u0010\u0001\u001a\u00020:2\u0006\u0010>\u001a\u00020=2\u0006\u0010\\\u001a\u00020[2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\b]\u0010^\u001a\u001f\u0010_\u001a\u00020Q2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b_\u0010`\u001a\u001f\u0010a\u001a\u00020Q2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\ba\u0010`\u001a9\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\f2\u0006\u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020\fH\u0003¢\u0006\u0004\bh\u0010i\u001ae\u0010r\u001a\u00020\t2\u0006\u0010j\u001a\u00020g2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010m\u001a\u00020\f2\u0006\u0010n\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f2\u0006\u0010p\u001a\u00020\f2\u0006\u0010q\u001a\u00020g2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\br\u0010s\u001aw\u0010x\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00122\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\t0&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u000e2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\bx\u0010y\u001aU\u0010{\u001a\u00020\t2\u0006\u0010j\u001a\u00020g2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\f2\u0006\u0010z\u001a\u00020\f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010n\u001a\u00020\f2\u0006\u0010q\u001a\u00020g2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b{\u0010|\u001a\u0091\u0001\u0010\u0087\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010}\u001a\u00020\f2\u0006\u0010~\u001a\u00020\f2\u0006\u0010\u007f\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020g2\u0007\u0010\u0081\u0001\u001a\u00020\u00022\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001aA\u0010\u008a\u0001\u001a\u00020\t2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0007\u0010\u0089\u0001\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001aG\u0010\u008f\u0001\u001a\u00020\t2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008e\u0001\u001a\u00020g2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010n\u001a\u00020\fH\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u001f\u0010\u0092\u0001\u001a\u00020\f*\u00030\u0091\u00012\u0006\u0010T\u001a\u00020\fH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u001f\u0010\u0094\u0001\u001a\u00020\f*\u00030\u0091\u00012\u0006\u0010T\u001a\u00020\fH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001\"\u001f\u0010\u0099\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u001f\u0010\u009c\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0096\u0001\u001a\u0006\b\u009b\u0001\u0010\u0098\u0001\"\u001f\u0010\u009f\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0096\u0001\u001a\u0006\b\u009e\u0001\u0010\u0098\u0001\" \u0010¥\u0001\u001a\u00030 \u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0018\u0010§\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010¢\u0001\"\u0018\u0010©\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¢\u0001\"\u0017\u0010«\u0001\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010\u0096\u0001\"\u001c\u0010®\u0001\u001a\u00020\f*\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u001c\u0010°\u0001\u001a\u00020\f*\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u00ad\u0001\"\u001c\u0010²\u0001\u001a\u00020\f*\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010\u00ad\u0001\"\u001c\u0010´\u0001\u001a\u00020\f*\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u00ad\u0001¨\u0006µ\u0001²\u0006\u000e\u0010\u007f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf2/j8;", "state", "Lf3/m;", "modifier", "Lf2/h5;", "dateFormatter", "Lf2/w4;", "colors", "Lkotlin/Function0;", "Loq/i0;", "title", "headline", "", "showModeToggle", "Ll3/d0;", "focusRequester", "E0", "(Lf2/j8;Lf3/m;Lf2/h5;Lf2/w4;Ler/p;Ler/p;ZLl3/d0;Lm2/r;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Llr/i;", "yearRange", "Lf2/ob;", "initialDisplayMode", "Lf2/pi;", "selectableDates", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37089p, "(Ljava/lang/Long;Ljava/lang/Long;Llr/i;ILf2/pi;Lm2/r;II)Lf2/j8;", "modeToggleButton", "Lq4/b4;", "headlineTextStyle", "Lc5/h;", "headerMinHeight", "content", "z0", "(Lf3/m;Ler/p;Ler/p;Ler/p;Lf2/w4;Lq4/b4;FLer/p;Lm2/r;I)V", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "k1", "(Lf3/m;ILer/l;Lf2/w4;Lm2/r;I)V", "selectedDateMillis", "displayedMonthMillis", "onDateSelectionChange", "onDisplayedMonthChange", "Lh2/l0;", "calendarModel", "M1", "(Ljava/lang/Long;JILer/l;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Ll3/d0;Lm2/r;II)V", "N0", "(Ljava/lang/Long;JLer/l;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "c1", "(Lf3/m;Ler/p;JJFLer/p;Lm2/r;I)V", "Lf1/y0;", "lazyListState", "onReturnFocus", "Ll3/o;", "focusManager", "p1", "(Lf1/y0;Ljava/lang/Long;Ler/l;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Ler/a;Ll3/o;Lm2/r;II)V", "J2", "(Lf1/y0;Ler/l;Lh2/l0;Llr/i;Ltq/e;)Ljava/lang/Object;", "W1", "(Lf2/w4;Lh2/l0;Lm2/r;I)V", "Lh2/p0;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Lf2/qi;", "rangeSelectionInfo", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "D1", "(Lh2/p0;Ler/l;JLjava/lang/Long;Ljava/lang/Long;Lf2/qi;Lf2/h5;Lf2/pi;Lf2/w4;Ljava/util/Locale;Lf1/y0;Ll3/o;Ler/a;Lm2/r;II)V", "", "G2", "(Llr/i;)I", "isRtl", "isFirstDay", "isLastDay", "Lju/p0;", "coroutineScope", "t2", "(Lf3/m;ZZZLf1/y0;Lju/p0;Ll3/o;Ler/a;)Lf3/m;", "Ll3/g;", "focusDirection", "z2", "(ILf1/y0;Ll3/o;ILju/p0;)V", "w2", "(Lh2/p0;Lf2/pi;)I", "x2", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "s2", "(ZZZZZLm2/r;I)Ljava/lang/String;", "text", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "f1", "(Ljava/lang/String;Lf3/m;ZLer/a;ZZZZLjava/lang/String;Lf2/w4;Lm2/r;I)V", "onYearSelected", "currentYearFocusRequester", "onYearShiftTabPressed", "onYearTabPressed", "e2", "(Lf3/m;JLer/l;Lf2/pi;Lh2/l0;Llr/i;Lf2/w4;Ll3/d0;Ler/a;Ler/a;Lm2/r;I)V", "currentYear", "Z1", "(Ljava/lang/String;Lf3/m;ZZLer/a;ZLjava/lang/String;Lf2/w4;Lm2/r;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "nextButtonModifier", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "onYearPickerButtonTabPressed", "yearSelectionButtonFocusRequester", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "(Lf3/m;ZZZLjava/lang/String;Lf3/m;Ler/a;Ler/a;Ler/a;Ler/a;Ll3/d0;Lf2/w4;Lm2/r;II)V", "expanded", "k2", "(Ler/a;ZLf3/m;Ler/p;Lm2/r;II)V", "Lt3/d;", "icon", "contentDescription", "x1", "(Ler/a;Lt3/d;Ljava/lang/String;Lf3/m;ZLm2/r;II)V", "Ly3/b;", "A2", "(Landroid/view/KeyEvent;Z)Z", "B2", "a", "F", "y2", "()F", "RecommendedSizeForAccessibility", "b", "getMonthYearHeight", "MonthYearHeight", "c", "u2", "DatePickerHorizontalPadding", "Ld1/d3;", "d", "Ld1/d3;", "v2", "()Ld1/d3;", "DatePickerModeTogglePadding", "e", "DatePickerTitlePadding", "f", "DatePickerHeadlinePadding", "g", "YearsVerticalPadding", "E2", "(Landroid/view/KeyEvent;)Z", "isShiftTab", "F2", "isTab", "C2", "isDirectionLeft", "D2", "isDirectionRight", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56212a = c5.h.n(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56213b = c5.h.n(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d3 f56215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d3 f56216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d3 f56217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f56218g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f56221g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, int i15, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f56220f = y0Var;
            this.f56221g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56219e;
            if (i15 == 0) {
                u.b(obj);
                if (!this.f56220f.c()) {
                    int iX = this.f56220f.x();
                    int i16 = this.f56221g;
                    if (iX != i16) {
                        y0 y0Var = this.f56220f;
                        this.f56219e = 1;
                        if (y0.R(y0Var, i16, 0, this, 2, null) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f56220f, this.f56221g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56223f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f56223f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56222e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    y0 y0Var = this.f56223f;
                    int iX = y0Var.x() + 1;
                    this.f56222e = 1;
                    if (y0.r(y0Var, iX, 0, this, 2, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f56223f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f56225f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56224e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    y0 y0Var = this.f56225f;
                    int iX = y0Var.x() - 1;
                    this.f56224e = 1;
                    if (y0.r(y0Var, iX, 0, this, 2, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f56225f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f56228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ lr.i f56229h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ CalendarMonth f56230j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0 y0Var, int i15, lr.i iVar, CalendarMonth calendarMonth, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f56227f = y0Var;
            this.f56228g = i15;
            this.f56229h = iVar;
            this.f56230j = calendarMonth;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56226e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56227f;
                int first = (((this.f56228g - this.f56229h.getFirst()) * 12) + this.f56230j.getMonth()) - 1;
                this.f56226e = 1;
                if (y0.R(y0Var, first, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f56227f, this.f56228g, this.f56229h, this.f56230j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f56231a;

        e(o oVar) {
            this.f56231a = oVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            long jA = y3.d.a(keyEvent);
            y3.a.Companion companion = y3.a.INSTANCE;
            if (y3.a.R(jA, companion.m()) || (y3.d.g(keyEvent) && y3.a.R(y3.d.a(keyEvent), companion.J()))) {
                this.f56231a.h(l3.g.INSTANCE.f());
                return Boolean.TRUE;
            }
            if (!y3.a.R(y3.d.a(keyEvent), companion.j()) && !y3.a.R(y3.d.a(keyEvent), companion.J())) {
                return Boolean.FALSE;
            }
            this.f56231a.h(l3.g.INSTANCE.e());
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<Long, i0> f56234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l0 f56235h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ lr.i f56236j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(y0 y0Var, er.l<? super Long, i0> lVar, l0 l0Var, lr.i iVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f56233f = y0Var;
            this.f56234g = lVar;
            this.f56235h = l0Var;
            this.f56236j = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56232e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56233f;
                er.l<Long, i0> lVar = this.f56234g;
                l0 l0Var = this.f56235h;
                lr.i iVar = this.f56236j;
                this.f56232e = 1;
                if (i8.J2(y0Var, lVar, l0Var, iVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f56233f, this.f56234g, this.f56235h, this.f56236j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f56237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56238b;

        g(boolean z15, er.a<i0> aVar) {
            this.f56237a = z15;
            this.f56238b = aVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (!this.f56237a || !i8.F2(keyEvent)) {
                return Boolean.FALSE;
            }
            this.f56238b.a();
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56240b;

        h(er.a<i0> aVar, er.a<i0> aVar2) {
            this.f56239a = aVar;
            this.f56240b = aVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (i8.E2(keyEvent)) {
                this.f56239a.a();
                return Boolean.TRUE;
            }
            if (!i8.F2(keyEvent)) {
                return Boolean.FALSE;
            }
            this.f56240b.a();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0 f56242f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d0 d0Var, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f56242f = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f56241e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            d0.f(this.f56242f, 0, 1, null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f56242f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f56244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f56245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f56246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p0 f56247e;

        j(er.a<i0> aVar, y0 y0Var, boolean z15, o oVar, p0 p0Var) {
            this.f56243a = aVar;
            this.f56244b = y0Var;
            this.f56245c = z15;
            this.f56246d = oVar;
            this.f56247e = p0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (i8.E2(keyEvent)) {
                this.f56243a.a();
                return Boolean.TRUE;
            }
            if (this.f56244b.c()) {
                return Boolean.TRUE;
            }
            if (i8.A2(keyEvent, this.f56245c)) {
                i8.z2(-1, this.f56244b, this.f56246d, l3.g.INSTANCE.f(), this.f56247e);
                return Boolean.TRUE;
            }
            if (!i8.B2(keyEvent, this.f56245c)) {
                return Boolean.FALSE;
            }
            this.f56246d.h(l3.g.INSTANCE.e());
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f56248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f56249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0 f56250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f56251d;

        k(o oVar, boolean z15, y0 y0Var, p0 p0Var) {
            this.f56248a = oVar;
            this.f56249b = z15;
            this.f56250c = y0Var;
            this.f56251d = p0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (i8.F2(keyEvent)) {
                o oVar = this.f56248a;
                l3.g.Companion companion = l3.g.INSTANCE;
                if (oVar.h(companion.a())) {
                    this.f56248a.h(this.f56249b ? companion.d() : companion.g());
                } else if (!this.f56250c.c()) {
                    i8.z2(1, this.f56250c, this.f56248a, companion.e(), this.f56251d);
                }
                return Boolean.TRUE;
            }
            if (this.f56250c.c()) {
                return Boolean.TRUE;
            }
            if (i8.B2(keyEvent, this.f56249b)) {
                i8.z2(1, this.f56250c, this.f56248a, l3.g.INSTANCE.e(), this.f56251d);
                return Boolean.TRUE;
            }
            if (!i8.A2(keyEvent, this.f56249b)) {
                return Boolean.FALSE;
            }
            this.f56248a.h(l3.g.INSTANCE.f());
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f56252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f56253b;

        l(boolean z15, o oVar) {
            this.f56252a = z15;
            this.f56253b = oVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (i8.B2(keyEvent, this.f56252a)) {
                this.f56253b.h(l3.g.INSTANCE.e());
                return Boolean.TRUE;
            }
            if (!i8.A2(keyEvent, this.f56252a)) {
                return Boolean.FALSE;
            }
            this.f56253b.h(l3.g.INSTANCE.f());
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class m extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f56256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f56257h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f56258j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(y0 y0Var, int i15, o oVar, int i16, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f56255f = y0Var;
            this.f56256g = i15;
            this.f56257h = oVar;
            this.f56258j = i16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m mVar;
            Object objE = uq.b.e();
            int i15 = this.f56254e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56255f;
                int iX = y0Var.x() + this.f56256g;
                this.f56254e = 1;
                mVar = this;
                if (y0.r(y0Var, iX, 0, mVar, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                mVar = this;
            }
            mVar.f56257h.h(mVar.f56258j);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f56255f, this.f56256g, this.f56257h, this.f56258j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n<T> implements mu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f56259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Long, i0> f56260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f56261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ lr.i f56262d;

        /* JADX WARN: Multi-variable type inference failed */
        n(y0 y0Var, er.l<? super Long, i0> lVar, l0 l0Var, lr.i iVar) {
            this.f56259a = y0Var;
            this.f56260b = lVar;
            this.f56261c = l0Var;
            this.f56262d = iVar;
        }

        @Override // mu.h
        public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
            return a(((Number) obj).intValue(), eVar);
        }

        public final Object a(int i15, tq.e<? super i0> eVar) {
            int iX = this.f56259a.x() / 12;
            this.f56260b.b(vq.b.f(this.f56261c.g(this.f56262d.getFirst() + iX, (this.f56259a.x() % 12) + 1).getStartUtcTimeMillis()));
            return i0.f148189a;
        }
    }

    static {
        float f15 = 12;
        f56214c = c5.h.n(f15);
        f56215d = a3.i(0.0f, 0.0f, c5.h.n(f15), c5.h.n(f15), 3, null);
        float f16 = 24;
        float f17 = 16;
        f56216e = a3.i(c5.h.n(f16), c5.h.n(f17), c5.h.n(f15), 0.0f, 8, null);
        f56217f = a3.i(c5.h.n(f16), 0.0f, c5.h.n(f15), c5.h.n(f15), 2, null);
        f56218g = c5.h.n(f17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(n4.i0 i0Var) {
        f0.a0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A1(er.a aVar, f3.m mVar, boolean z15, final t3.d dVar, final String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1124908186, i15, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2546)");
            }
            C6461wc.c(aVar, mVar, z15, null, null, null, y2.m.d(-1301085432, true, new p() { // from class: f2.d7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.B1(dVar, str, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 1572864, 56);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A2(KeyEvent keyEvent, boolean z15) {
        return z15 ? D2(keyEvent) : C2(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(final p pVar, p pVar2, p pVar3, w4 w4Var, TextStyle textStyle, r rVar, int i15) {
        d1.i.e eVarJ;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1658370654, i15, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1389)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (pVar == null || pVar2 == null) {
                eVarJ = pVar != null ? iVar.j() : iVar.f();
            } else {
                eVarJ = iVar.h();
            }
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(eVarJ, companion2.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            final q3 q3Var = q3.f39261a;
            if (pVar != null) {
                rVar.X(-516028300);
                oo.h(textStyle, y2.m.d(-738208900, true, new p() { // from class: f2.v5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.C0(q3Var, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, 48);
                rVar.R();
            } else {
                rVar.X(-515838022);
                rVar.R();
            }
            if (pVar2 == null) {
                rVar.X(-515799087);
            } else {
                rVar.X(260455984);
                pVar2.B(rVar, 0);
            }
            rVar.R();
            rVar.x();
            if (pVar3 == null && pVar == null && pVar2 == null) {
                rVar.X(-250277930);
                rVar.R();
            } else {
                rVar.X(-250360576);
                vb.h(null, 0.0f, w4Var.getDividerColor(), rVar, 0, 3);
                rVar.R();
            }
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B1(t3.d dVar, String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1301085432, i15, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2547)");
            }
            ad.e(dVar, str, null, 0L, rVar, 0, 12);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B2(KeyEvent keyEvent, boolean z15) {
        return z15 ? C2(keyEvent) : D2(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(p3 p3Var, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-738208900, i15, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1403)");
            }
            f3.m mVarC = p3.c(p3Var, f3.m.INSTANCE, 1.0f, false, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C1(er.a aVar, t3.d dVar, String str, f3.m mVar, boolean z15, int i15, int i16, r rVar, int i17) {
        x1(aVar, dVar, str, mVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final boolean C2(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(f3.m mVar, p pVar, p pVar2, p pVar3, w4 w4Var, TextStyle textStyle, float f15, p pVar4, int i15, r rVar, int i16) {
        z0(mVar, pVar, pVar2, pVar3, w4Var, textStyle, f15, pVar4, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x03a6  */
    public static final void D1(final CalendarMonth calendarMonth, final er.l<? super Long, i0> lVar, final long j15, final Long l15, final Long l16, final qi qiVar, final h5 h5Var, final pi piVar, final w4 w4Var, final Locale locale, final y0 y0Var, final o oVar, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        r rVar2;
        f3.m mVarD;
        r rVar3;
        int i19;
        int i25;
        boolean z15;
        boolean z16;
        boolean z17;
        final qi qiVar2 = qiVar;
        h5 h5Var2 = h5Var;
        pi piVar2 = piVar;
        Locale locale2 = locale;
        r rVarH = rVar.h(1724672983);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.W(calendarMonth) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.d(j15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.W(l15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(l16) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.W(qiVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= (i15 & PKIFailureInfo.badSenderNonce) == 0 ? rVarH.W(h5Var2) : rVarH.G(h5Var2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.W(piVar2) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.W(w4Var) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.W(locale2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i26 = i17;
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.W(y0Var) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.G(oVar) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(aVar) ? 256 : 128;
        }
        int i27 = i18;
        if (rVarH.r(((i26 & 306783379) == 306783378 && (i27 & 147) == 146) ? false : true, i26 & 1)) {
            if (t.k()) {
                t.o(1724672983, i26, i27, "androidx.compose.material3.Month (DatePicker.kt:1924)");
            }
            if (qiVar2 != null) {
                rVarH.X(-960393781);
                f3.m.Companion companion = f3.m.INSTANCE;
                boolean z18 = ((i26 & 458752) == 131072) | ((234881024 & i26) == 67108864);
                Object objE = rVarH.E();
                if (z18 || objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: f2.r7
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i8.E1(qiVar2, w4Var, (c) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarD = k3.k.d(companion, (er.l) objE);
                rVarH.R();
            } else {
                rVarH.X(-960202325);
                rVarH.R();
                mVarD = f3.m.INSTANCE;
            }
            Object objE2 = rVarH.E();
            if (objE2 == r.INSTANCE.a()) {
                objE2 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE2);
            }
            p0 p0Var = (p0) objE2;
            boolean z19 = rVarH.N(g1.l()) == c5.t.Rtl;
            int iW2 = w2(calendarMonth, piVar2);
            int iX2 = x2(calendarMonth, piVar2);
            boolean z25 = z19;
            f3.m mVarU = androidx.compose.foundation.layout.d.l(f3.m.INSTANCE, c5.h.n(f56212a * 6)).u(mVarD);
            w0 w0VarA = e0.a(d1.i.f39152a.i(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarU);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(-1663449878);
            int i28 = 0;
            int i29 = 6;
            int i35 = 0;
            while (i35 < i29) {
                int i36 = i28;
                f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarB = m3.b(d1.i.f39152a.i(), f3.c.INSTANCE.i(), rVarH, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarH);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                int i37 = i35;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                rVarH.X(-1092569031);
                i28 = i36;
                int i38 = 0;
                while (i38 < 7) {
                    if (i28 < calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() || i28 >= calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) {
                        i38 = i38;
                        rVar3 = rVarH;
                        i19 = i26;
                        i25 = iX2;
                        z15 = z25;
                        rVar3.X(490256726);
                        f3.m.Companion companion4 = f3.m.INSTANCE;
                        q qVar = q.f115154a;
                        r3.a(androidx.compose.foundation.layout.d.v(androidx.compose.foundation.layout.d.x(companion4, qVar.g(), qVar.e(), 0.0f, 0.0f, 12, null), ((c5.h) rVar3.N(hd.f())).getValue(), ((c5.h) rVar3.N(hd.f())).getValue()), rVar3, 0);
                        rVar3.R();
                    } else {
                        rVarH.X(491361535);
                        int daysFromStartOfWeekToFirstOfMonth = i28 - calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                        final long startUtcTimeMillis = calendarMonth.getStartUtcTimeMillis() + (((long) daysFromStartOfWeekToFirstOfMonth) * 86400000);
                        boolean z26 = startUtcTimeMillis == j15;
                        boolean z27 = l15 != null && startUtcTimeMillis == l15.longValue();
                        boolean z28 = l16 != null && startUtcTimeMillis == l16.longValue();
                        if (qiVar2 != null) {
                            rVarH.X(491792745);
                            boolean zD = ((i26 & 458752) == 131072) | rVarH.d(startUtcTimeMillis);
                            Object objE3 = rVarH.E();
                            if (zD || objE3 == r.INSTANCE.a()) {
                                if (startUtcTimeMillis < (l15 != null ? l15.longValue() : Long.MAX_VALUE)) {
                                    z17 = false;
                                } else {
                                    if (startUtcTimeMillis <= (l16 != null ? l16.longValue() : Long.MIN_VALUE)) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                }
                                objE3 = c6.e(Boolean.valueOf(z17), null, 2, null);
                                rVarH.v(objE3);
                            }
                            boolean zBooleanValue = ((Boolean) ((p076m2.a3) objE3).getValue()).booleanValue();
                            rVarH.R();
                            z16 = zBooleanValue;
                        } else {
                            i38 = i38;
                            rVarH.X(492321698);
                            rVarH.R();
                            z16 = false;
                        }
                        boolean z29 = z16;
                        boolean z35 = z26;
                        String strS2 = s2(qiVar2 != null, z35, z27, z28, z29, rVarH, 0);
                        boolean z36 = z28;
                        boolean z37 = z27;
                        String strB = h5Var2.b(Long.valueOf(startUtcTimeMillis), locale2, true);
                        if (strB == null) {
                            strB = "";
                        }
                        boolean zD2 = rVarH.d(startUtcTimeMillis) | ((i26 & 29360128) == 8388608);
                        Object objE4 = rVarH.E();
                        if (zD2 || objE4 == r.INSTANCE.a()) {
                            objE4 = Boolean.valueOf(piVar2.a(calendarMonth.getYear()) && piVar2.b(startUtcTimeMillis));
                            rVarH.v(objE4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objE4).booleanValue();
                        i25 = iX2;
                        rVar3 = rVarH;
                        i19 = i26;
                        String strC = w1.c(daysFromStartOfWeekToFirstOfMonth + 1, 0, 0, false, locale2, 7, null);
                        z15 = z25;
                        f3.m mVarT2 = t2(f3.m.INSTANCE, z15, i28 == iW2, i28 == i25, y0Var, p0Var, oVar, aVar);
                        boolean z38 = z37 || z36;
                        boolean zD3 = ((i19 & 112) == 32) | rVar3.d(startUtcTimeMillis);
                        Object objE5 = rVar3.E();
                        if (zD3 || objE5 == r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: f2.s7
                                @Override // er.a
                                public final Object a() {
                                    return i8.F1(lVar, startUtcTimeMillis);
                                }
                            };
                            rVar3.v(objE5);
                        }
                        er.a aVar2 = (er.a) objE5;
                        if (strS2 != null) {
                            strB = strS2 + ", " + strB;
                        }
                        f1(strC, mVarT2, z38, aVar2, z37, zBooleanValue2, z35, z29, strB, w4Var, rVar3, (i19 << 3) & 1879048192);
                        rVar3.R();
                    }
                    i28++;
                    piVar2 = piVar;
                    locale2 = locale;
                    i38++;
                    rVarH = rVar3;
                    iX2 = i25;
                    i26 = i19;
                    z25 = z15;
                    qiVar2 = qiVar;
                    h5Var2 = h5Var;
                }
                r rVar4 = rVarH;
                rVar4.R();
                rVar4.x();
                piVar2 = piVar;
                locale2 = locale;
                i35 = i37 + 1;
                i29 = 6;
                qiVar2 = qiVar;
                h5Var2 = h5Var;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.t7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.G1(calendarMonth, lVar, j15, l15, l16, qiVar, h5Var, piVar, w4Var, locale, y0Var, oVar, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean D2(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.l());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x013b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0192  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:149:0x021a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0277  */
    /* JADX WARN: Code duplicated, block: B:155:0x0282  */
    /* JADX WARN: Code duplicated, block: B:158:0x0296  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void E0(final j8 j8Var, f3.m mVar, h5 h5Var, w4 w4Var, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, i0> pVar2, boolean z15, d0 d0Var, r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        w4 w4Var2;
        int i18;
        p<? super r, ? super Integer, i0> pVarD;
        int i19;
        int i25;
        p<? super r, ? super Integer, i0> pVar3;
        int i26;
        int i27;
        boolean z16;
        int i28;
        int i29;
        int i35;
        boolean z17;
        r rVar2;
        final h5 h5Var2;
        final d0 d0Var2;
        final f3.m mVar3;
        final w4 w4Var3;
        final p<? super r, ? super Integer, i0> pVar4;
        final boolean z18;
        final p<? super r, ? super Integer, i0> pVar5;
        d5 d5VarM;
        final h5 h5Var3;
        final w4 w4VarI;
        boolean z19;
        int i36;
        p<? super r, ? super Integer, i0> pVarD2;
        p<? super r, ? super Integer, i0> pVar6;
        boolean z25;
        final w4 w4Var4;
        f3.m mVar4;
        int i37;
        d0 d0Var3;
        Object objE;
        Object objE2;
        boolean zW;
        Object objE3;
        l0 l0VarA;
        y2.f fVarD;
        int i38;
        boolean zG;
        r rVarH = rVar.h(1105472031);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(j8Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) != 0) {
                    i38 = 128;
                } else {
                    if ((i15 & 512) == 0) {
                        zG = rVarH.W(h5Var);
                    } else {
                        zG = rVarH.G(h5Var);
                    }
                    if (zG) {
                        i38 = 256;
                    } else {
                        i38 = 128;
                    }
                }
                i17 |= i38;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    w4Var2 = w4Var;
                    int i45 = rVarH.W(w4Var2) ? 2048 : 1024;
                    i17 |= i45;
                } else {
                    w4Var2 = w4Var;
                }
                i17 |= i45;
            } else {
                w4Var2 = w4Var;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    pVarD = pVar;
                    if (rVarH.G(pVarD)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        pVar3 = pVar2;
                        if (rVarH.G(pVar3)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        if ((1572864 & i15) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i28 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i28 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i28;
                        }
                        i29 = i16 & 128;
                        if (i29 != 0) {
                            i17 |= 12582912;
                        } else if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d0Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i39 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if ((i16 & 4) != 0) {
                                    objE2 = rVarH.E();
                                    if (objE2 == r.INSTANCE.a()) {
                                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                        rVarH.v(objE2);
                                    }
                                    h5Var3 = (h5) objE2;
                                    i17 &= -897;
                                } else {
                                    h5Var3 = h5Var;
                                }
                                if ((i16 & 8) != 0) {
                                    w4VarI = a5.f55133a.i(rVarH, 6);
                                    i17 &= -7169;
                                } else {
                                    w4VarI = w4Var2;
                                }
                                if (i18 != 0) {
                                    z19 = true;
                                    pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54);
                                    i36 = 54;
                                } else {
                                    z19 = true;
                                    i36 = 54;
                                }
                                if (i25 != 0) {
                                    pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, i36);
                                } else {
                                    pVarD2 = pVar3;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    int i46 = i17;
                                    d0Var3 = (d0) objE;
                                    z25 = z16;
                                    w4Var4 = w4VarI;
                                    i37 = i46;
                                    pVar3 = pVarD2;
                                    pVar6 = pVarD;
                                    mVar4 = mVar2;
                                } else {
                                    pVar3 = pVarD2;
                                    pVar6 = pVarD;
                                    z25 = z16;
                                    w4Var4 = w4VarI;
                                    mVar4 = mVar2;
                                    i37 = i17;
                                    d0Var3 = d0Var;
                                }
                            } else {
                                rVarH.O();
                                if ((i16 & 4) != 0) {
                                    i17 &= -897;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                h5Var3 = h5Var;
                                i37 = i17;
                                pVar6 = pVarD;
                                z25 = z16;
                                d0Var3 = d0Var;
                                mVar4 = mVar2;
                                w4Var4 = w4Var2;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                            }
                            zW = rVarH.W(j8Var.g());
                            objE3 = rVarH.E();
                            if (zW || objE3 == r.INSTANCE.a()) {
                                if (j8Var instanceof h0) {
                                    l0VarA = ((h0) j8Var).getCalendarModel();
                                } else {
                                    l0VarA = o0.a(j8Var.g());
                                }
                                objE3 = l0VarA;
                                rVarH.v(objE3);
                            }
                            final l0 l0Var = (l0) objE3;
                            if (z25) {
                                rVarH.X(-690563017);
                                fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            } else {
                                rVarH.X(-690175393);
                                rVarH.R();
                                fVarD = null;
                            }
                            y2.f fVar = fVarD;
                            q qVar = q.f115154a;
                            TextStyle textStyleE = ds.e(qVar.r(), rVarH, 6);
                            float fP = qVar.p();
                            final d0 d0Var4 = d0Var3;
                            final w4 w4Var5 = w4Var4;
                            p pVar7 = new p() { // from class: f2.b7
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.J0(j8Var, l0Var, h5Var3, w4Var5, d0Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            h5 h5Var4 = h5Var3;
                            int i47 = i37 >> 9;
                            rVar2 = rVarH;
                            z0(mVar4, pVar6, pVar3, fVar, w4Var4, textStyleE, fP, y2.m.d(-1346903698, true, pVar7, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i47 & 112) | (i47 & 896) | ((i37 << 3) & 57344));
                            if (t.k()) {
                                t.n();
                            }
                            h5Var2 = h5Var4;
                            d0Var2 = d0Var4;
                            z18 = z25;
                            mVar3 = mVar4;
                            pVar4 = pVar6;
                            w4Var3 = w4Var4;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            h5Var2 = h5Var;
                            d0Var2 = d0Var;
                            mVar3 = mVar2;
                            w4Var3 = w4Var2;
                            pVar4 = pVarD;
                            z18 = z16;
                        }
                        pVar5 = pVar3;
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.m7
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    z16 = z15;
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i48 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i48;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i49 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i49;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                        }
                        zW = rVarH.W(j8Var.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var2 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-690563017);
                            fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-690175393);
                            rVarH.R();
                            fVarD = null;
                        }
                        y2.f fVar2 = fVarD;
                        q qVar2 = q.f115154a;
                        TextStyle textStyleE2 = ds.e(qVar2.r(), rVarH, 6);
                        float fP2 = qVar2.p();
                        final d0 d0Var5 = d0Var3;
                        final w4 w4Var6 = w4Var4;
                        p pVar8 = new p() { // from class: f2.b7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.J0(j8Var, l0Var2, h5Var3, w4Var6, d0Var5, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var5 = h5Var3;
                        int i410 = i37 >> 9;
                        rVar2 = rVarH;
                        z0(mVar4, pVar6, pVar3, fVar2, w4Var4, textStyleE2, fP2, y2.m.d(-1346903698, true, pVar8, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i410 & 112) | (i410 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var5;
                        d0Var2 = d0Var5;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.m7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar3 = pVar2;
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i411 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i411;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i412 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i412;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                        }
                        zW = rVarH.W(j8Var.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var3 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-690563017);
                            fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-690175393);
                            rVarH.R();
                            fVarD = null;
                        }
                        y2.f fVar3 = fVarD;
                        q qVar3 = q.f115154a;
                        TextStyle textStyleE3 = ds.e(qVar3.r(), rVarH, 6);
                        float fP3 = qVar3.p();
                        final d0 d0Var6 = d0Var3;
                        final w4 w4Var7 = w4Var4;
                        p pVar9 = new p() { // from class: f2.b7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.J0(j8Var, l0Var3, h5Var3, w4Var7, d0Var6, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var6 = h5Var3;
                        int i413 = i37 >> 9;
                        rVar2 = rVarH;
                        z0(mVar4, pVar6, pVar3, fVar3, w4Var4, textStyleE3, fP3, y2.m.d(-1346903698, true, pVar9, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i413 & 112) | (i413 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var6;
                        d0Var2 = d0Var6;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.m7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i414 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i414;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i415 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i415;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var4 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar4 = fVarD;
                    q qVar4 = q.f115154a;
                    TextStyle textStyleE4 = ds.e(qVar4.r(), rVarH, 6);
                    float fP4 = qVar4.p();
                    final d0 d0Var7 = d0Var3;
                    final w4 w4Var8 = w4Var4;
                    p pVar10 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var4, h5Var3, w4Var8, d0Var7, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var7 = h5Var3;
                    int i416 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar4, w4Var4, textStyleE4, fP4, y2.m.d(-1346903698, true, pVar10, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i416 & 112) | (i416 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var7;
                    d0Var2 = d0Var7;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVarD = pVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i417 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i417;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i418 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i418;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                        }
                        zW = rVarH.W(j8Var.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var5 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-690563017);
                            fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-690175393);
                            rVarH.R();
                            fVarD = null;
                        }
                        y2.f fVar5 = fVarD;
                        q qVar5 = q.f115154a;
                        TextStyle textStyleE5 = ds.e(qVar5.r(), rVarH, 6);
                        float fP5 = qVar5.p();
                        final d0 d0Var8 = d0Var3;
                        final w4 w4Var9 = w4Var4;
                        p pVar11 = new p() { // from class: f2.b7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.J0(j8Var, l0Var5, h5Var3, w4Var9, d0Var8, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var8 = h5Var3;
                        int i419 = i37 >> 9;
                        rVar2 = rVarH;
                        z0(mVar4, pVar6, pVar3, fVar5, w4Var4, textStyleE5, fP5, y2.m.d(-1346903698, true, pVar11, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i419 & 112) | (i419 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var8;
                        d0Var2 = d0Var8;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.m7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4110 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4110;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4111 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4111;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var6 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar6 = fVarD;
                    q qVar6 = q.f115154a;
                    TextStyle textStyleE6 = ds.e(qVar6.r(), rVarH, 6);
                    float fP6 = qVar6.p();
                    final d0 d0Var9 = d0Var3;
                    final w4 w4Var10 = w4Var4;
                    p pVar12 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var6, h5Var3, w4Var10, d0Var9, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var9 = h5Var3;
                    int i4112 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar6, w4Var4, textStyleE6, fP6, y2.m.d(-1346903698, true, pVar12, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4112 & 112) | (i4112 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var9;
                    d0Var2 = d0Var9;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar3 = pVar2;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4113 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4113;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4114 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4114;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var7 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar7 = fVarD;
                    q qVar7 = q.f115154a;
                    TextStyle textStyleE7 = ds.e(qVar7.r(), rVarH, 6);
                    float fP7 = qVar7.p();
                    final d0 d0Var10 = d0Var3;
                    final w4 w4Var11 = w4Var4;
                    p pVar13 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var7, h5Var3, w4Var11, d0Var10, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var10 = h5Var3;
                    int i4115 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar7, w4Var4, textStyleE7, fP7, y2.m.d(-1346903698, true, pVar13, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4115 & 112) | (i4115 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var10;
                    d0Var2 = d0Var10;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i4116 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i4116;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i4117 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i4117;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                }
                zW = rVarH.W(j8Var.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var8 = (l0) objE3;
                if (z25) {
                    rVarH.X(-690563017);
                    fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-690175393);
                    rVarH.R();
                    fVarD = null;
                }
                y2.f fVar8 = fVarD;
                q qVar8 = q.f115154a;
                TextStyle textStyleE8 = ds.e(qVar8.r(), rVarH, 6);
                float fP8 = qVar8.p();
                final d0 d0Var11 = d0Var3;
                final w4 w4Var12 = w4Var4;
                p pVar14 = new p() { // from class: f2.b7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.J0(j8Var, l0Var8, h5Var3, w4Var12, d0Var11, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var11 = h5Var3;
                int i4118 = i37 >> 9;
                rVar2 = rVarH;
                z0(mVar4, pVar6, pVar3, fVar8, w4Var4, textStyleE8, fP8, y2.m.d(-1346903698, true, pVar14, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4118 & 112) | (i4118 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var11;
                d0Var2 = d0Var11;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) != 0) {
                i38 = 128;
            } else {
                if ((i15 & 512) == 0) {
                    zG = rVarH.W(h5Var);
                } else {
                    zG = rVarH.G(h5Var);
                }
                if (zG) {
                    i38 = 256;
                } else {
                    i38 = 128;
                }
            }
            i17 |= i38;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                w4Var2 = w4Var;
                if (rVarH.W(w4Var2)) {
                }
                i17 |= i45;
            } else {
                w4Var2 = w4Var;
            }
            i17 |= i45;
        } else {
            w4Var2 = w4Var;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                pVarD = pVar;
                if (rVarH.G(pVarD)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i4119 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i4119;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i41110 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i41110;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                        }
                        zW = rVarH.W(j8Var.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (j8Var instanceof h0) {
                                l0VarA = ((h0) j8Var).getCalendarModel();
                            } else {
                                l0VarA = o0.a(j8Var.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var9 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-690563017);
                            fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-690175393);
                            rVarH.R();
                            fVarD = null;
                        }
                        y2.f fVar9 = fVarD;
                        q qVar9 = q.f115154a;
                        TextStyle textStyleE9 = ds.e(qVar9.r(), rVarH, 6);
                        float fP9 = qVar9.p();
                        final d0 d0Var12 = d0Var3;
                        final w4 w4Var13 = w4Var4;
                        p pVar15 = new p() { // from class: f2.b7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.J0(j8Var, l0Var9, h5Var3, w4Var13, d0Var12, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var12 = h5Var3;
                        int i41111 = i37 >> 9;
                        rVar2 = rVarH;
                        z0(mVar4, pVar6, pVar3, fVar9, w4Var4, textStyleE9, fP9, y2.m.d(-1346903698, true, pVar15, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41111 & 112) | (i41111 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var12;
                        d0Var2 = d0Var12;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.m7
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41112 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41112;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41113 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41113;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var10 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar10 = fVarD;
                    q qVar10 = q.f115154a;
                    TextStyle textStyleE10 = ds.e(qVar10.r(), rVarH, 6);
                    float fP10 = qVar10.p();
                    final d0 d0Var13 = d0Var3;
                    final w4 w4Var14 = w4Var4;
                    p pVar16 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var10, h5Var3, w4Var14, d0Var13, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var13 = h5Var3;
                    int i41114 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar10, w4Var4, textStyleE10, fP10, y2.m.d(-1346903698, true, pVar16, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41114 & 112) | (i41114 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var13;
                    d0Var2 = d0Var13;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar3 = pVar2;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41115 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41115;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41116 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41116;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var11 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar11 = fVarD;
                    q qVar11 = q.f115154a;
                    TextStyle textStyleE11 = ds.e(qVar11.r(), rVarH, 6);
                    float fP11 = qVar11.p();
                    final d0 d0Var14 = d0Var3;
                    final w4 w4Var15 = w4Var4;
                    p pVar17 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var11, h5Var3, w4Var15, d0Var14, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var14 = h5Var3;
                    int i41117 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar11, w4Var4, textStyleE11, fP11, y2.m.d(-1346903698, true, pVar17, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41117 & 112) | (i41117 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var14;
                    d0Var2 = d0Var14;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i41118 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i41118;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i41119 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i41119;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                }
                zW = rVarH.W(j8Var.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var12 = (l0) objE3;
                if (z25) {
                    rVarH.X(-690563017);
                    fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-690175393);
                    rVarH.R();
                    fVarD = null;
                }
                y2.f fVar12 = fVarD;
                q qVar12 = q.f115154a;
                TextStyle textStyleE12 = ds.e(qVar12.r(), rVarH, 6);
                float fP12 = qVar12.p();
                final d0 d0Var15 = d0Var3;
                final w4 w4Var16 = w4Var4;
                p pVar18 = new p() { // from class: f2.b7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.J0(j8Var, l0Var12, h5Var3, w4Var16, d0Var15, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var15 = h5Var3;
                int i411110 = i37 >> 9;
                rVar2 = rVarH;
                z0(mVar4, pVar6, pVar3, fVar12, w4Var4, textStyleE12, fP12, y2.m.d(-1346903698, true, pVar18, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411110 & 112) | (i411110 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var15;
                d0Var2 = d0Var15;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        pVarD = pVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                pVar3 = pVar2;
                if (rVarH.G(pVar3)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i411111 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i411111;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i411112 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i411112;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                    }
                    zW = rVarH.W(j8Var.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (j8Var instanceof h0) {
                            l0VarA = ((h0) j8Var).getCalendarModel();
                        } else {
                            l0VarA = o0.a(j8Var.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var13 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-690563017);
                        fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-690175393);
                        rVarH.R();
                        fVarD = null;
                    }
                    y2.f fVar13 = fVarD;
                    q qVar13 = q.f115154a;
                    TextStyle textStyleE13 = ds.e(qVar13.r(), rVarH, 6);
                    float fP13 = qVar13.p();
                    final d0 d0Var16 = d0Var3;
                    final w4 w4Var17 = w4Var4;
                    p pVar19 = new p() { // from class: f2.b7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.J0(j8Var, l0Var13, h5Var3, w4Var17, d0Var16, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var16 = h5Var3;
                    int i411113 = i37 >> 9;
                    rVar2 = rVarH;
                    z0(mVar4, pVar6, pVar3, fVar13, w4Var4, textStyleE13, fP13, y2.m.d(-1346903698, true, pVar19, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411113 & 112) | (i411113 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var16;
                    d0Var2 = d0Var16;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m7
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411114 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411114;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411115 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411115;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                }
                zW = rVarH.W(j8Var.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var14 = (l0) objE3;
                if (z25) {
                    rVarH.X(-690563017);
                    fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-690175393);
                    rVarH.R();
                    fVarD = null;
                }
                y2.f fVar14 = fVarD;
                q qVar14 = q.f115154a;
                TextStyle textStyleE14 = ds.e(qVar14.r(), rVarH, 6);
                float fP14 = qVar14.p();
                final d0 d0Var17 = d0Var3;
                final w4 w4Var18 = w4Var4;
                p pVar110 = new p() { // from class: f2.b7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.J0(j8Var, l0Var14, h5Var3, w4Var18, d0Var17, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var17 = h5Var3;
                int i411116 = i37 >> 9;
                rVar2 = rVarH;
                z0(mVar4, pVar6, pVar3, fVar14, w4Var4, textStyleE14, fP14, y2.m.d(-1346903698, true, pVar110, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411116 & 112) | (i411116 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var17;
                d0Var2 = d0Var17;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        pVar3 = pVar2;
        i27 = i16 & 64;
        if (i27 != 0) {
            if ((1572864 & i15) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411117 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411117;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411118 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411118;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                }
                zW = rVarH.W(j8Var.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (j8Var instanceof h0) {
                        l0VarA = ((h0) j8Var).getCalendarModel();
                    } else {
                        l0VarA = o0.a(j8Var.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var15 = (l0) objE3;
                if (z25) {
                    rVarH.X(-690563017);
                    fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-690175393);
                    rVarH.R();
                    fVarD = null;
                }
                y2.f fVar15 = fVarD;
                q qVar15 = q.f115154a;
                TextStyle textStyleE15 = ds.e(qVar15.r(), rVarH, 6);
                float fP15 = qVar15.p();
                final d0 d0Var18 = d0Var3;
                final w4 w4Var19 = w4Var4;
                p pVar111 = new p() { // from class: f2.b7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.J0(j8Var, l0Var15, h5Var3, w4Var19, d0Var18, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var18 = h5Var3;
                int i411119 = i37 >> 9;
                rVar2 = rVarH;
                z0(mVar4, pVar6, pVar3, fVar15, w4Var4, textStyleE15, fP15, y2.m.d(-1346903698, true, pVar111, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411119 & 112) | (i411119 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var18;
                d0Var2 = d0Var18;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        z16 = z15;
        i29 = i16 & 128;
        if (i29 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.W(d0Var)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i17 |= i35;
        }
        if ((i17 & 4793491) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i39 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                        rVarH.v(objE2);
                    }
                    h5Var3 = (h5) objE2;
                    i17 &= -897;
                } else {
                    h5Var3 = h5Var;
                }
                if ((i16 & 8) != 0) {
                    w4VarI = a5.f55133a.i(rVarH, 6);
                    i17 &= -7169;
                } else {
                    w4VarI = w4Var2;
                }
                if (i18 != 0) {
                    z19 = true;
                    pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    i36 = 54;
                } else {
                    z19 = true;
                    i36 = 54;
                }
                if (i25 != 0) {
                    pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, i36);
                } else {
                    pVarD2 = pVar3;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    int i4111110 = i17;
                    d0Var3 = (d0) objE;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    i37 = i4111110;
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    mVar4 = mVar2;
                } else {
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    mVar4 = mVar2;
                    i37 = i17;
                    d0Var3 = d0Var;
                }
            } else {
                if (i39 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                        rVarH.v(objE2);
                    }
                    h5Var3 = (h5) objE2;
                    i17 &= -897;
                } else {
                    h5Var3 = h5Var;
                }
                if ((i16 & 8) != 0) {
                    w4VarI = a5.f55133a.i(rVarH, 6);
                    i17 &= -7169;
                } else {
                    w4VarI = w4Var2;
                }
                if (i18 != 0) {
                    z19 = true;
                    pVarD = y2.m.d(1655706771, true, new p() { // from class: f2.u5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.F0(j8Var, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    i36 = 54;
                } else {
                    z19 = true;
                    i36 = 54;
                }
                if (i25 != 0) {
                    pVarD2 = y2.m.d(1439279037, z19, new p() { // from class: f2.f6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.G0(j8Var, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, i36);
                } else {
                    pVarD2 = pVar3;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    int i4111111 = i17;
                    d0Var3 = (d0) objE;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    i37 = i4111111;
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    mVar4 = mVar2;
                } else {
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    mVar4 = mVar2;
                    i37 = i17;
                    d0Var3 = d0Var;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1105472031, i37, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
            }
            zW = rVarH.W(j8Var.g());
            objE3 = rVarH.E();
            if (zW) {
                if (j8Var instanceof h0) {
                    l0VarA = ((h0) j8Var).getCalendarModel();
                } else {
                    l0VarA = o0.a(j8Var.g());
                }
                objE3 = l0VarA;
                rVarH.v(objE3);
            } else {
                if (j8Var instanceof h0) {
                    l0VarA = ((h0) j8Var).getCalendarModel();
                } else {
                    l0VarA = o0.a(j8Var.g());
                }
                objE3 = l0VarA;
                rVarH.v(objE3);
            }
            final l0 l0Var16 = (l0) objE3;
            if (z25) {
                rVarH.X(-690563017);
                fVarD = y2.m.d(-1483431603, true, new p() { // from class: f2.q6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.H0(j8Var, w4Var4, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
            } else {
                rVarH.X(-690175393);
                rVarH.R();
                fVarD = null;
            }
            y2.f fVar16 = fVarD;
            q qVar16 = q.f115154a;
            TextStyle textStyleE16 = ds.e(qVar16.r(), rVarH, 6);
            float fP16 = qVar16.p();
            final d0 d0Var19 = d0Var3;
            final w4 w4Var110 = w4Var4;
            p pVar112 = new p() { // from class: f2.b7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.J0(j8Var, l0Var16, h5Var3, w4Var110, d0Var19, (r) obj, ((Integer) obj2).intValue());
                }
            };
            h5 h5Var19 = h5Var3;
            int i4111112 = i37 >> 9;
            rVar2 = rVarH;
            z0(mVar4, pVar6, pVar3, fVar16, w4Var4, textStyleE16, fP16, y2.m.d(-1346903698, true, pVar112, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4111112 & 112) | (i4111112 & 896) | ((i37 << 3) & 57344));
            if (t.k()) {
                t.n();
            }
            h5Var2 = h5Var19;
            d0Var2 = d0Var19;
            z18 = z25;
            mVar3 = mVar4;
            pVar4 = pVar6;
            w4Var3 = w4Var4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            h5Var2 = h5Var;
            d0Var2 = d0Var;
            mVar3 = mVar2;
            w4Var3 = w4Var2;
            pVar4 = pVarD;
            z18 = z16;
        }
        pVar5 = pVar3;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.m7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.M0(j8Var, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E1(qi qiVar, w4 w4Var, p3.c cVar) {
        ia.e0(cVar, qiVar, w4Var.getDayInSelectionRangeContainerColor());
        cVar.H2();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E2(KeyEvent keyEvent) {
        return y3.d.g(keyEvent) && y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(j8 j8Var, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1655706771, i15, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:188)");
            }
            a5.f55133a.g(j8Var.e(), a3.l(f3.m.INSTANCE, f56216e), w4Var.getTitleContentColor(), rVar, 3120, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F1(er.l lVar, long j15) {
        lVar.b(Long.valueOf(j15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F2(KeyEvent keyEvent) {
        return !y3.d.g(keyEvent) && y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(j8 j8Var, h5 h5Var, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1439279037, i15, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:195)");
            }
            a5.f55133a.d(j8Var.j(), j8Var.e(), h5Var, a3.l(f3.m.INSTANCE, f56217f), w4Var.getHeadlineContentColor(), rVar, 199680, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G1(CalendarMonth calendarMonth, er.l lVar, long j15, Long l15, Long l16, qi qiVar, h5 h5Var, pi piVar, w4 w4Var, Locale locale, y0 y0Var, o oVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        D1(calendarMonth, lVar, j15, l15, l16, qiVar, h5Var, piVar, w4Var, locale, y0Var, oVar, aVar, rVar, g4.a(i15 | 1), g4.a(i16));
        return i0.f148189a;
    }

    public static final int G2(lr.i iVar) {
        return ((iVar.getLast() - iVar.getFirst()) + 1) * 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(final j8 j8Var, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1483431603, i15, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:221)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, f56215d);
            int iE = j8Var.e();
            boolean zW = rVar.W(j8Var);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.h8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.I0(j8Var, (ob) obj);
                    }
                };
                rVar.v(objE);
            }
            k1(mVarL, iE, (er.l) objE, w4Var, rVar, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final void H1(final f3.m mVar, final boolean z15, final boolean z16, final boolean z17, final String str, final f3.m mVar2, final er.a<i0> aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, final er.a<i0> aVar4, final d0 d0Var, final w4 w4Var, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        r rVarH = rVar.h(942117263);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.a(z17) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(str) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.W(mVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= rVarH.G(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.G(aVar2) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.G(aVar3) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.G(aVar4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.W(d0Var) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.W(w4Var) ? 32 : 16;
        }
        int i19 = i18;
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true, i17 & 1)) {
            if (t.k()) {
                t.o(942117263, i17, i19, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2439)");
            }
            f3.m mVarL = androidx.compose.foundation.layout.d.l(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), f56213b);
            w0 w0VarB = m3.b(z17 ? d1.i.f39152a.j() : d1.i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarA = g0.a(f3.m.INSTANCE, d0Var);
            boolean z18 = ((i17 & 7168) == 2048) | ((1879048192 & i17) == 536870912);
            Object objE = rVarH.E();
            if (z18 || objE == r.INSTANCE.a()) {
                objE = new g(z17, aVar4);
                rVarH.v(objE);
            }
            k2(aVar3, z17, y3.f.a(mVarA, (er.l) objE), y2.m.d(921071711, true, new p() { // from class: f2.s6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.I1(str, w4Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ((i17 >> 24) & 14) | 3072 | ((i17 >> 6) & 112), 0);
            if (z17) {
                rVarH.X(-1240891753);
                rVarH.R();
            } else {
                rVarH.X(-1241751848);
                p076m2.d0.c(h4.a().d(Color.m0boximpl(w4Var.getNavigationContentColor())), y2.m.d(591596400, true, new p() { // from class: f2.t6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.K1(aVar2, z16, aVar, mVar2, z15, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.u6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.L1(mVar, z15, z16, z17, str, mVar2, aVar, aVar2, aVar3, aVar4, d0Var, w4Var, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final j8 H2(Long l15, Long l16, lr.i iVar, int i15, pi piVar, r rVar, int i16, int i17) {
        if ((i17 & 1) != 0) {
            l15 = null;
        }
        final Long l17 = l15;
        final Long l18 = (i17 & 2) != 0 ? l17 : l16;
        if ((i17 & 4) != 0) {
            iVar = a5.f55133a.q();
        }
        final lr.i iVar2 = iVar;
        if ((i17 & 8) != 0) {
            i15 = ob.INSTANCE.b();
        }
        final int i18 = i15;
        if ((i17 & 16) != 0) {
            piVar = a5.f55133a.m();
        }
        final pi piVar2 = piVar;
        if (t.k()) {
            t.o(2065763010, i16, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:388)");
        }
        final Locale localeA = v1.a(rVar, 0);
        Object[] objArr = new Object[0];
        b3.x<m8, Object> xVarC = m8.INSTANCE.c(piVar2, localeA);
        boolean z15 = true;
        boolean zG = ((((i16 & 14) ^ 6) > 4 && rVar.W(l17)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && rVar.W(l18)) || (i16 & 48) == 32) | rVar.G(iVar2) | ((((i16 & 7168) ^ 3072) > 2048 && rVar.c(i18)) || (i16 & 3072) == 2048);
        if ((((57344 & i16) ^ 24576) <= 16384 || !rVar.W(piVar2)) && (i16 & 24576) != 16384) {
            z15 = false;
        }
        boolean zW = zG | z15 | rVar.W(localeA);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            Object obj = new er.a() { // from class: f2.j5
                @Override // er.a
                public final Object a() {
                    return i8.I2(l17, l18, iVar2, i18, piVar2, localeA);
                }
            };
            rVar.v(obj);
            objE = obj;
        }
        m8 m8Var = (m8) b3.f.i(objArr, xVarC, (er.a) objE, rVar, 0);
        m8Var.n(piVar2);
        if (t.k()) {
            t.n();
        }
        return m8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(j8 j8Var, ob obVar) {
        j8Var.d(obVar.getValue());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I1(final String str, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(921071711, i15, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2463)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zW = rVar.W(str);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.l7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.J1(str, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.d(companion, false, (er.l) objE, 1, null), w4Var.getNavigationContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262136);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m8 I2(Long l15, Long l16, lr.i iVar, int i15, pi piVar, Locale locale) {
        return new m8(l15, l16, iVar, i15, piVar, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(final j8 j8Var, l0 l0Var, h5 h5Var, w4 w4Var, d0 d0Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1346903698, i15, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:235)");
            }
            Long lJ = j8Var.j();
            long jF = j8Var.f();
            int iE = j8Var.e();
            boolean zW = rVar.W(j8Var);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.k5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.K0(j8Var, (Long) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean zW2 = rVar.W(j8Var);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: f2.l5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.L0(j8Var, ((Long) obj).longValue());
                    }
                };
                rVar.v(objE2);
            }
            M1(lJ, jF, iE, lVar, (er.l) objE2, l0Var, j8Var.c(), h5Var, j8Var.b(), w4Var, d0Var, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J1(String str, n4.i0 i0Var) {
        f0.l0(i0Var, n4.i.INSTANCE.b());
        f0.c0(i0Var, str);
        return i0.f148189a;
    }

    public static final Object J2(final y0 y0Var, er.l<? super Long, i0> lVar, l0 l0Var, lr.i iVar, tq.e<? super i0> eVar) {
        Object objA = x5.q(new er.a() { // from class: f2.k7
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(i8.K2(y0Var));
            }
        }).a(new n(y0Var, lVar, l0Var, iVar), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(j8 j8Var, Long l15) {
        j8Var.l(l15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K1(er.a aVar, boolean z15, er.a aVar2, f3.m mVar, boolean z16, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(591596400, i15, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2479)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            i1 i1Var = i1.f79867a;
            t3.d dVarA = i1Var.a();
            a2.Companion companion3 = a2.INSTANCE;
            x1(aVar, dVarA, b2.b(a2.a(ih.f56332v), rVar, 0), null, z15, rVar, 0, 8);
            x1(aVar2, i1Var.b(), b2.b(a2.a(ih.f56331u), rVar, 0), mVar, z16, rVar, 0, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K2(y0 y0Var) {
        return y0Var.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L0(j8 j8Var, long j15) {
        j8Var.a(j15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L1(f3.m mVar, boolean z15, boolean z16, boolean z17, String str, f3.m mVar2, er.a aVar, er.a aVar2, er.a aVar3, er.a aVar4, d0 d0Var, w4 w4Var, int i15, int i16, r rVar, int i17) {
        H1(mVar, z15, z16, z17, str, mVar2, aVar, aVar2, aVar3, aVar4, d0Var, w4Var, rVar, g4.a(i15 | 1), g4.a(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(j8 j8Var, f3.m mVar, h5 h5Var, w4 w4Var, p pVar, p pVar2, boolean z15, d0 d0Var, int i15, int i16, r rVar, int i17) {
        E0(j8Var, mVar, h5Var, w4Var, pVar, pVar2, z15, d0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void M1(final Long l15, final long j15, final int i15, final er.l<? super Long, i0> lVar, final er.l<? super Long, i0> lVar2, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, final d0 d0Var, r rVar, final int i16, final int i17) {
        int i18;
        l0 l0Var2;
        lr.i iVar2;
        pi piVar2;
        int i19;
        r rVar2;
        r rVarH = rVar.h(-2053685029);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(l15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.d(j15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.c(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= rVarH.G(lVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i16) == 0) {
            l0Var2 = l0Var;
            i18 |= rVarH.G(l0Var2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            l0Var2 = l0Var;
        }
        if ((1572864 & i16) == 0) {
            iVar2 = iVar;
            i18 |= rVarH.G(iVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            iVar2 = iVar;
        }
        if ((12582912 & i16) == 0) {
            i18 |= (16777216 & i16) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i16) == 0) {
            piVar2 = piVar;
            i18 |= rVarH.W(piVar2) ? 67108864 : 33554432;
        } else {
            piVar2 = piVar;
        }
        if ((i16 & 805306368) == 0) {
            i18 |= rVarH.W(w4Var) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i17 & 6) == 0) {
            i19 = i17 | (rVarH.W(d0Var) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if (rVarH.r(((i18 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true, i18 & 1)) {
            if (t.k()) {
                t.o(-2053685029, i18, i19, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1461)");
            }
            final int i25 = -((c5.d) rVarH.N(g1.f())).X0(c5.h.n(48));
            final j0 j0VarB = of.b(k0.DefaultEffects, rVarH, 6);
            final j0 j0VarB2 = of.b(k0.FastEffects, rVarH, 6);
            int i26 = i18;
            k0 k0Var = k0.DefaultSpatial;
            final j0 j0VarB3 = of.b(k0Var, rVarH, 6);
            final j0 j0VarB4 = of.b(k0Var, rVarH, 6);
            ob obVarC = ob.c(i15);
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: f2.o5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.N1((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = v.d(companion, false, (er.l) objE, 1, null);
            boolean zG = rVarH.G(j0VarB3) | rVarH.G(j0VarB) | rVarH.G(j0VarB2) | rVarH.c(i25) | rVarH.G(j0VarB4);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: f2.p5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.O1(j0VarB3, j0VarB, j0VarB2, i25, j0VarB4, (h) obj);
                    }
                };
                rVarH.v(objE2);
            }
            er.l lVar3 = (er.l) objE2;
            final pi piVar3 = piVar2;
            final l0 l0Var3 = l0Var2;
            final lr.i iVar3 = iVar2;
            rVar2 = rVarH;
            p114t0.d.a(obVarC, mVarD, lVar3, null, "DatePickerDisplayModeAnimation", null, y2.m.d(1838500091, true, new er.r() { // from class: f2.q5
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return i8.U1(l15, j15, lVar, lVar2, l0Var3, iVar3, h5Var, piVar3, w4Var, d0Var, (f) obj, (ob) obj2, (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVar2, ((i26 >> 6) & 14) | 1597440, 40);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.r5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.V1(l15, j15, i15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, d0Var, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026e  */
    /* JADX WARN: Code duplicated, block: B:121:0x028a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:129:0x0306  */
    /* JADX WARN: Code duplicated, block: B:132:0x0312  */
    /* JADX WARN: Code duplicated, block: B:133:0x0316  */
    /* JADX WARN: Code duplicated, block: B:136:0x0374  */
    /* JADX WARN: Code duplicated, block: B:139:0x0380  */
    /* JADX WARN: Code duplicated, block: B:140:0x0384  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x049b  */
    private static final void N0(final Long l15, final long j15, final er.l<? super Long, i0> lVar, final er.l<? super Long, i0> lVar2, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, r rVar, final int i15) {
        int i16;
        String str;
        boolean zG;
        Object objE;
        boolean zW;
        Object objE2;
        boolean zW2;
        Object objE3;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        boolean zW3;
        Object objE4;
        r rVarH = rVar.h(-434467002);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(l15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.d(j15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(lVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(l0Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(iVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= (2097152 & i15) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(piVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= rVarH.W(w4Var) ? 67108864 : 33554432;
        }
        if (rVarH.r((38347923 & i16) != 38347922, i16 & 1)) {
            if (t.k()) {
                t.o(-434467002, i16, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1555)");
            }
            final CalendarMonth calendarMonthH = l0Var.h(j15);
            int iE = lr.m.e(calendarMonthH.g(iVar), 0);
            final y0 y0VarC = b1.c(iE, 0, rVarH, 0, 2);
            Integer numValueOf = Integer.valueOf(iE);
            boolean zW4 = rVarH.W(y0VarC) | rVarH.c(iE);
            Object objE5 = rVarH.E();
            if (zW4 || objE5 == r.INSTANCE.a()) {
                objE5 = new a(y0VarC, iE, null);
                rVarH.v(objE5);
            }
            Function0.d(numValueOf, (p) objE5, rVarH, 0);
            Object objE6 = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE6 == companion.a()) {
                objE6 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE6);
            }
            final p0 p0Var = (p0) objE6;
            Object[] objArr = new Object[0];
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = new er.a() { // from class: f2.d6
                    @Override // er.a
                    public final Object a() {
                        return i8.O0();
                    }
                };
                rVarH.v(objE7);
            }
            final p076m2.a3 a3Var = (p076m2.a3) b3.f.k(objArr, (er.a) objE7, rVarH, 48);
            final o oVar = (o) rVarH.N(g1.g());
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = d0.INSTANCE.a();
                rVarH.v(objE8);
            }
            d0.Companion.C2787a c2787a = (d0.Companion.C2787a) objE8;
            final d0 d0VarA = c2787a.a();
            final d0 d0VarB = c2787a.b();
            final d0 d0VarC = c2787a.c();
            final d0 d0VarD = c2787a.d();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK = iVar2.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            int i17 = i16;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            float f15 = f56214c;
            f3.m mVarP = a3.p(companion2, f15, 0.0f, 2, null);
            boolean zE = y0VarC.e();
            boolean zD = y0VarC.d();
            boolean zP0 = P0(a3Var);
            String strA = h5Var.a(Long.valueOf(j15), l0Var.getLocale());
            if (strA == null) {
                strA = "-";
            }
            f3.m mVarA = g0.a(companion2, d0VarA);
            boolean zG2 = rVarH.G(p0Var) | rVarH.W(y0VarC);
            Object objE9 = rVarH.E();
            if (zG2) {
                str = strA;
            } else {
                str = strA;
                if (objE9 == companion.a()) {
                }
                er.a aVar = (er.a) objE9;
                zG = rVarH.G(p0Var) | rVarH.W(y0VarC);
                objE = rVarH.E();
                if (zG || objE == companion.a()) {
                    objE = new er.a() { // from class: f2.g6
                        @Override // er.a
                        public final Object a() {
                            return i8.S0(p0Var, y0VarC);
                        }
                    };
                    rVarH.v(objE);
                }
                er.a aVar2 = (er.a) objE;
                zW = rVarH.W(a3Var);
                objE2 = rVarH.E();
                if (zW || objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: f2.h6
                        @Override // er.a
                        public final Object a() {
                            return i8.T0(a3Var);
                        }
                    };
                    rVarH.v(objE2);
                }
                er.a aVar3 = (er.a) objE2;
                zW2 = rVarH.W(d0VarC) | rVarH.G(oVar);
                objE3 = rVarH.E();
                if (zW2 || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: f2.i6
                        @Override // er.a
                        public final Object a() {
                            return i8.U0(d0VarC, oVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                H1(mVarP, zE, zD, zP0, str, mVarA, aVar, aVar2, aVar3, (er.a) objE3, d0VarB, w4Var, rVarH, 6, (i17 >> 21) & 112);
                w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion2);
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                x xVar = x.f39368a;
                f3.m mVarP2 = a3.p(companion2, f15, 0.0f, 2, null);
                w0 w0VarA2 = e0.a(iVar2.k(), companion3.k(), rVarH, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarP2);
                aVarB2 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarA2, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                W1(w4Var, l0Var, rVarH, ((i17 >> 24) & 14) | ((i17 >> 9) & 112));
                zW3 = rVarH.W(d0VarA);
                objE4 = rVarH.E();
                if (zW3 || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: f2.j6
                        @Override // er.a
                        public final Object a() {
                            return i8.V0(d0VarA);
                        }
                    };
                    rVarH.v(objE4);
                }
                p1(y0VarC, l15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, (er.a) objE4, oVar, rVarH, ((i17 << 3) & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 0);
                rVarH.x();
                k0 k0Var = k0.DefaultEffects;
                j0 j0VarB = of.b(k0Var, rVarH, 6);
                j0 j0VarB2 = of.b(k0.FastEffects, rVarH, 6);
                j0 j0VarB3 = of.b(k0Var, rVarH, 6);
                p114t0.k.g(P0(a3Var), k3.f.b(companion2), a0.m(j0VarB3, null, false, null, 14, null).c(a0.n(j0VarB, 0.6f)), a0.A(j0VarB3, null, false, null, 14, null).c(a0.q(j0VarB2, 0.0f, 2, null)), null, y2.m.d(1193716082, true, new er.q() { // from class: f2.k6
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i8.W0(j15, a3Var, p0Var, y0VarC, iVar, calendarMonthH, piVar, l0Var, w4Var, d0VarC, d0VarB, d0VarD, oVar, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 196656, 16);
                rVarH = rVarH;
                rVarH.x();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            }
            objE9 = new er.a() { // from class: f2.e6
                @Override // er.a
                public final Object a() {
                    return i8.R0(p0Var, y0VarC);
                }
            };
            rVarH.v(objE9);
            er.a aVar4 = (er.a) objE9;
            zG = rVarH.G(p0Var) | rVarH.W(y0VarC);
            objE = rVarH.E();
            if (zG) {
                objE = new er.a() { // from class: f2.g6
                    @Override // er.a
                    public final Object a() {
                        return i8.S0(p0Var, y0VarC);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: f2.g6
                    @Override // er.a
                    public final Object a() {
                        return i8.S0(p0Var, y0VarC);
                    }
                };
                rVarH.v(objE);
            }
            er.a aVar5 = (er.a) objE;
            zW = rVarH.W(a3Var);
            objE2 = rVarH.E();
            if (zW) {
                objE2 = new er.a() { // from class: f2.h6
                    @Override // er.a
                    public final Object a() {
                        return i8.T0(a3Var);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.a() { // from class: f2.h6
                    @Override // er.a
                    public final Object a() {
                        return i8.T0(a3Var);
                    }
                };
                rVarH.v(objE2);
            }
            er.a aVar6 = (er.a) objE2;
            zW2 = rVarH.W(d0VarC) | rVarH.G(oVar);
            objE3 = rVarH.E();
            if (zW2) {
                objE3 = new er.a() { // from class: f2.i6
                    @Override // er.a
                    public final Object a() {
                        return i8.U0(d0VarC, oVar);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: f2.i6
                    @Override // er.a
                    public final Object a() {
                        return i8.U0(d0VarC, oVar);
                    }
                };
                rVarH.v(objE3);
            }
            H1(mVarP, zE, zD, zP0, str, mVarA, aVar4, aVar5, aVar6, (er.a) objE3, d0VarB, w4Var, rVarH, 6, (i17 >> 21) & 112);
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, companion2);
            aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI2, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            x xVar2 = x.f39368a;
            f3.m mVarP3 = a3.p(companion2, f15, 0.0f, 2, null);
            w0 w0VarA3 = e0.a(iVar2.k(), companion3.k(), rVarH, 0);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT5 = rVarH.t();
            f3.m mVarE5 = f3.j.e(rVarH, mVarP3);
            aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarA3, companion4.d());
            n6.i(rVarC5, e0VarT5, companion4.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
            n6.g(rVarC5, companion4.a());
            n6.i(rVarC5, mVarE5, companion4.e());
            W1(w4Var, l0Var, rVarH, ((i17 >> 24) & 14) | ((i17 >> 9) & 112));
            zW3 = rVarH.W(d0VarA);
            objE4 = rVarH.E();
            if (zW3) {
                objE4 = new er.a() { // from class: f2.j6
                    @Override // er.a
                    public final Object a() {
                        return i8.V0(d0VarA);
                    }
                };
                rVarH.v(objE4);
            } else {
                objE4 = new er.a() { // from class: f2.j6
                    @Override // er.a
                    public final Object a() {
                        return i8.V0(d0VarA);
                    }
                };
                rVarH.v(objE4);
            }
            p1(y0VarC, l15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, (er.a) objE4, oVar, rVarH, ((i17 << 3) & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 0);
            rVarH.x();
            k0 k0Var2 = k0.DefaultEffects;
            j0 j0VarB4 = of.b(k0Var2, rVarH, 6);
            j0 j0VarB5 = of.b(k0.FastEffects, rVarH, 6);
            j0 j0VarB6 = of.b(k0Var2, rVarH, 6);
            p114t0.k.g(P0(a3Var), k3.f.b(companion2), a0.m(j0VarB6, null, false, null, 14, null).c(a0.n(j0VarB4, 0.6f)), a0.A(j0VarB6, null, false, null, 14, null).c(a0.q(j0VarB5, 0.0f, 2, null)), null, y2.m.d(1193716082, true, new er.q() { // from class: f2.k6
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i8.W0(j15, a3Var, p0Var, y0VarC, iVar, calendarMonthH, piVar, l0Var, w4Var, d0VarC, d0VarB, d0VarD, oVar, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196656, 16);
            rVarH = rVarH;
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.l6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.b1(l15, j15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N1(n4.i0 i0Var) {
        f0.a0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.a3 O0() {
        return c6.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final p114t0.v O1(j0 j0Var, j0 j0Var2, j0 j0Var3, final int i15, final j0 j0Var4, p114t0.h hVar) {
        return hVar.b(ob.f(((ob) hVar.a()).getValue(), ob.INSTANCE.a()) ? p114t0.d.f(a0.C(j0Var, new er.l() { // from class: f2.y5
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(i8.P1(((Integer) obj).intValue()));
            }
        }).c(a0.o(j0Var2, 0.0f, 2, null)), a0.q(j0Var3, 0.0f, 2, null).c(a0.F(j0Var, new er.l() { // from class: f2.z5
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(i8.Q1(i15, ((Integer) obj).intValue()));
            }
        }))) : p114t0.d.f(a0.C(j0Var, new er.l() { // from class: f2.a6
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(i8.R1(i15, ((Integer) obj).intValue()));
            }
        }).c(a0.o(j0Var2, 0.0f, 2, null)), a0.F(j0Var, new er.l() { // from class: f2.b6
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(i8.S1(((Integer) obj).intValue()));
            }
        }).c(a0.q(j0Var3, 0.0f, 2, null))), p114t0.d.c(true, new p() { // from class: f2.c6
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return i8.T1(j0Var4, (c5.r) obj, (c5.r) obj2);
            }
        }));
    }

    private static final boolean P0(p076m2.a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P1(int i15) {
        return i15;
    }

    private static final void Q0(p076m2.a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q1(int i15, int i16) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R0(p0 p0Var, y0 y0Var) {
        ju.k.d(p0Var, null, null, new b(y0Var, null), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R1(int i15, int i16) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S0(p0 p0Var, y0 y0Var) {
        ju.k.d(p0Var, null, null, new c(y0Var, null), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S1(int i15) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(p076m2.a3 a3Var) {
        Q0(a3Var, !P0(a3Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 T1(j0 j0Var, c5.r rVar, c5.r rVar2) {
        return j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U0(d0 d0Var, o oVar) {
        if (!d0.f(d0Var, 0, 1, null)) {
            oVar.h(l3.g.INSTANCE.a());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U1(Long l15, long j15, er.l lVar, er.l lVar2, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, p114t0.f fVar, ob obVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1838500091, i15, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1516)");
        }
        int value = obVar.getValue();
        ob.Companion companion = ob.INSTANCE;
        if (ob.f(value, companion.b())) {
            rVar.X(1567031954);
            N0(l15, j15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, rVar, 0);
            rVar.R();
        } else if (ob.f(value, companion.a())) {
            rVar.X(1567050592);
            t4.l(l15, lVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, 0);
            rVar.R();
        } else {
            rVar.X(1334373351);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(d0 d0Var) {
        d0.f(d0Var, 0, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V1(Long l15, long j15, int i15, er.l lVar, er.l lVar2, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, int i16, int i17, r rVar, int i18) {
        M1(l15, j15, i15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, g4.a(i16 | 1), g4.a(i17));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(long j15, final p076m2.a3 a3Var, final p0 p0Var, final y0 y0Var, final lr.i iVar, final CalendarMonth calendarMonth, pi piVar, l0 l0Var, w4 w4Var, d0 d0Var, final d0 d0Var2, final d0 d0Var3, final o oVar, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1193716082, i15, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1670)");
        }
        a2.Companion companion = a2.INSTANCE;
        final String strB = b2.b(a2.a(ih.f56336z), rVar, 0);
        f3.m.Companion companion2 = f3.m.INSTANCE;
        boolean zW = rVar.W(strB);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: f2.x6
                @Override // er.l
                public final Object b(Object obj) {
                    return i8.X0(strB, (n4.i0) obj);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarD = v.d(companion2, false, (er.l) objE, 1, null);
        w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, mVarD);
        androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarA, companion3.d());
        n6.i(rVarC, e0VarT, companion3.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
        n6.g(rVarC, companion3.a());
        n6.i(rVarC, mVarE, companion3.e());
        d1.i0 i0Var = d1.i0.f39176a;
        f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.l(companion2, c5.h.n(c5.h.n(f56212a * 7) - pb.f57269a.b())), f56214c, 0.0f, 2, null);
        boolean zW2 = rVar.W(a3Var) | rVar.G(p0Var) | rVar.W(y0Var) | rVar.G(iVar) | rVar.W(calendarMonth);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: f2.y6
                @Override // er.l
                public final Object b(Object obj) {
                    return i8.Y0(p0Var, a3Var, y0Var, iVar, calendarMonth, ((Integer) obj).intValue());
                }
            };
            rVar.v(objE2);
        }
        er.l lVar2 = (er.l) objE2;
        boolean zW3 = rVar.W(d0Var2);
        Object objE3 = rVar.E();
        if (zW3 || objE3 == r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: f2.z6
                @Override // er.a
                public final Object a() {
                    return i8.Z0(d0Var2);
                }
            };
            rVar.v(objE3);
        }
        er.a aVar = (er.a) objE3;
        boolean zW4 = rVar.W(d0Var3) | rVar.G(oVar);
        Object objE4 = rVar.E();
        if (zW4 || objE4 == r.INSTANCE.a()) {
            objE4 = new er.a() { // from class: f2.a7
                @Override // er.a
                public final Object a() {
                    return i8.a1(d0Var3, oVar);
                }
            };
            rVar.v(objE4);
        }
        e2(mVarP, j15, lVar2, piVar, l0Var, iVar, w4Var, d0Var, aVar, (er.a) objE4, rVar, 6);
        long dividerColor = w4Var.getDividerColor();
        f3.m mVarA = g0.a(companion2, d0Var3);
        boolean zG = rVar.G(oVar);
        Object objE5 = rVar.E();
        if (zG || objE5 == r.INSTANCE.a()) {
            objE5 = new e(oVar);
            rVar.v(objE5);
        }
        vb.h(l3.p.a(y3.f.a(mVarA, (er.l) objE5)), 0.0f, dividerColor, rVar, 0, 2);
        rVar.x();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void W1(final w4 w4Var, final l0 l0Var, r rVar, final int i15) {
        r rVar2;
        r rVarH = rVar.h(-1849465391);
        int i16 = (i15 & 6) == 0 ? (rVarH.W(w4Var) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(l0Var) ? 32 : 16;
        }
        ?? r15 = 0;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1849465391, i16, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1859)");
            }
            int firstDayOfWeek = l0Var.getFirstDayOfWeek();
            List<oq.r<String, String>> listK = l0Var.k();
            ArrayList arrayList = new ArrayList();
            int i17 = firstDayOfWeek - 1;
            int size = listK.size();
            for (int i18 = i17; i18 < size; i18++) {
                arrayList.add(listK.get(i18));
            }
            for (int i19 = 0; i19 < i17; i19++) {
                arrayList.add(listK.get(i19));
            }
            TextStyle textStyleE = ds.e(q.f115154a.I(), rVarH, 6);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.b(f3.m.INSTANCE, 0.0f, f56212a, 1, null), 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.i(), f3.c.INSTANCE.i(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            rVarH.X(24563235);
            int size2 = arrayList.size();
            int i25 = 0;
            while (i25 < size2) {
                final oq.r rVar3 = (oq.r) arrayList.get(i25);
                f3.m.Companion companion2 = f3.m.INSTANCE;
                boolean zW = rVarH.W(rVar3);
                Object objE = rVarH.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: f2.p6
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i8.X1(rVar3, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarA = v.a(companion2, (er.l) objE);
                q qVar = q.f115154a;
                f3.m mVarV = androidx.compose.foundation.layout.d.v(androidx.compose.foundation.layout.d.x(mVarA, qVar.g(), qVar.e(), 0.0f, 0.0f, 12, null), ((c5.h) rVarH.N(hd.f())).getValue(), ((c5.h) rVarH.N(hd.f())).getValue());
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), r15);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, r15));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarV);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                x xVar = x.f39368a;
                r rVar4 = rVarH;
                oo.j((String) rVar3.d(), androidx.compose.foundation.layout.d.E(companion2, null, false, 3, null), w4Var.getWeekdayContentColor(), null, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, textStyleE, rVar4, 48, 0, 130040);
                rVar4.x();
                i25++;
                rVarH = rVar4;
                arrayList = arrayList;
                r15 = 0;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.r6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.Y1(w4Var, l0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X0(String str, n4.i0 i0Var) {
        f0.n0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X1(oq.r rVar, n4.i0 i0Var) {
        f0.c0(i0Var, (String) rVar.c());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y0(p0 p0Var, p076m2.a3 a3Var, y0 y0Var, lr.i iVar, CalendarMonth calendarMonth, int i15) {
        Q0(a3Var, !P0(a3Var));
        ju.k.d(p0Var, null, null, new d(y0Var, i15, iVar, calendarMonth, null), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y1(w4 w4Var, l0 l0Var, int i15, r rVar, int i16) {
        W1(w4Var, l0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(d0 d0Var) {
        d0.f(d0Var, 0, 1, null);
        return i0.f148189a;
    }

    private static final void Z1(final String str, final f3.m mVar, final boolean z15, final boolean z16, final er.a<i0> aVar, final boolean z17, final String str2, final w4 w4Var, r rVar, final int i15) {
        String str3;
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1153850597);
        if ((i15 & 6) == 0) {
            str3 = str;
            i16 = (rVarH.W(str3) ? 4 : 2) | i15;
        } else {
            str3 = str;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(aVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.a(z17) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(w4Var) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (t.k()) {
                t.o(-1153850597, i16, -1, "androidx.compose.material3.Year (DatePicker.kt:2373)");
            }
            boolean z18 = ((i16 & 7168) == 2048) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (z18 || objE == r.INSTANCE.a()) {
                objE = (!z16 || z15) ? null : w0.x.a(q.f115154a.m(), w4Var.getTodayDateBorderColor());
                rVarH.v(objE);
            }
            BorderStroke borderStroke = (BorderStroke) objE;
            boolean z19 = (3670016 & i16) == 1048576;
            Object objE2 = rVarH.E();
            if (z19 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: f2.b8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.a2(str2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            int i17 = i16 >> 6;
            int i18 = i17 & 14;
            final String str4 = str3;
            rVar2 = rVarH;
            androidx.compose.material3.l.h(z15, aVar, v.c(mVar, true, (er.l) objE2), z17, ui.h(q.f115154a.F(), rVarH, 6), w4Var.q(z15, z17, rVarH, i18 | ((i16 >> 12) & 112) | ((i16 >> 15) & 896)).getValue().m20unboximpl(), 0L, 0.0f, 0.0f, borderStroke, null, y2.m.d(-564400443, true, new p() { // from class: f2.c8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.b2(str4, w4Var, z16, z15, z17, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, i18 | ((i16 >> 9) & 112) | (i17 & 7168), 48, 1472);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.d8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.d2(str, mVar, z15, z16, aVar, z17, str2, w4Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a1(d0 d0Var, o oVar) {
        d0.f(d0Var, 0, 1, null);
        oVar.h(l3.g.INSTANCE.e());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a2(String str, n4.i0 i0Var) {
        f0.A0(i0Var, new q4.e(str, null, 2, null));
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(Long l15, long j15, er.l lVar, er.l lVar2, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, int i15, r rVar, int i16) {
        N0(l15, j15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b2(String str, w4 w4Var, boolean z15, boolean z16, boolean z17, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-564400443, i15, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2402)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.e8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.c2((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.a(companion, (er.l) objE), w4Var.r(z15, z16, z17, rVar, 0).getValue().m20unboximpl(), null, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 261112);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final void c1(final f3.m mVar, final p<? super r, ? super Integer, i0> pVar, final long j15, final long j16, final float f15, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2020490761);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.d(j15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.d(j16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.b(f15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(pVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(2020490761, i16, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1749)");
            }
            f3.m mVarU = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null).u(pVar != null ? androidx.compose.foundation.layout.d.b(f3.m.INSTANCE, 0.0f, f15, 1, null) : f3.m.INSTANCE);
            w0 w0VarA = e0.a(d1.i.f39152a.h(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarU);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (pVar != null) {
                rVarH.X(396894187);
                y1.b(j15, ds.e(q.f115154a.t(), rVarH, 6), y2.m.d(1344395458, true, new p() { // from class: f2.m5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.d1(pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, ((i16 >> 6) & 14) | MLKEMEngine.KyberPolyBytes);
                rVarH.R();
            } else {
                rVarH.X(397163267);
                rVarH.R();
            }
            p076m2.d0.c(h4.a().d(Color.m0boximpl(j16)), pVar2, rVarH, c4.f122821i | ((i16 >> 12) & 112));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.n5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.e1(mVar, pVar, j15, j16, f15, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d1(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1344395458, i15, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1764)");
            }
            f3.c cVarD = f3.c.INSTANCE.d();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarI = d1.r.i(cVarD, false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(String str, f3.m mVar, boolean z15, boolean z16, er.a aVar, boolean z17, String str2, w4 w4Var, int i15, r rVar, int i16) {
        Z1(str, mVar, z15, z16, aVar, z17, str2, w4Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e1(f3.m mVar, p pVar, long j15, long j16, float f15, p pVar2, int i15, r rVar, int i16) {
        c1(mVar, pVar, j15, j16, f15, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void e2(final f3.m mVar, final long j15, final er.l<? super Integer, i0> lVar, final pi piVar, final l0 l0Var, final lr.i iVar, final w4 w4Var, final d0 d0Var, final er.a<i0> aVar, final er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        final long j16;
        er.l<? super Integer, i0> lVar2;
        l0 l0Var2;
        lr.i iVar2;
        w4 w4Var2;
        er.a<i0> aVar3;
        er.a<i0> aVar4;
        r rVarH = rVar.h(-724154510);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            j16 = j15;
            i16 |= rVarH.d(j16) ? 32 : 16;
        } else {
            j16 = j15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar2 = lVar;
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        } else {
            lVar2 = lVar;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(piVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            l0Var2 = l0Var;
            i16 |= rVarH.G(l0Var2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            l0Var2 = l0Var;
        }
        if ((196608 & i15) == 0) {
            iVar2 = iVar;
            i16 |= rVarH.G(iVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            iVar2 = iVar;
        }
        if ((1572864 & i15) == 0) {
            w4Var2 = w4Var;
            i16 |= rVarH.W(w4Var2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            w4Var2 = w4Var;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(d0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            aVar3 = aVar;
            i16 |= rVarH.G(aVar3) ? 67108864 : 33554432;
        } else {
            aVar3 = aVar;
        }
        if ((805306368 & i15) == 0) {
            aVar4 = aVar2;
            i16 |= rVarH.G(aVar4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            aVar4 = aVar2;
        }
        if (rVarH.r((i16 & 306783379) != 306783378, i16 & 1)) {
            if (t.k()) {
                t.o(-724154510, i16, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2293)");
            }
            final er.a<i0> aVar5 = aVar3;
            final er.l<? super Integer, i0> lVar3 = lVar2;
            final lr.i iVar3 = iVar2;
            int i17 = i16;
            final l0 l0Var3 = l0Var2;
            final w4 w4Var3 = w4Var2;
            final er.a<i0> aVar6 = aVar4;
            oo.h(ds.e(q.f115154a.C(), rVarH, 6), y2.m.d(1910384865, true, new p() { // from class: f2.i7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.f2(l0Var3, j16, iVar3, mVar, w4Var3, aVar5, aVar6, d0Var, lVar3, piVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            boolean z15 = (29360128 & i17) == 8388608;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new i(d0Var, null);
                rVarH.v(objE);
            }
            Function0.d(d0Var, (p) objE, rVarH, (i17 >> 21) & 14);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.j7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.j2(mVar, j15, lVar, piVar, l0Var, iVar, w4Var, d0Var, aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void f1(final String str, final f3.m mVar, final boolean z15, final er.a<i0> aVar, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str2, final w4 w4Var, r rVar, final int i15) {
        int i16;
        boolean z25;
        boolean z26;
        boolean z27;
        w4 w4Var2;
        r rVarH = rVar.h(-945355136);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            z25 = z16;
            i16 |= rVarH.a(z25) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z25 = z16;
        }
        if ((196608 & i15) == 0) {
            z26 = z17;
            i16 |= rVarH.a(z26) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            z26 = z17;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.a(z18) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            z27 = z19;
            i16 |= rVarH.a(z27) ? 8388608 : 4194304;
        } else {
            z27 = z19;
        }
        if ((100663296 & i15) == 0) {
            i16 |= rVarH.W(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            w4Var2 = w4Var;
            i16 |= rVarH.W(w4Var2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            w4Var2 = w4Var;
        }
        if (rVarH.r((306783379 & i16) != 306783378, i16 & 1)) {
            if (t.k()) {
                t.o(-945355136, i16, -1, "androidx.compose.material3.Day (DatePicker.kt:2225)");
            }
            boolean z28 = (234881024 & i16) == 67108864;
            Object objE = rVarH.E();
            if (z28 || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.v7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.g1(str2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = v.c(mVar, true, (er.l) objE);
            q qVar = q.f115154a;
            y2 y2VarH = ui.h(qVar.f(), rVarH, 6);
            int i17 = i16 >> 6;
            long jM20unboximpl = w4Var2.d(z15, z26, z25, rVarH, (i17 & 14) | ((i16 >> 12) & 112) | (i17 & 896) | ((i16 >> 18) & 7168)).getValue().m20unboximpl();
            final boolean z29 = z27;
            androidx.compose.material3.l.h(z15, aVar, mVarC, z17, y2VarH, jM20unboximpl, 0L, 0.0f, 0.0f, (!z18 || z15) ? null : w0.x.a(qVar.m(), w4Var.getTodayDateBorderColor()), null, y2.m.d(1126347158, true, new p() { // from class: f2.w7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.h1(str, w4Var, z18, z15, z29, z17, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, i17 & 7294, 48, 1472);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.y7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.j1(str, mVar, z15, aVar, z16, z17, z18, z19, str2, w4Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(final l0 l0Var, long j15, final lr.i iVar, f3.m mVar, final w4 w4Var, final er.a aVar, final er.a aVar2, final d0 d0Var, final er.l lVar, final pi piVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1910384865, i15, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2295)");
            }
            final int year = l0Var.i(l0Var.j()).getYear();
            final int year2 = l0Var.h(j15).getYear();
            e1 e1VarG = j1.g(Math.max(0, (year2 - iVar.getFirst()) - 3), 0, rVar, 0, 2);
            g1.b.a aVar3 = new g1.b.a(3);
            f3.m mVarD = w0.i.d(mVar, w4Var.getContainerColor(), null, 2, null);
            d1.i iVar2 = d1.i.f39152a;
            d1.i.f fVarI = iVar2.i();
            d1.i.f fVarR = iVar2.r(f56218g);
            boolean zG = rVar.G(iVar) | rVar.G(l0Var) | rVar.W(aVar) | rVar.W(aVar2) | rVar.c(year2) | rVar.W(d0Var) | rVar.c(year) | rVar.W(lVar) | rVar.W(piVar) | rVar.W(w4Var);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.q7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.g2(iVar, l0Var, aVar, aVar2, year2, d0Var, year, lVar, piVar, w4Var, (t0) obj);
                    }
                };
                rVar.v(objE);
            }
            g1.i.c(aVar3, mVarD, e1VarG, null, false, fVarR, fVarI, null, false, null, (er.l) objE, rVar, 1769472, 0, 920);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g1(String str, n4.i0 i0Var) {
        f0.A0(i0Var, new q4.e(str, null, 2, null));
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g2(final lr.i iVar, final l0 l0Var, final er.a aVar, final er.a aVar2, final int i15, final d0 d0Var, final int i16, final er.l lVar, final pi piVar, final w4 w4Var, t0 t0Var) {
        t0.d(t0Var, pq.v.d0(iVar), null, null, null, y2.m.b(-1895584772, true, new er.r() { // from class: f2.u7
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i8.h2(iVar, l0Var, aVar, aVar2, i15, d0Var, i16, lVar, piVar, w4Var, (g1.v) obj, ((Integer) obj2).intValue(), (r) obj3, ((Integer) obj4).intValue());
            }
        }), 14, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h1(String str, w4 w4Var, boolean z15, boolean z16, boolean z17, boolean z18, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1126347158, i15, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2254)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            q qVar = q.f115154a;
            f3.m mVarP = androidx.compose.foundation.layout.d.p(companion, qVar.g(), qVar.e());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.a8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.i1((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.a(companion, (er.l) objE), w4Var.e(z15, z16, z17, z18, rVar, 0).getValue().m20unboximpl(), null, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 261112);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h2(lr.i iVar, l0 l0Var, er.a aVar, er.a aVar2, int i15, d0 d0Var, int i16, final er.l lVar, pi piVar, w4 w4Var, g1.v vVar, int i17, r rVar, int i18) {
        int i19;
        if ((i18 & 48) == 0) {
            i19 = i18 | (rVar.c(i17) ? 32 : 16);
        } else {
            i19 = i18;
        }
        if (rVar.r((i19 & 145) != 144, i19 & 1)) {
            if (t.k()) {
                t.o(-1895584772, i19, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2313)");
            }
            final int first = i17 + iVar.getFirst();
            String strC = w1.c(first, 0, 0, false, l0Var.getLocale(), 7, null);
            f3.m mVarA = f3.m.INSTANCE;
            q qVar = q.f115154a;
            f3.m mVarP = androidx.compose.foundation.layout.d.p(mVarA, qVar.B(), qVar.A());
            boolean zW = rVar.W(aVar) | rVar.W(aVar2);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new h(aVar, aVar2);
                rVar.v(objE);
            }
            f3.m mVarA2 = y3.f.a(mVarP, (er.l) objE);
            if (first == i15) {
                mVarA = g0.a(mVarA, d0Var);
            }
            f3.m mVarU = mVarA2.u(mVarA);
            boolean z15 = first == i15;
            boolean z16 = first == i16;
            boolean zW2 = rVar.W(lVar) | rVar.c(first);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: f2.z7
                    @Override // er.a
                    public final Object a() {
                        return i8.i2(lVar, first);
                    }
                };
                rVar.v(objE2);
            }
            boolean zA = piVar.a(first);
            a2.Companion companion = a2.INSTANCE;
            Z1(strC, mVarU, z15, z16, (er.a) objE2, zA, String.format(b2.b(a2.a(ih.f56326p), rVar, 0), Arrays.copyOf(new Object[]{strC}, 1)), w4Var, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i1(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i2(er.l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j1(String str, f3.m mVar, boolean z15, er.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, String str2, w4 w4Var, int i15, r rVar, int i16) {
        f1(str, mVar, z15, aVar, z16, z17, z18, z19, str2, w4Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j2(f3.m mVar, long j15, er.l lVar, pi piVar, l0 l0Var, lr.i iVar, w4 w4Var, d0 d0Var, er.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        e2(mVar, j15, lVar, piVar, l0Var, iVar, w4Var, d0Var, aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k1(final f3.m mVar, final int i15, final er.l<? super ob, i0> lVar, final w4 w4Var, r rVar, final int i16) {
        int i17;
        r rVarH = rVar.h(-1461252485);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(lVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.W(w4Var) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (t.k()) {
                t.o(-1461252485, i17, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1424)");
            }
            p076m2.d0.c(h4.a().d(Color.m0boximpl(w4Var.getHeadlineContentColor())), y2.m.d(-1734512197, true, new p() { // from class: f2.s5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.l1(i15, lVar, mVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.t5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.o1(mVar, i15, lVar, w4Var, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    private static final void k2(final er.a<i0> aVar, final boolean z15, f3.m mVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        er.a<i0> aVar2;
        int i17;
        f3.m mVar2;
        boolean z16;
        final f3.m mVar3;
        d5 d5VarM;
        f3.m mVar4;
        int i18;
        r rVarH = rVar.h(-709923073);
        if ((i15 & 6) == 0) {
            aVar2 = aVar;
            i17 = (rVarH.G(aVar2) ? 4 : 2) | i15;
        } else {
            aVar2 = aVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i17 |= i18;
            }
            if ((i17 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i19 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(-709923073, i17, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2507)");
                }
                mVar2 = mVar4;
                C6460u1.k(aVar2, mVar2, false, l1.h.i(), n1.f56965a.o(0L, ((Color) rVarH.N(h4.a())).m20unboximpl(), 0L, 0L, rVarH, 24576, 13), null, null, null, null, y2.m.d(1899489890, true, new er.q() { // from class: f2.e7
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i8.l2(pVar, z15, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, (i17 & 14) | 807075840 | ((i17 >> 3) & 112), 388);
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
            }
            mVar3 = mVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.f7
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.m2(aVar, z15, mVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(pVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i17 |= i18;
        }
        if ((i17 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            if (i19 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (t.k()) {
                t.o(-709923073, i17, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2507)");
            }
            mVar2 = mVar4;
            C6460u1.k(aVar2, mVar2, false, l1.h.i(), n1.f56965a.o(0L, ((Color) rVarH.N(h4.a())).m20unboximpl(), 0L, 0L, rVarH, 24576, 13), null, null, null, null, y2.m.d(1899489890, true, new er.q() { // from class: f2.e7
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i8.l2(pVar, z15, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | 807075840 | ((i17 >> 3) & 112), 388);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        mVar3 = mVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.f7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.m2(aVar, z15, mVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l1(int i15, final er.l lVar, f3.m mVar, r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1734512197, i16, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1426)");
            }
            if (ob.f(i15, ob.INSTANCE.b())) {
                rVar.X(-101251783);
                t3.d dVarD = h2.j1.f79876a.d();
                a2.Companion companion = a2.INSTANCE;
                String strB = b2.b(a2.a(ih.f56330t), rVar, 0);
                boolean zW = rVar.W(lVar);
                Object objE = rVar.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: f2.w5
                        @Override // er.a
                        public final Object a() {
                            return i8.m1(lVar);
                        }
                    };
                    rVar.v(objE);
                }
                x1((er.a) objE, dVarD, strB, mVar, false, rVar, 0, 16);
                rVar.R();
            } else {
                rVar.X(-100953904);
                t3.d dVarC = h2.j1.f79876a.c();
                a2.Companion companion2 = a2.INSTANCE;
                String strB2 = b2.b(a2.a(ih.f56328r), rVar, 0);
                boolean zW2 = rVar.W(lVar);
                Object objE2 = rVar.E();
                if (zW2 || objE2 == r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: f2.x5
                        @Override // er.a
                        public final Object a() {
                            return i8.n1(lVar);
                        }
                    };
                    rVar.v(objE2);
                }
                x1((er.a) objE2, dVarC, strB2, mVar, false, rVar, 0, 16);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l2(p pVar, boolean z15, p3 p3Var, r rVar, int i15) {
        String strB;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1899489890, i15, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2516)");
            }
            pVar.B(rVar, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.t(companion, n1.f56965a.g()), rVar, 6);
            t3.d dVarA = h2.j1.f79876a.a();
            if (z15) {
                rVar.X(1509384391);
                a2.Companion companion2 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56329s), rVar, 0);
                rVar.R();
            } else {
                rVar.X(1509478662);
                a2.Companion companion3 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56333w), rVar, 0);
                rVar.R();
            }
            ad.e(dVarA, strB, k3.q.a(companion, z15 ? 180.0f : 0.0f), 0L, rVar, 0, 8);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m1(er.l lVar) {
        lVar.b(ob.c(ob.INSTANCE.a()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m2(er.a aVar, boolean z15, f3.m mVar, p pVar, int i15, int i16, r rVar, int i17) {
        k2(aVar, z15, mVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n1(er.l lVar) {
        lVar.b(ob.c(ob.INSTANCE.b()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o1(f3.m mVar, int i15, er.l lVar, w4 w4Var, int i16, r rVar, int i17) {
        k1(mVar, i15, lVar, w4Var, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    private static final void p1(final y0 y0Var, final Long l15, final er.l<? super Long, i0> lVar, final er.l<? super Long, i0> lVar2, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, final er.a<i0> aVar, final o oVar, r rVar, final int i15, final int i16) {
        int i17;
        er.l<? super Long, i0> lVar3;
        pi piVar2;
        w4 w4Var2;
        int i18;
        final y0 y0Var2;
        Object fVar;
        r rVarH = rVar.h(-1038629066);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(y0Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(l15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar3 = lVar;
            i17 |= rVarH.G(lVar3) ? 256 : 128;
        } else {
            lVar3 = lVar;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(lVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(l0Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.G(iVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i17 |= (2097152 & i15) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            piVar2 = piVar;
            i17 |= rVarH.W(piVar2) ? 8388608 : 4194304;
        } else {
            piVar2 = piVar;
        }
        if ((100663296 & i15) == 0) {
            w4Var2 = w4Var;
            i17 |= rVarH.W(w4Var2) ? 67108864 : 33554432;
        } else {
            w4Var2 = w4Var;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.G(aVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.G(oVar) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i18 & 3) == 2) ? false : true, i17 & 1)) {
            if (t.k()) {
                t.o(-1038629066, i17, i18, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1785)");
            }
            final CalendarDate calendarDateJ = l0Var.j();
            boolean zW = rVarH.W(iVar);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = l0Var.g(iVar.getFirst(), 1);
                rVarH.v(objE);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objE;
            final w4 w4Var3 = w4Var2;
            final er.l<? super Long, i0> lVar4 = lVar3;
            final pi piVar3 = piVar2;
            int i19 = i17;
            oo.h(ds.e(q.f115154a.h(), rVarH, 6), y2.m.d(-1911156825, true, new p() { // from class: f2.v6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.q1(y0Var, iVar, l0Var, calendarMonth, lVar4, calendarDateJ, l15, h5Var, piVar3, w4Var3, oVar, aVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            int i25 = i19 & 14;
            boolean zG = (i25 == 4) | ((i19 & 7168) == 2048) | rVarH.G(l0Var) | rVarH.G(iVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                y0Var2 = y0Var;
                fVar = new f(y0Var2, lVar2, l0Var, iVar, null);
                rVarH.v(fVar);
            } else {
                fVar = objE2;
                y0Var2 = y0Var;
            }
            Function0.d(y0Var2, (p) fVar, rVarH, i25);
            if (t.k()) {
                t.n();
            }
        } else {
            y0Var2 = y0Var;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.w6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.w1(y0Var2, l15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, aVar, oVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q1(final y0 y0Var, final lr.i iVar, final l0 l0Var, final CalendarMonth calendarMonth, final er.l lVar, final CalendarDate calendarDate, final Long l15, final h5 h5Var, final pi piVar, final w4 w4Var, final o oVar, final er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1911156825, i15, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1795)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: f2.g7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.r1((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = v.d(companion, false, (er.l) objE, 1, null);
            p143z0.e1 e1VarR = a5.f55133a.r(y0Var, null, rVar, MLKEMEngine.KyberPolyBytes, 2);
            boolean zG = rVar.G(iVar) | rVar.G(l0Var) | rVar.W(calendarMonth) | rVar.W(lVar) | rVar.W(calendarDate) | rVar.W(l15) | rVar.G(h5Var) | rVar.W(piVar) | rVar.W(w4Var) | rVar.W(y0Var) | rVar.G(oVar) | rVar.W(aVar);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion2.a()) {
                er.l lVar2 = new er.l() { // from class: f2.h7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.u1(iVar, l0Var, calendarMonth, lVar, calendarDate, l15, h5Var, piVar, w4Var, y0Var, oVar, aVar, (q0) obj);
                    }
                };
                rVar.v(lVar2);
                objE2 = lVar2;
            }
            f1.d.e(mVarD, y0Var, null, false, null, null, e1VarR, false, null, (er.l) objE2, rVar, 0, 444);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r1(n4.i0 i0Var) {
        f0.j0(i0Var, new ScrollAxisRange(new er.a() { // from class: f2.o7
            @Override // er.a
            public final Object a() {
                return Float.valueOf(i8.s1());
            }
        }, new er.a() { // from class: f2.p7
            @Override // er.a
            public final Object a() {
                return Float.valueOf(i8.t1());
            }
        }, false, 4, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s1() {
        return 0.0f;
    }

    private static final String s2(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, r rVar, int i15) {
        if (t.k()) {
            t.o(502032503, i15, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:2194)");
        }
        StringBuilder sb5 = new StringBuilder();
        if (z15) {
            rVar.X(974430743);
            if (z17) {
                rVar.X(1416908759);
                a2.Companion companion = a2.INSTANCE;
                sb5.append(b2.b(a2.a(ih.G), rVar, 0));
                rVar.R();
            } else if (z18) {
                rVar.X(1416912757);
                a2.Companion companion2 = a2.INSTANCE;
                sb5.append(b2.b(a2.a(ih.D), rVar, 0));
                rVar.R();
            } else if (z19) {
                rVar.X(1416916692);
                a2.Companion companion3 = a2.INSTANCE;
                sb5.append(b2.b(a2.a(ih.C), rVar, 0));
                rVar.R();
            } else {
                rVar.X(974813035);
                rVar.R();
            }
            rVar.R();
        } else {
            rVar.X(974818987);
            rVar.R();
        }
        if (z16) {
            rVar.X(974842237);
            if (sb5.length() > 0) {
                sb5.append(", ");
            }
            a2.Companion companion4 = a2.INSTANCE;
            sb5.append(b2.b(a2.a(ih.f56335y), rVar, 0));
            rVar.R();
        } else {
            rVar.X(975009451);
            rVar.R();
        }
        String string = sb5.length() == 0 ? null : sb5.toString();
        if (t.k()) {
            t.n();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t1() {
        return 0.0f;
    }

    private static final f3.m t2(f3.m mVar, boolean z15, boolean z16, boolean z17, y0 y0Var, p0 p0Var, o oVar, er.a<i0> aVar) {
        if (oVar == null) {
            return mVar;
        }
        if (z16) {
            return y3.f.a(mVar, new j(aVar, y0Var, z15, oVar, p0Var));
        }
        return z17 ? y3.f.a(mVar, new k(oVar, z15, y0Var, p0Var)) : y3.f.a(mVar, new l(z15, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u1(lr.i iVar, final l0 l0Var, final CalendarMonth calendarMonth, final er.l lVar, final CalendarDate calendarDate, final Long l15, final h5 h5Var, final pi piVar, final w4 w4Var, final y0 y0Var, final o oVar, final er.a aVar, q0 q0Var) {
        q0.e(q0Var, G2(iVar), null, null, y2.m.b(-600599685, true, new er.r() { // from class: f2.n7
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i8.v1(l0Var, calendarMonth, lVar, calendarDate, l15, h5Var, piVar, w4Var, y0Var, oVar, aVar, (e) obj, ((Integer) obj2).intValue(), (r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return i0.f148189a;
    }

    public static final float u2() {
        return f56214c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v1(l0 l0Var, CalendarMonth calendarMonth, er.l lVar, CalendarDate calendarDate, Long l15, h5 h5Var, pi piVar, w4 w4Var, y0 y0Var, o oVar, er.a aVar, f1.e eVar, int i15, r rVar, int i16) {
        int i17;
        if ((i16 & 6) == 0) {
            i17 = i16 | (rVar.W(eVar) ? 4 : 2);
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(-600599685, i17, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1807)");
            }
            CalendarMonth calendarMonthM = l0Var.m(calendarMonth, i15);
            f3.m mVarC = f1.e.c(eVar, f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            D1(calendarMonthM, lVar, calendarDate.getUtcTimeMillis(), l15, null, null, h5Var, piVar, w4Var, l0Var.getLocale(), y0Var, oVar, aVar, rVar, 221184, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final d3 v2() {
        return f56215d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w1(y0 y0Var, Long l15, er.l lVar, er.l lVar2, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, er.a aVar, o oVar, int i15, int i16, r rVar, int i17) {
        p1(y0Var, l15, lVar, lVar2, l0Var, iVar, h5Var, piVar, w4Var, aVar, oVar, rVar, g4.a(i15 | 1), g4.a(i16));
        return i0.f148189a;
    }

    private static final int w2(CalendarMonth calendarMonth, pi piVar) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
        if (piVar.a(calendarMonth.getYear())) {
            int i15 = 0;
            while (!piVar.b(calendarMonth.getStartUtcTimeMillis() + (((long) i15) * 86400000)) && daysFromStartOfWeekToFirstOfMonth <= daysFromStartOfWeekToFirstOfMonth2) {
                i15++;
                daysFromStartOfWeekToFirstOfMonth++;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    private static final void x1(final er.a<i0> aVar, final t3.d dVar, final String str, f3.m mVar, boolean z15, r rVar, final int i15, final int i16) {
        final er.a<i0> aVar2;
        int i17;
        final t3.d dVar2;
        f3.m mVar2;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        final f3.m mVar3;
        final boolean z18;
        d5 d5VarM;
        f3.m mVar4;
        boolean z19;
        r rVarH = rVar.h(-368059805);
        if ((i15 & 6) == 0) {
            aVar2 = aVar;
            i17 = (rVarH.G(aVar2) ? 4 : 2) | i15;
        } else {
            aVar2 = aVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            dVar2 = dVar;
            i17 |= rVarH.W(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(str) ? 256 : 128;
        }
        int i25 = i16 & 8;
        if (i25 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                if ((i17 & 9363) != 9362) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i25 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (t.k()) {
                        t.o(-368059805, i17, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2539)");
                    }
                    final f3.m mVar5 = mVar4;
                    final boolean z25 = z19;
                    hr.t(rq.f57659a.e(pq.INSTANCE.a(), 0.0f, rVarH, 390, 2), y2.m.d(-456272562, true, new er.q() { // from class: f2.m6
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return i8.y1(str, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), hr.M(false, false, null, rVarH, 0, 7), null, null, false, false, false, y2.m.d(-1124908186, true, new p() { // from class: f2.n6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.A1(aVar2, mVar5, z25, dVar2, str, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 100663344, 248);
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    z18 = z25;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.o6
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i8.C1(aVar, dVar, str, mVar3, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            z16 = z15;
            if ((i17 & 9363) != 9362) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-368059805, i17, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2539)");
                }
                final f3.m mVar6 = mVar4;
                final boolean z26 = z19;
                hr.t(rq.f57659a.e(pq.INSTANCE.a(), 0.0f, rVarH, 390, 2), y2.m.d(-456272562, true, new er.q() { // from class: f2.m6
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i8.y1(str, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), hr.M(false, false, null, rVarH, 0, 7), null, null, false, false, false, y2.m.d(-1124908186, true, new p() { // from class: f2.n6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.A1(aVar2, mVar6, z26, dVar2, str, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 100663344, 248);
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar6;
                z18 = z26;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.o6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.C1(aVar, dVar, str, mVar3, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((i17 & 9363) != 9362) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-368059805, i17, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2539)");
                }
                final f3.m mVar7 = mVar4;
                final boolean z27 = z19;
                hr.t(rq.f57659a.e(pq.INSTANCE.a(), 0.0f, rVarH, 390, 2), y2.m.d(-456272562, true, new er.q() { // from class: f2.m6
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i8.y1(str, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), hr.M(false, false, null, rVarH, 0, 7), null, null, false, false, false, y2.m.d(-1124908186, true, new p() { // from class: f2.n6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.A1(aVar2, mVar7, z27, dVar2, str, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 100663344, 248);
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar7;
                z18 = z27;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.o6
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i8.C1(aVar, dVar, str, mVar3, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        z16 = z15;
        if ((i17 & 9363) != 9362) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i25 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-368059805, i17, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2539)");
            }
            final f3.m mVar8 = mVar4;
            final boolean z28 = z19;
            hr.t(rq.f57659a.e(pq.INSTANCE.a(), 0.0f, rVarH, 390, 2), y2.m.d(-456272562, true, new er.q() { // from class: f2.m6
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i8.y1(str, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), hr.M(false, false, null, rVarH, 0, 7), null, null, false, false, false, y2.m.d(-1124908186, true, new p() { // from class: f2.n6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.A1(aVar2, mVar8, z28, dVar2, str, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 100663344, 248);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar8;
            z18 = z28;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.o6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.C1(aVar, dVar, str, mVar3, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int x2(CalendarMonth calendarMonth, pi piVar) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
        if (piVar.a(calendarMonth.getYear())) {
            int i15 = 0;
            while (!piVar.b(calendarMonth.getEndUtcTimeMillis() - (((long) i15) * 86400000)) && daysFromStartOfWeekToFirstOfMonth2 >= daysFromStartOfWeekToFirstOfMonth) {
                i15++;
                daysFromStartOfWeekToFirstOfMonth2--;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y1(final String str, jr jrVar, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVar.W(jrVar) : rVar.G(jrVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-456272562, i16, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2543)");
            }
            hr.p(jrVar, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, y2.m.d(1905952188, true, new p() { // from class: f2.c7
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.z1(str, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, (i16 & 14) | 805306368, GF2Field.MASK);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final float y2() {
        return f56212a;
    }

    public static final void z0(final f3.m mVar, final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, final p<? super r, ? super Integer, i0> pVar3, final w4 w4Var, final TextStyle textStyle, final float f15, final p<? super r, ? super Integer, i0> pVar4, r rVar, final int i15) {
        int i16;
        p<? super r, ? super Integer, i0> pVar5;
        p<? super r, ? super Integer, i0> pVar6;
        p<? super r, ? super Integer, i0> pVar7;
        w4 w4Var2;
        TextStyle textStyle2;
        r rVar2;
        r rVarH = rVar.h(1539132883);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            pVar5 = pVar;
            i16 |= rVarH.G(pVar5) ? 32 : 16;
        } else {
            pVar5 = pVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            pVar6 = pVar2;
            i16 |= rVarH.G(pVar6) ? 256 : 128;
        } else {
            pVar6 = pVar2;
        }
        if ((i15 & 3072) == 0) {
            pVar7 = pVar3;
            i16 |= rVarH.G(pVar7) ? 2048 : 1024;
        } else {
            pVar7 = pVar3;
        }
        if ((i15 & 24576) == 0) {
            w4Var2 = w4Var;
            i16 |= rVarH.W(w4Var2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            w4Var2 = w4Var;
        }
        if ((196608 & i15) == 0) {
            textStyle2 = textStyle;
            i16 |= rVarH.W(textStyle2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.b(f15) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(pVar4) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (t.k()) {
                t.o(1539132883, i16, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1369)");
            }
            int i17 = i16;
            f3.m mVarX = androidx.compose.foundation.layout.d.x(mVar, q.f115154a.d(), 0.0f, 0.0f, 0.0f, 14, null);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.x7
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i8.A0((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = w0.i.d(v.d(mVarX, false, (er.l) objE, 1, null), w4Var2.getContainerColor(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            final p<? super r, ? super Integer, i0> pVar8 = pVar5;
            final p<? super r, ? super Integer, i0> pVar9 = pVar6;
            final p<? super r, ? super Integer, i0> pVar10 = pVar7;
            final w4 w4Var3 = w4Var2;
            final TextStyle textStyle3 = textStyle2;
            c1(f3.m.INSTANCE, pVar, w4Var2.getTitleContentColor(), w4Var2.getHeadlineContentColor(), f15, y2.m.d(-1658370654, true, new p() { // from class: f2.f8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.B0(pVar9, pVar10, pVar8, w4Var3, textStyle3, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 112) | 196614 | (57344 & (i17 >> 6)));
            rVar2 = rVarH;
            pVar4.B(rVar2, Integer.valueOf((i17 >> 21) & 14));
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.g8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i8.D0(mVar, pVar, pVar2, pVar3, w4Var, textStyle, f15, pVar4, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z1(String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1905952188, i15, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2543)");
            }
            oo.j(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262142);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(int i15, y0 y0Var, o oVar, int i16, p0 p0Var) {
        ju.k.d(p0Var, null, null, new m(y0Var, i15, oVar, i16, null), 3, null);
    }
}
