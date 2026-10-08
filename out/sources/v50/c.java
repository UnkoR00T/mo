package v50;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p079n1.l3;
import v4.a0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u00074(,3/$.Bá\u0001\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b.\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010:R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b(\u0010?R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010@\u001a\u0004\b3\u0010AR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\b;\u0010:R\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010>\u001a\u0004\bC\u0010?R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bG\u0010?R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\b4\u0010IR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\bB\u0010+R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\b$\u0010KR\u001c\u0010!\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\b,\u0010MR\u0014\u0010O\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010A\u0082\u0001\u0007PQRSTUV¨\u0006W"}, d2 = {"Lv50/c;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "hint", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "", "indexTag", "labelContentDescription", "Lj70/a;", "accessibilityReadMode", "fieldIndex", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLjava/lang/Integer;Lmx/a;Lj70/a;Ljava/lang/Object;)V", "a", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "b", "Lmx/a;", "k", "()Lmx/a;", "c", "t", "d", "e", "Lhz/b;", "s", "()Lhz/b;", "f", "g", "Lj30/a;", "h", "()Lj30/a;", "Ler/l;", "n", "()Ler/l;", "i", "m", "j", "Z", "()Z", "I", "()I", "l", "p", "Lb5/j;", "r", "()Lb5/j;", "o", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lj70/a;", "()Lj70/a;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lv4/a0;", "keyboardType", "Lv50/c$a;", "Lv50/c$b;", "Lv50/c$c;", "Lv50/c$d;", "Lv50/c$e;", "Lv50/c$f;", "Lv50/c$g;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f203957t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Label hint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hz.b validationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Label helperText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ButtonTextData infoButtonData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final er.l<String, i0> onValueChanged;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final er.l<Boolean, i0> onFocusChanged;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final er.l<l3.o, l3> keyboardAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b5.j textAlign;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean removableIconVisible;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Integer indexTag;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Label labelContentDescription;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final j70.a accessibilityReadMode;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Object fieldIndex;

    /* JADX INFO: renamed from: v50.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010*R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bQ\u0010FR\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bX\u0010LR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u00102\u001a\u0004\b^\u00104R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010N\u001a\u0004\b`\u0010*R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b9\u0010g¨\u0006h"}, d2 = {"Lv50/c$a;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "hint", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "", "indexTag", "labelContentDescription", "Lv4/a0;", "keyboardType", "", "fieldIndex", "Lw50/a;", "maskType", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLjava/lang/Integer;Lmx/a;ILjava/lang/Object;Lw50/a;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "t", "x", "e", "y", "Lhz/b;", "s", "()Lhz/b;", "z", "d", "A", "Lj30/a;", "h", "()Lj30/a;", "B", "Ler/l;", "n", "()Ler/l;", "C", "m", ip.a.f96138c, "Z", "b", "()Z", "E", "I", "f", "F", "i", "G", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lb5/j;", "r", "()Lb5/j;", "o", "J", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "K", "l", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "j", "M", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "N", "Lw50/a;", "()Lw50/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Masked extends c {
        public static final int O = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final Integer indexTag;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final int keyboardType;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        private final w50.a maskType;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label hint;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        public /* synthetic */ Masked(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, int i16, Object obj, w50.a aVar, fr.k kVar) {
            this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, i16, obj, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 w(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 x(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public Label getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Masked)) {
                return false;
            }
            Masked masked = (Masked) other;
            return t.c(this.testTag, masked.testTag) && t.c(this.label, masked.label) && t.c(this.value, masked.value) && t.c(this.hint, masked.hint) && t.c(this.validationState, masked.validationState) && t.c(this.helperText, masked.helperText) && t.c(this.infoButtonData, masked.infoButtonData) && t.c(this.onValueChanged, masked.onValueChanged) && t.c(this.onFocusChanged, masked.onFocusChanged) && this.enabled == masked.enabled && v4.t.m(this.imeAction, masked.imeAction) && t.c(this.keyboardAction, masked.keyboardAction) && this.singleLine == masked.singleLine && t.c(this.textAlign, masked.textAlign) && this.removableIconVisible == masked.removableIconVisible && t.c(this.indexTag, masked.indexTag) && t.c(this.labelContentDescription, masked.labelContentDescription) && a0.n(this.keyboardType, masked.keyboardType) && t.c(this.fieldIndex, masked.fieldIndex) && this.maskType == masked.maskType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public Integer getIndexTag() {
            return this.indexTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.value.hashCode()) * 31;
            Label label2 = this.hint;
            int iHashCode3 = (((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.validationState.hashCode()) * 31;
            Label label3 = this.helperText;
            int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode5 = (((((((((((((iHashCode4 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((iHashCode5 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31;
            Integer num = this.indexTag;
            int iHashCode6 = (iL + (num == null ? 0 : num.hashCode())) * 31;
            Label label4 = this.labelContentDescription;
            int iHashCode7 = (((iHashCode6 + (label4 == null ? 0 : label4.hashCode())) * 31) + a0.o(this.keyboardType)) * 31;
            Object obj = this.fieldIndex;
            return ((iHashCode7 + (obj != null ? obj.hashCode() : 0)) * 31) + this.maskType.hashCode();
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Masked(testTag=" + this.testTag + ", label=" + this.label + ", value=" + this.value + ", hint=" + this.hint + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", indexTag=" + this.indexTag + ", labelContentDescription=" + this.labelContentDescription + ", keyboardType=" + ((Object) a0.p(this.keyboardType)) + ", fieldIndex=" + this.fieldIndex + ", maskType=" + this.maskType + ')';
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final w50.a getMaskType() {
            return this.maskType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Masked(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, int i16, Object obj, w50.a aVar) {
            super(str, label, label2, null, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, null, obj, PKIFailureInfo.unsupportedVersion, null);
            this.testTag = str;
            this.label = label;
            this.value = label2;
            this.hint = label3;
            this.validationState = bVar;
            this.helperText = label4;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.indexTag = num;
            this.labelContentDescription = label5;
            this.keyboardType = i16;
            this.fieldIndex = obj;
            this.maskType = aVar;
        }

        public /* synthetic */ Masked(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, int i16, Object obj, w50.a aVar, int i17, fr.k kVar) {
            this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : label, label2, (i17 & 8) != 0 ? null : label3, (i17 & 16) != 0 ? hz.b.C2039b.f86846c : bVar, (i17 & 32) != 0 ? null : label4, (i17 & 64) != 0 ? null : buttonTextData, lVar, (i17 & 256) != 0 ? new er.l() { // from class: v50.a
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Masked.w(((Boolean) obj2).booleanValue());
                }
            } : lVar2, (i17 & 512) != 0 ? true : z15, (i17 & 1024) != 0 ? v4.t.INSTANCE.b() : i15, (i17 & 2048) != 0 ? new er.l() { // from class: v50.b
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Masked.x((l3.o) obj2);
                }
            } : lVar3, (i17 & PKIFailureInfo.certConfirmed) != 0 ? true : z16, (i17 & PKIFailureInfo.certRevoked) != 0 ? null : jVar, (i17 & 16384) != 0 ? true : z17, (32768 & i17) != 0 ? null : num, (65536 & i17) != 0 ? null : label5, (131072 & i17) != 0 ? a0.INSTANCE.h() : i16, (i17 & PKIFailureInfo.transactionIdInUse) != 0 ? null : obj, aVar, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010)R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010ER\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010KR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bW\u0010KR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u00101\u001a\u0004\b]\u00103R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bf\u0010I\u001a\u0004\b#\u0010KR\u001a\u0010j\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010M\u001a\u0004\bi\u0010)¨\u0006k"}, d2 = {"Lv50/c$b;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "hint", "value", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "", "indexTag", "labelContentDescription", "Lj70/a;", "accessibilityReadMode", "", "fieldIndex", "isPhoneNumberPrefix", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLjava/lang/Integer;Lmx/a;Lj70/a;Ljava/lang/Object;ZLfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "e", "x", "t", "y", "Lhz/b;", "s", "()Lhz/b;", "z", "d", "A", "Lj30/a;", "h", "()Lj30/a;", "B", "Ler/l;", "n", "()Ler/l;", "C", "m", ip.a.f96138c, "Z", "b", "()Z", "E", "I", "f", "F", "i", "G", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lb5/j;", "r", "()Lb5/j;", "o", "J", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "K", "l", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lj70/a;", "a", "()Lj70/a;", "M", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "N", "Lv4/a0;", "O", "j", "keyboardType", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Number extends c {
        public static final int P = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final Integer indexTag;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        private final boolean isPhoneNumberPrefix;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        private final int keyboardType;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label hint;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        public /* synthetic */ Number(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj, boolean z18, fr.k kVar) {
            this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, aVar, obj, z18);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 w(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 x(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        @Override // v50.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public Label getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Number)) {
                return false;
            }
            Number number = (Number) other;
            return t.c(this.testTag, number.testTag) && t.c(this.label, number.label) && t.c(this.hint, number.hint) && t.c(this.value, number.value) && t.c(this.validationState, number.validationState) && t.c(this.helperText, number.helperText) && t.c(this.infoButtonData, number.infoButtonData) && t.c(this.onValueChanged, number.onValueChanged) && t.c(this.onFocusChanged, number.onFocusChanged) && this.enabled == number.enabled && v4.t.m(this.imeAction, number.imeAction) && t.c(this.keyboardAction, number.keyboardAction) && this.singleLine == number.singleLine && t.c(this.textAlign, number.textAlign) && this.removableIconVisible == number.removableIconVisible && t.c(this.indexTag, number.indexTag) && t.c(this.labelContentDescription, number.labelContentDescription) && this.accessibilityReadMode == number.accessibilityReadMode && t.c(this.fieldIndex, number.fieldIndex) && this.isPhoneNumberPrefix == number.isPhoneNumberPrefix;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public Integer getIndexTag() {
            return this.indexTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.hint;
            int iHashCode3 = (((((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31;
            Label label3 = this.helperText;
            int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode5 = (((((((((((((iHashCode4 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((iHashCode5 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31;
            Integer num = this.indexTag;
            int iHashCode6 = (iL + (num == null ? 0 : num.hashCode())) * 31;
            Label label4 = this.labelContentDescription;
            int iHashCode7 = (((iHashCode6 + (label4 == null ? 0 : label4.hashCode())) * 31) + this.accessibilityReadMode.hashCode()) * 31;
            Object obj = this.fieldIndex;
            return ((iHashCode7 + (obj != null ? obj.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPhoneNumberPrefix);
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Number(testTag=" + this.testTag + ", label=" + this.label + ", hint=" + this.hint + ", value=" + this.value + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", indexTag=" + this.indexTag + ", labelContentDescription=" + this.labelContentDescription + ", accessibilityReadMode=" + this.accessibilityReadMode + ", fieldIndex=" + this.fieldIndex + ", isPhoneNumberPrefix=" + this.isPhoneNumberPrefix + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Number(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj, boolean z18) {
            int iD;
            super(str, label, label3, label2, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, aVar, obj, null);
            this.testTag = str;
            this.label = label;
            this.hint = label2;
            this.value = label3;
            this.validationState = bVar;
            this.helperText = label4;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.indexTag = num;
            this.labelContentDescription = label5;
            this.accessibilityReadMode = aVar;
            this.fieldIndex = obj;
            this.isPhoneNumberPrefix = z18;
            if (z18) {
                iD = a0.INSTANCE.g();
            } else {
                if (z18) {
                    throw new oq.p();
                }
                iD = a0.INSTANCE.d();
            }
            this.keyboardType = iD;
        }

        public /* synthetic */ Number(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj, boolean z18, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? null : label2, label3, (i16 & 16) != 0 ? hz.b.C2039b.f86846c : bVar, (i16 & 32) != 0 ? null : label4, (i16 & 64) != 0 ? null : buttonTextData, lVar, (i16 & 256) != 0 ? new er.l() { // from class: v50.d
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Number.w(((Boolean) obj2).booleanValue());
                }
            } : lVar2, (i16 & 512) != 0 ? true : z15, (i16 & 1024) != 0 ? v4.t.INSTANCE.b() : i15, (i16 & 2048) != 0 ? new er.l() { // from class: v50.e
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Number.x((l3.o) obj2);
                }
            } : lVar3, (i16 & PKIFailureInfo.certConfirmed) != 0 ? true : z16, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : jVar, (i16 & 16384) != 0 ? true : z17, (32768 & i16) != 0 ? null : num, (65536 & i16) != 0 ? null : label5, (131072 & i16) != 0 ? j70.a.NORMAL : aVar, (262144 & i16) != 0 ? null : obj, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z18, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001:\u0001eB\u008b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010*R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bQ\u0010FR\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bX\u0010LR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010N\u001a\u0004\bZ\u0010*R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00102\u001a\u0004\b\\\u00104R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b?\u0010cR#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bd\u0010D\u001a\u0004\bC\u0010F¨\u0006f"}, d2 = {"Lv50/c$c;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "hint", "value", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "Lv4/a0;", "keyboardType", "labelContentDescription", "", "fieldIndex", "Lv50/c$c$a;", "iconContentDescription", "onPasswordVisibilityChanged", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZILmx/a;Ljava/lang/Object;Lv50/c$c$a;Ler/l;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "e", "x", "t", "y", "Lhz/b;", "s", "()Lhz/b;", "z", "d", "A", "Lj30/a;", "h", "()Lj30/a;", "B", "Ler/l;", "n", "()Ler/l;", "C", "m", ip.a.f96138c, "Z", "b", "()Z", "E", "I", "f", "F", "i", "G", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lb5/j;", "r", "()Lb5/j;", "o", "J", "j", "K", "l", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "M", "Lv50/c$c$a;", "()Lv50/c$c$a;", "N", "a", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Password extends c {
        public static final int O = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final int keyboardType;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        private final IconContentDescription iconContentDescription;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPasswordVisibilityChanged;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label hint;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        public /* synthetic */ Password(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, int i16, Label label5, Object obj, IconContentDescription iconContentDescription, er.l lVar4, fr.k kVar) {
            this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, i16, label5, obj, iconContentDescription, lVar4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 x(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 y(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 z(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final IconContentDescription getIconContentDescription() {
            return this.iconContentDescription;
        }

        public final er.l<Boolean, i0> B() {
            return this.onPasswordVisibilityChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public Label getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Password)) {
                return false;
            }
            Password password = (Password) other;
            return t.c(this.testTag, password.testTag) && t.c(this.label, password.label) && t.c(this.hint, password.hint) && t.c(this.value, password.value) && t.c(this.validationState, password.validationState) && t.c(this.helperText, password.helperText) && t.c(this.infoButtonData, password.infoButtonData) && t.c(this.onValueChanged, password.onValueChanged) && t.c(this.onFocusChanged, password.onFocusChanged) && this.enabled == password.enabled && v4.t.m(this.imeAction, password.imeAction) && t.c(this.keyboardAction, password.keyboardAction) && this.singleLine == password.singleLine && t.c(this.textAlign, password.textAlign) && this.removableIconVisible == password.removableIconVisible && a0.n(this.keyboardType, password.keyboardType) && t.c(this.labelContentDescription, password.labelContentDescription) && t.c(this.fieldIndex, password.fieldIndex) && t.c(this.iconContentDescription, password.iconContentDescription) && t.c(this.onPasswordVisibilityChanged, password.onPasswordVisibilityChanged);
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.hint;
            int iHashCode3 = (((((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31;
            Label label3 = this.helperText;
            int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode5 = (((((((((((((iHashCode4 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((((iHashCode5 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31) + a0.o(this.keyboardType)) * 31;
            Label label4 = this.labelContentDescription;
            int iHashCode6 = (iL + (label4 == null ? 0 : label4.hashCode())) * 31;
            Object obj = this.fieldIndex;
            return ((((iHashCode6 + (obj != null ? obj.hashCode() : 0)) * 31) + this.iconContentDescription.hashCode()) * 31) + this.onPasswordVisibilityChanged.hashCode();
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Password(testTag=" + this.testTag + ", label=" + this.label + ", hint=" + this.hint + ", value=" + this.value + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", keyboardType=" + ((Object) a0.p(this.keyboardType)) + ", labelContentDescription=" + this.labelContentDescription + ", fieldIndex=" + this.fieldIndex + ", iconContentDescription=" + this.iconContentDescription + ", onPasswordVisibilityChanged=" + this.onPasswordVisibilityChanged + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Password(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, int i16, Label label5, Object obj, IconContentDescription iconContentDescription, er.l<? super Boolean, i0> lVar4) {
            super(str, label, label3, label2, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, null, label5, null, obj, 163840, null);
            this.testTag = str;
            this.label = label;
            this.hint = label2;
            this.value = label3;
            this.validationState = bVar;
            this.helperText = label4;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.keyboardType = i16;
            this.labelContentDescription = label5;
            this.fieldIndex = obj;
            this.iconContentDescription = iconContentDescription;
            this.onPasswordVisibilityChanged = lVar4;
        }

        /* JADX INFO: renamed from: v50.c$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv50/c$c$a;", "", "Lmx/a;", "whenPasswordVisible", "whenPasswordHidden", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IconContentDescription {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label whenPasswordVisible;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label whenPasswordHidden;

            public IconContentDescription(Label label, Label label2) {
                this.whenPasswordVisible = label;
                this.whenPasswordHidden = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getWhenPasswordHidden() {
                return this.whenPasswordHidden;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getWhenPasswordVisible() {
                return this.whenPasswordVisible;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconContentDescription)) {
                    return false;
                }
                IconContentDescription iconContentDescription = (IconContentDescription) other;
                return t.c(this.whenPasswordVisible, iconContentDescription.whenPasswordVisible) && t.c(this.whenPasswordHidden, iconContentDescription.whenPasswordHidden);
            }

            public int hashCode() {
                return (this.whenPasswordVisible.hashCode() * 31) + this.whenPasswordHidden.hashCode();
            }

            public String toString() {
                return "IconContentDescription(whenPasswordVisible=" + this.whenPasswordVisible + ", whenPasswordHidden=" + this.whenPasswordHidden + ')';
            }

            public /* synthetic */ IconContentDescription(Label label, Label label2, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? c70.a.f23835a.a().N() : label, (i15 & 2) != 0 ? c70.a.f23835a.a().h0() : label2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Password(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, int i16, Label label5, Object obj, IconContentDescription iconContentDescription, er.l lVar4, int i17, fr.k kVar) {
            IconContentDescription iconContentDescription2;
            Label label6 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            String str2 = (i17 & 1) != 0 ? null : str;
            Label label7 = (i17 & 2) != 0 ? null : label;
            Label label8 = (i17 & 4) != 0 ? null : label2;
            hz.b bVar2 = (i17 & 16) != 0 ? hz.b.C2039b.f86846c : bVar;
            Label label9 = (i17 & 32) != 0 ? null : label4;
            ButtonTextData buttonTextData2 = (i17 & 64) != 0 ? null : buttonTextData;
            er.l lVar5 = (i17 & 256) != 0 ? new er.l() { // from class: v50.f
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Password.x(((Boolean) obj2).booleanValue());
                }
            } : lVar2;
            boolean z18 = (i17 & 512) != 0 ? true : z15;
            int iB = (i17 & 1024) != 0 ? v4.t.INSTANCE.b() : i15;
            er.l lVar6 = (i17 & 2048) != 0 ? new er.l() { // from class: v50.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Password.y((l3.o) obj2);
                }
            } : lVar3;
            boolean z19 = (i17 & PKIFailureInfo.certConfirmed) != 0 ? true : z16;
            b5.j jVar2 = (i17 & PKIFailureInfo.certRevoked) != 0 ? null : jVar;
            boolean z25 = (i17 & 16384) != 0 ? false : z17;
            int iF = (32768 & i17) != 0 ? a0.INSTANCE.f() : i16;
            Label label10 = (65536 & i17) != 0 ? null : label5;
            Object obj2 = (131072 & i17) != 0 ? null : obj;
            if ((262144 & i17) != 0) {
                iconContentDescription2 = new IconContentDescription(label6, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            } else {
                iconContentDescription2 = iconContentDescription;
            }
            this(str2, label7, label8, label3, bVar2, label9, buttonTextData2, lVar, lVar5, z18, iB, lVar6, z19, jVar2, z25, iF, label10, obj2, iconContentDescription2, (i17 & PKIFailureInfo.signerNotTrusted) != 0 ? new er.l() { // from class: v50.h
                @Override // er.l
                public final Object b(Object obj3) {
                    return c.Password.z(((Boolean) obj3).booleanValue());
                }
            } : lVar4, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010?R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\b=\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\b@\u0010/R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010?R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b1\u0010A\u001a\u0004\bL\u0010CR#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\bN\u0010CR\u001a\u0010R\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u00101\u001a\u0004\bQ\u0010!R\u0017\u0010W\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b9\u0010V¨\u0006X"}, d2 = {"Lv50/c$d;", "Lv50/c;", "", "testTag", "", "indexTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lv4/t;", "imeAction", "labelContentDescription", "", "fieldIndex", "countryCodeValue", "Lb5/j;", "countryCodeTextAlign", "Lhz/b;", "countryCodeValidationState", "Lkotlin/Function1;", "Loq/i0;", "onCountryCodeChanged", "", "onCountryCodeFocusChanged", "phoneNumberValue", "phoneNumberTextAlign", "phoneNumberValidationState", "onPhoneNumberChanged", "onPhoneNumberFocusChanged", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lmx/a;ILmx/a;Ljava/lang/Object;Lmx/a;ILhz/b;Ler/l;Ler/l;Lmx/a;Lb5/j;Lhz/b;Ler/l;Ler/l;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "w", "Lmx/a;", "k", "()Lmx/a;", "x", "I", "f", "y", "l", "z", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "A", "getCountryCodeValue", "B", "getCountryCodeTextAlign-e0LSkKk", "C", "Lhz/b;", "()Lhz/b;", ip.a.f96138c, "Ler/l;", "getOnCountryCodeChanged", "()Ler/l;", "E", "F", "G", "Lb5/j;", "getPhoneNumberTextAlign-buA522U", "()Lb5/j;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getPhoneNumberValidationState", "getOnPhoneNumberChanged", "J", "getOnPhoneNumberFocusChanged", "Lv4/a0;", "K", "j", "keyboardType", "Lv50/c$b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lv50/c$b;", "()Lv50/c$b;", "countryCodeNumber", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumber extends c {
        public static final int M = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final Label countryCodeValue;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final int countryCodeTextAlign;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final hz.b countryCodeValidationState;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onCountryCodeChanged;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCountryCodeFocusChanged;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final Label phoneNumberValue;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final b5.j phoneNumberTextAlign;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final hz.b phoneNumberValidationState;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onPhoneNumberChanged;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPhoneNumberFocusChanged;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        private final int keyboardType;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        private final Number countryCodeNumber;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer indexTag;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object fieldIndex;

        public /* synthetic */ PhoneNumber(String str, Integer num, Label label, int i15, Label label2, Object obj, Label label3, int i16, hz.b bVar, er.l lVar, er.l lVar2, Label label4, b5.j jVar, hz.b bVar2, er.l lVar3, er.l lVar4, fr.k kVar) {
            this(str, num, label, i15, label2, obj, label3, i16, bVar, lVar, lVar2, label4, jVar, bVar2, lVar3, lVar4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 x(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 y(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 z(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final Number getCountryCodeNumber() {
            return this.countryCodeNumber;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final hz.b getCountryCodeValidationState() {
            return this.countryCodeValidationState;
        }

        public final er.l<Boolean, i0> C() {
            return this.onCountryCodeFocusChanged;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final Label getPhoneNumberValue() {
            return this.phoneNumberValue;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneNumber)) {
                return false;
            }
            PhoneNumber phoneNumber = (PhoneNumber) other;
            return t.c(this.testTag, phoneNumber.testTag) && t.c(this.indexTag, phoneNumber.indexTag) && t.c(this.label, phoneNumber.label) && v4.t.m(this.imeAction, phoneNumber.imeAction) && t.c(this.labelContentDescription, phoneNumber.labelContentDescription) && t.c(this.fieldIndex, phoneNumber.fieldIndex) && t.c(this.countryCodeValue, phoneNumber.countryCodeValue) && b5.j.k(this.countryCodeTextAlign, phoneNumber.countryCodeTextAlign) && t.c(this.countryCodeValidationState, phoneNumber.countryCodeValidationState) && t.c(this.onCountryCodeChanged, phoneNumber.onCountryCodeChanged) && t.c(this.onCountryCodeFocusChanged, phoneNumber.onCountryCodeFocusChanged) && t.c(this.phoneNumberValue, phoneNumber.phoneNumberValue) && t.c(this.phoneNumberTextAlign, phoneNumber.phoneNumberTextAlign) && t.c(this.phoneNumberValidationState, phoneNumber.phoneNumberValidationState) && t.c(this.onPhoneNumberChanged, phoneNumber.onPhoneNumberChanged) && t.c(this.onPhoneNumberFocusChanged, phoneNumber.onPhoneNumberFocusChanged);
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public Integer getIndexTag() {
            return this.indexTag;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.indexTag;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Label label = this.label;
            int iHashCode3 = (((iHashCode2 + (label == null ? 0 : label.hashCode())) * 31) + v4.t.n(this.imeAction)) * 31;
            Label label2 = this.labelContentDescription;
            int iHashCode4 = (iHashCode3 + (label2 == null ? 0 : label2.hashCode())) * 31;
            Object obj = this.fieldIndex;
            int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
            Label label3 = this.countryCodeValue;
            int iHashCode6 = (((((((((iHashCode5 + (label3 == null ? 0 : label3.hashCode())) * 31) + b5.j.l(this.countryCodeTextAlign)) * 31) + this.countryCodeValidationState.hashCode()) * 31) + this.onCountryCodeChanged.hashCode()) * 31) + this.onCountryCodeFocusChanged.hashCode()) * 31;
            Label label4 = this.phoneNumberValue;
            int iHashCode7 = (iHashCode6 + (label4 == null ? 0 : label4.hashCode())) * 31;
            b5.j jVar = this.phoneNumberTextAlign;
            return ((((((iHashCode7 + (jVar != null ? b5.j.l(jVar.getValue()) : 0)) * 31) + this.phoneNumberValidationState.hashCode()) * 31) + this.onPhoneNumberChanged.hashCode()) * 31) + this.onPhoneNumberFocusChanged.hashCode();
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        public String toString() {
            return "PhoneNumber(testTag=" + this.testTag + ", indexTag=" + this.indexTag + ", label=" + this.label + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", labelContentDescription=" + this.labelContentDescription + ", fieldIndex=" + this.fieldIndex + ", countryCodeValue=" + this.countryCodeValue + ", countryCodeTextAlign=" + ((Object) b5.j.m(this.countryCodeTextAlign)) + ", countryCodeValidationState=" + this.countryCodeValidationState + ", onCountryCodeChanged=" + this.onCountryCodeChanged + ", onCountryCodeFocusChanged=" + this.onCountryCodeFocusChanged + ", phoneNumberValue=" + this.phoneNumberValue + ", phoneNumberTextAlign=" + this.phoneNumberTextAlign + ", phoneNumberValidationState=" + this.phoneNumberValidationState + ", onPhoneNumberChanged=" + this.onPhoneNumberChanged + ", onPhoneNumberFocusChanged=" + this.onPhoneNumberFocusChanged + ')';
        }

        public /* synthetic */ PhoneNumber(String str, Integer num, Label label, int i15, Label label2, Object obj, Label label3, int i16, hz.b bVar, er.l lVar, er.l lVar2, Label label4, b5.j jVar, hz.b bVar2, er.l lVar3, er.l lVar4, int i17, fr.k kVar) {
            this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : num, label, (i17 & 8) != 0 ? v4.t.INSTANCE.b() : i15, (i17 & 16) != 0 ? c70.a.f23835a.a().F0() : label2, (i17 & 32) != 0 ? null : obj, label3, (i17 & 128) != 0 ? b5.j.INSTANCE.a() : i16, (i17 & 256) != 0 ? hz.b.C2039b.f86846c : bVar, lVar, (i17 & 1024) != 0 ? new er.l() { // from class: v50.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.PhoneNumber.x(((Boolean) obj2).booleanValue());
                }
            } : lVar2, label4, (i17 & PKIFailureInfo.certConfirmed) != 0 ? null : jVar, (i17 & PKIFailureInfo.certRevoked) != 0 ? hz.b.C2039b.f86846c : bVar2, lVar3, (i17 & 32768) != 0 ? new er.l() { // from class: v50.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.PhoneNumber.y(((Boolean) obj2).booleanValue());
                }
            } : lVar4, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        private PhoneNumber(String str, Integer num, Label label, int i15, Label label2, Object obj, Label label3, int i16, hz.b bVar, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, Label label4, b5.j jVar, hz.b bVar2, er.l<? super String, i0> lVar3, er.l<? super Boolean, i0> lVar4) {
            String str2;
            String str3;
            if (str != null) {
                str2 = str + "PhoneNumberText";
            } else {
                str2 = null;
            }
            super(str2, label != null ? Label.f(label, "_PhoneNumber", null, 2, null) : null, label4 == null ? Label.INSTANCE.c() : label4, null, bVar2, null, null, lVar3, lVar4, true, i15, new er.l() { // from class: v50.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.PhoneNumber.z((l3.o) obj2);
                }
            }, true, jVar, true, num, label2, null, obj, PKIFailureInfo.unsupportedVersion, null);
            this.testTag = str;
            this.indexTag = num;
            this.label = label;
            this.imeAction = i15;
            this.labelContentDescription = label2;
            this.fieldIndex = obj;
            Label label5 = label3;
            this.countryCodeValue = label5;
            this.countryCodeTextAlign = i16;
            this.countryCodeValidationState = bVar;
            this.onCountryCodeChanged = lVar;
            this.onCountryCodeFocusChanged = lVar2;
            this.phoneNumberValue = label4;
            this.phoneNumberTextAlign = jVar;
            this.phoneNumberValidationState = bVar2;
            this.onPhoneNumberChanged = lVar3;
            this.onPhoneNumberFocusChanged = lVar4;
            this.keyboardType = a0.INSTANCE.g();
            String testTag = getTestTag();
            if (testTag != null) {
                str3 = testTag + "CountryCodeText";
            } else {
                str3 = null;
            }
            Integer indexTag = getIndexTag();
            Label label6 = getLabel();
            this.countryCodeNumber = new Number(str3, label6 != null ? Label.f(label6, "_CountryCode", null, 2, null) : null, null, label5 == null ? Label.INSTANCE.c() : label5, bVar, null, null, lVar, null, false, v4.t.INSTANCE.d(), null, false, b5.j.h(i16), false, indexTag, c70.a.f23835a.a().J0(), null, null, true, 400224, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$e, reason: from toString */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 ¢\u0006\u0004\b\"\u0010#Jþ\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b:\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010\u0011\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010)R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010BR\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010HR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010F\u001a\u0004\bU\u0010HR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bV\u00103R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b[\u0010J\u001a\u0004\b?\u0010)R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bC\u0010^R\u001a\u0010b\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010J\u001a\u0004\ba\u0010)¨\u0006c"}, d2 = {"Lv50/c$e;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "labelContentDescription", "", "fieldIndex", "", "length", "Lkotlin/Function0;", "onProvidedRequiredLengthPin", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLmx/a;Ljava/lang/Object;ILer/a;Lfr/k;)V", "y", "(Ljava/lang/String;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLmx/a;Ljava/lang/Object;ILer/a;)Lv50/c$e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "t", "x", "Lhz/b;", "s", "()Lhz/b;", "d", "z", "Lj30/a;", "h", "()Lj30/a;", "A", "Ler/l;", "n", "()Ler/l;", "B", "m", "C", "Z", "b", "()Z", ip.a.f96138c, "I", "f", "E", "i", "F", "p", "G", "Lb5/j;", "r", "()Lb5/j;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "o", "l", "J", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ler/a;", "()Ler/a;", "Lv4/a0;", "M", "j", "keyboardType", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pin extends c {
        public static final int N = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final int length;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final er.a<i0> onProvidedRequiredLengthPin;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        private final int keyboardType;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        public /* synthetic */ Pin(String str, Label label, Label label2, hz.b bVar, Label label3, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Label label4, Object obj, int i16, er.a aVar, fr.k kVar) {
            this(str, label, label2, bVar, label3, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, label4, obj, i16, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 w(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 x(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pin z(Pin pin, String str, Label label, Label label2, hz.b bVar, Label label3, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Label label4, Object obj, int i16, er.a aVar, int i17, Object obj2) {
            er.a aVar2;
            int i18;
            String str2 = (i17 & 1) != 0 ? pin.testTag : str;
            Label label5 = (i17 & 2) != 0 ? pin.label : label;
            Label label6 = (i17 & 4) != 0 ? pin.value : label2;
            hz.b bVar2 = (i17 & 8) != 0 ? pin.validationState : bVar;
            Label label7 = (i17 & 16) != 0 ? pin.helperText : label3;
            ButtonTextData buttonTextData2 = (i17 & 32) != 0 ? pin.infoButtonData : buttonTextData;
            er.l lVar4 = (i17 & 64) != 0 ? pin.onValueChanged : lVar;
            er.l lVar5 = (i17 & 128) != 0 ? pin.onFocusChanged : lVar2;
            boolean z18 = (i17 & 256) != 0 ? pin.enabled : z15;
            int i19 = (i17 & 512) != 0 ? pin.imeAction : i15;
            er.l lVar6 = (i17 & 1024) != 0 ? pin.keyboardAction : lVar3;
            boolean z19 = (i17 & 2048) != 0 ? pin.singleLine : z16;
            b5.j jVar2 = (i17 & PKIFailureInfo.certConfirmed) != 0 ? pin.textAlign : jVar;
            boolean z25 = (i17 & PKIFailureInfo.certRevoked) != 0 ? pin.removableIconVisible : z17;
            String str3 = str2;
            Label label8 = (i17 & 16384) != 0 ? pin.labelContentDescription : label4;
            Object obj3 = (i17 & 32768) != 0 ? pin.fieldIndex : obj;
            int i25 = (i17 & PKIFailureInfo.notAuthorized) != 0 ? pin.length : i16;
            if ((i17 & PKIFailureInfo.unsupportedVersion) != 0) {
                i18 = i25;
                aVar2 = pin.onProvidedRequiredLengthPin;
            } else {
                aVar2 = aVar;
                i18 = i25;
            }
            return pin.y(str3, label5, label6, bVar2, label7, buttonTextData2, lVar4, lVar5, z18, i19, lVar6, z19, jVar2, z25, label8, obj3, i18, aVar2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        public final er.a<i0> B() {
            return this.onProvidedRequiredLengthPin;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return t.c(this.testTag, pin.testTag) && t.c(this.label, pin.label) && t.c(this.value, pin.value) && t.c(this.validationState, pin.validationState) && t.c(this.helperText, pin.helperText) && t.c(this.infoButtonData, pin.infoButtonData) && t.c(this.onValueChanged, pin.onValueChanged) && t.c(this.onFocusChanged, pin.onFocusChanged) && this.enabled == pin.enabled && v4.t.m(this.imeAction, pin.imeAction) && t.c(this.keyboardAction, pin.keyboardAction) && this.singleLine == pin.singleLine && t.c(this.textAlign, pin.textAlign) && this.removableIconVisible == pin.removableIconVisible && t.c(this.labelContentDescription, pin.labelContentDescription) && t.c(this.fieldIndex, pin.fieldIndex) && this.length == pin.length && t.c(this.onProvidedRequiredLengthPin, pin.onProvidedRequiredLengthPin);
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31;
            Label label2 = this.helperText;
            int iHashCode3 = (iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode4 = (((((((((((((iHashCode3 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((iHashCode4 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31;
            Label label3 = this.labelContentDescription;
            int iHashCode5 = (iL + (label3 == null ? 0 : label3.hashCode())) * 31;
            Object obj = this.fieldIndex;
            int iHashCode6 = (((iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.length)) * 31;
            er.a<i0> aVar = this.onProvidedRequiredLengthPin;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Pin(testTag=" + this.testTag + ", label=" + this.label + ", value=" + this.value + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", labelContentDescription=" + this.labelContentDescription + ", fieldIndex=" + this.fieldIndex + ", length=" + this.length + ", onProvidedRequiredLengthPin=" + this.onProvidedRequiredLengthPin + ')';
        }

        public final Pin y(String testTag, Label label, Label value, hz.b validationState, Label helperText, ButtonTextData infoButtonData, er.l<? super String, i0> onValueChanged, er.l<? super Boolean, i0> onFocusChanged, boolean enabled, int imeAction, er.l<? super l3.o, l3> keyboardAction, boolean singleLine, b5.j textAlign, boolean removableIconVisible, Label labelContentDescription, Object fieldIndex, int length, er.a<i0> onProvidedRequiredLengthPin) {
            return new Pin(testTag, label, value, validationState, helperText, infoButtonData, onValueChanged, onFocusChanged, enabled, imeAction, keyboardAction, singleLine, textAlign, removableIconVisible, labelContentDescription, fieldIndex, length, onProvidedRequiredLengthPin, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Pin(String str, Label label, Label label2, hz.b bVar, Label label3, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Label label4, Object obj, int i16, er.a<i0> aVar) {
            super(str, label, label2, null, bVar, label3, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, null, label4, null, obj, 163840, null);
            this.testTag = str;
            this.label = label;
            this.value = label2;
            this.validationState = bVar;
            this.helperText = label3;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.labelContentDescription = label4;
            this.fieldIndex = obj;
            this.length = i16;
            this.onProvidedRequiredLengthPin = aVar;
            this.keyboardType = a0.INSTANCE.e();
        }

        public /* synthetic */ Pin(String str, Label label, Label label2, hz.b bVar, Label label3, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Label label4, Object obj, int i16, er.a aVar, int i17, fr.k kVar) {
            this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : label, label2, (i17 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i17 & 16) != 0 ? null : label3, (i17 & 32) != 0 ? null : buttonTextData, lVar, (i17 & 128) != 0 ? new er.l() { // from class: v50.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Pin.w(((Boolean) obj2).booleanValue());
                }
            } : lVar2, (i17 & 256) != 0 ? true : z15, (i17 & 512) != 0 ? v4.t.INSTANCE.b() : i15, (i17 & 1024) != 0 ? new er.l() { // from class: v50.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Pin.x((l3.o) obj2);
                }
            } : lVar3, (i17 & 2048) != 0 ? true : z16, (i17 & PKIFailureInfo.certConfirmed) != 0 ? null : jVar, (i17 & PKIFailureInfo.certRevoked) != 0 ? false : z17, (i17 & 16384) != 0 ? null : label4, (32768 & i17) != 0 ? null : obj, (65536 & i17) != 0 ? 4 : i16, (i17 & PKIFailureInfo.unsupportedVersion) != 0 ? null : aVar, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$f, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010&R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010BR\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010HR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bT\u0010HR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010.\u001a\u0004\bZ\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010J\u001a\u0004\ba\u0010&¨\u0006c"}, d2 = {"Lv50/c$f;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "hint", "value", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "", "indexTag", "labelContentDescription", "", "fieldIndex", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLjava/lang/Integer;Lmx/a;Ljava/lang/Object;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "e", "x", "t", "y", "Lhz/b;", "s", "()Lhz/b;", "z", "d", "A", "Lj30/a;", "h", "()Lj30/a;", "B", "Ler/l;", "n", "()Ler/l;", "C", "m", ip.a.f96138c, "Z", "b", "()Z", "E", "I", "f", "F", "i", "G", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lb5/j;", "r", "()Lb5/j;", "o", "J", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "K", "l", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lv4/a0;", "M", "j", "keyboardType", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Search extends c {
        public static final int N = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final Integer indexTag;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        private final int keyboardType;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label hint;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        public /* synthetic */ Search(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, Object obj, fr.k kVar) {
            this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 w(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 x(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public Label getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            Search search = (Search) other;
            return t.c(this.testTag, search.testTag) && t.c(this.label, search.label) && t.c(this.hint, search.hint) && t.c(this.value, search.value) && t.c(this.validationState, search.validationState) && t.c(this.helperText, search.helperText) && t.c(this.infoButtonData, search.infoButtonData) && t.c(this.onValueChanged, search.onValueChanged) && t.c(this.onFocusChanged, search.onFocusChanged) && this.enabled == search.enabled && v4.t.m(this.imeAction, search.imeAction) && t.c(this.keyboardAction, search.keyboardAction) && this.singleLine == search.singleLine && t.c(this.textAlign, search.textAlign) && this.removableIconVisible == search.removableIconVisible && t.c(this.indexTag, search.indexTag) && t.c(this.labelContentDescription, search.labelContentDescription) && t.c(this.fieldIndex, search.fieldIndex);
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public Integer getIndexTag() {
            return this.indexTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.hint;
            int iHashCode3 = (((((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31;
            Label label3 = this.helperText;
            int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode5 = (((((((((((((iHashCode4 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((iHashCode5 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31;
            Integer num = this.indexTag;
            int iHashCode6 = (iL + (num == null ? 0 : num.hashCode())) * 31;
            Label label4 = this.labelContentDescription;
            int iHashCode7 = (iHashCode6 + (label4 == null ? 0 : label4.hashCode())) * 31;
            Object obj = this.fieldIndex;
            return iHashCode7 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Search(testTag=" + this.testTag + ", label=" + this.label + ", hint=" + this.hint + ", value=" + this.value + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", indexTag=" + this.indexTag + ", labelContentDescription=" + this.labelContentDescription + ", fieldIndex=" + this.fieldIndex + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Search(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, Object obj) {
            super(str, label, label3, label2, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, null, obj, PKIFailureInfo.unsupportedVersion, null);
            this.testTag = str;
            this.label = label;
            this.hint = label2;
            this.value = label3;
            this.validationState = bVar;
            this.helperText = label4;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.indexTag = num;
            this.labelContentDescription = label5;
            this.fieldIndex = obj;
            this.keyboardType = a0.INSTANCE.h();
        }

        public /* synthetic */ Search(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, Object obj, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? null : label2, label3, (i16 & 16) != 0 ? hz.b.C2039b.f86846c : bVar, (i16 & 32) != 0 ? null : label4, (i16 & 64) != 0 ? null : buttonTextData, lVar, (i16 & 256) != 0 ? new er.l() { // from class: v50.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Search.w(((Boolean) obj2).booleanValue());
                }
            } : lVar2, (i16 & 512) != 0 ? true : z15, (i16 & 1024) != 0 ? v4.t.INSTANCE.b() : i15, (i16 & 2048) != 0 ? new er.l() { // from class: v50.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Search.x((l3.o) obj2);
                }
            } : lVar3, (i16 & PKIFailureInfo.certConfirmed) != 0 ? true : z16, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : jVar, (i16 & 16384) != 0 ? false : z17, (32768 & i16) != 0 ? null : num, (65536 & i16) != 0 ? null : label5, (i16 & PKIFailureInfo.unsupportedVersion) != 0 ? null : obj, null);
        }
    }

    /* JADX INFO: renamed from: v50.c$g, reason: from toString */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001eB\u0081\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010*R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bQ\u0010FR\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bX\u0010LR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u00102\u001a\u0004\b^\u00104R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010n\u001a\u00020k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010N\u001a\u0004\bm\u0010*¨\u0006o"}, d2 = {"Lv50/c$g;", "Lv50/c;", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "hint", "value", "Lhz/b;", "validationState", "helperText", "Lj30/a;", "infoButtonData", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "", "onFocusChanged", "enabled", "Lv4/t;", "imeAction", "Ll3/o;", "Ln1/l3;", "keyboardAction", "singleLine", "Lb5/j;", "textAlign", "removableIconVisible", "", "indexTag", "labelContentDescription", "Lv50/c$g$a;", "textInputKeyboardType", "Lj70/a;", "accessibilityReadMode", "", "fieldIndex", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lhz/b;Lmx/a;Lj30/a;Ler/l;Ler/l;ZILer/l;ZLb5/j;ZLjava/lang/Integer;Lmx/a;Lv50/c$g$a;Lj70/a;Ljava/lang/Object;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "u", "Ljava/lang/String;", "q", "v", "Lmx/a;", "k", "()Lmx/a;", "w", "e", "x", "t", "y", "Lhz/b;", "s", "()Lhz/b;", "z", "d", "A", "Lj30/a;", "h", "()Lj30/a;", "B", "Ler/l;", "n", "()Ler/l;", "C", "m", ip.a.f96138c, "Z", "b", "()Z", "E", "I", "f", "F", "i", "G", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lb5/j;", "r", "()Lb5/j;", "o", "J", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "K", "l", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lv50/c$g$a;", "getTextInputKeyboardType", "()Lv50/c$g$a;", "M", "Lj70/a;", "a", "()Lj70/a;", "N", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lv4/a0;", "O", "j", "keyboardType", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends c {
        public static final int P = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final ButtonTextData infoButtonData;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final er.l<String, i0> onValueChanged;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onFocusChanged;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final int imeAction;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final er.l<l3.o, l3> keyboardAction;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final boolean singleLine;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final b5.j textAlign;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean removableIconVisible;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final Integer indexTag;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        private final Label labelContentDescription;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        private final a textInputKeyboardType;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        private final Object fieldIndex;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        private final int keyboardType;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label hint;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label helperText;

        /* JADX INFO: renamed from: v50.c$g$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv50/c$g$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum a {
            TEXT,
            EMAIL;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f204024d = wq.b.a(b());
        }

        /* JADX INFO: renamed from: v50.c$g$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204025a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EMAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f204025a = iArr;
            }
        }

        public /* synthetic */ Text(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, a aVar, j70.a aVar2, Object obj, fr.k kVar) {
            this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, aVar, aVar2, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 w(boolean z15) {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l3 x(l3.o oVar) {
            return l3.INSTANCE.a();
        }

        @Override // v50.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getFieldIndex() {
            return this.fieldIndex;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getHelperText() {
            return this.helperText;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public Label getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return t.c(this.testTag, text.testTag) && t.c(this.label, text.label) && t.c(this.hint, text.hint) && t.c(this.value, text.value) && t.c(this.validationState, text.validationState) && t.c(this.helperText, text.helperText) && t.c(this.infoButtonData, text.infoButtonData) && t.c(this.onValueChanged, text.onValueChanged) && t.c(this.onFocusChanged, text.onFocusChanged) && this.enabled == text.enabled && v4.t.m(this.imeAction, text.imeAction) && t.c(this.keyboardAction, text.keyboardAction) && this.singleLine == text.singleLine && t.c(this.textAlign, text.textAlign) && this.removableIconVisible == text.removableIconVisible && t.c(this.indexTag, text.indexTag) && t.c(this.labelContentDescription, text.labelContentDescription) && this.textInputKeyboardType == text.textInputKeyboardType && this.accessibilityReadMode == text.accessibilityReadMode && t.c(this.fieldIndex, text.fieldIndex);
        }

        @Override // v50.c
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getImeAction() {
            return this.imeAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public Integer getIndexTag() {
            return this.indexTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: h, reason: from getter */
        public ButtonTextData getInfoButtonData() {
            return this.infoButtonData;
        }

        public int hashCode() {
            String str = this.testTag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Label label = this.label;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            Label label2 = this.hint;
            int iHashCode3 = (((((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31;
            Label label3 = this.helperText;
            int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
            ButtonTextData buttonTextData = this.infoButtonData;
            int iHashCode5 = (((((((((((((iHashCode4 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + v4.t.n(this.imeAction)) * 31) + this.keyboardAction.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
            b5.j jVar = this.textAlign;
            int iL = (((iHashCode5 + (jVar == null ? 0 : b5.j.l(jVar.getValue()))) * 31) + Boolean.hashCode(this.removableIconVisible)) * 31;
            Integer num = this.indexTag;
            int iHashCode6 = (iL + (num == null ? 0 : num.hashCode())) * 31;
            Label label4 = this.labelContentDescription;
            int iHashCode7 = (((((iHashCode6 + (label4 == null ? 0 : label4.hashCode())) * 31) + this.textInputKeyboardType.hashCode()) * 31) + this.accessibilityReadMode.hashCode()) * 31;
            Object obj = this.fieldIndex;
            return iHashCode7 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // v50.c
        public er.l<l3.o, l3> i() {
            return this.keyboardAction;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getKeyboardType() {
            return this.keyboardType;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: l, reason: from getter */
        public Label getLabelContentDescription() {
            return this.labelContentDescription;
        }

        @Override // v50.c
        public er.l<Boolean, i0> m() {
            return this.onFocusChanged;
        }

        @Override // v50.c
        public er.l<String, i0> n() {
            return this.onValueChanged;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: o, reason: from getter */
        public boolean getRemovableIconVisible() {
            return this.removableIconVisible;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getTestTag() {
            return this.testTag;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public b5.j getTextAlign() {
            return this.textAlign;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: s, reason: from getter */
        public hz.b getValidationState() {
            return this.validationState;
        }

        @Override // v50.c
        /* JADX INFO: renamed from: t, reason: from getter */
        public Label getValue() {
            return this.value;
        }

        public String toString() {
            return "Text(testTag=" + this.testTag + ", label=" + this.label + ", hint=" + this.hint + ", value=" + this.value + ", validationState=" + this.validationState + ", helperText=" + this.helperText + ", infoButtonData=" + this.infoButtonData + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ", enabled=" + this.enabled + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", keyboardAction=" + this.keyboardAction + ", singleLine=" + this.singleLine + ", textAlign=" + this.textAlign + ", removableIconVisible=" + this.removableIconVisible + ", indexTag=" + this.indexTag + ", labelContentDescription=" + this.labelContentDescription + ", textInputKeyboardType=" + this.textInputKeyboardType + ", accessibilityReadMode=" + this.accessibilityReadMode + ", fieldIndex=" + this.fieldIndex + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Text(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, a aVar, j70.a aVar2, Object obj) {
            int iH;
            super(str, label, label3, label2, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, null, obj, PKIFailureInfo.unsupportedVersion, null);
            this.testTag = str;
            this.label = label;
            this.hint = label2;
            this.value = label3;
            this.validationState = bVar;
            this.helperText = label4;
            this.infoButtonData = buttonTextData;
            this.onValueChanged = lVar;
            this.onFocusChanged = lVar2;
            this.enabled = z15;
            this.imeAction = i15;
            this.keyboardAction = lVar3;
            this.singleLine = z16;
            this.textAlign = jVar;
            this.removableIconVisible = z17;
            this.indexTag = num;
            this.labelContentDescription = label5;
            this.textInputKeyboardType = aVar;
            this.accessibilityReadMode = aVar2;
            this.fieldIndex = obj;
            int i16 = b.f204025a[aVar.ordinal()];
            if (i16 == 1) {
                iH = a0.INSTANCE.h();
            } else {
                if (i16 != 2) {
                    throw new oq.p();
                }
                iH = a0.INSTANCE.c();
            }
            this.keyboardType = iH;
        }

        public /* synthetic */ Text(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, a aVar, j70.a aVar2, Object obj, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? null : label2, label3, (i16 & 16) != 0 ? hz.b.C2039b.f86846c : bVar, (i16 & 32) != 0 ? null : label4, (i16 & 64) != 0 ? null : buttonTextData, lVar, (i16 & 256) != 0 ? new er.l() { // from class: v50.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Text.w(((Boolean) obj2).booleanValue());
                }
            } : lVar2, (i16 & 512) != 0 ? true : z15, (i16 & 1024) != 0 ? v4.t.INSTANCE.b() : i15, (i16 & 2048) != 0 ? new er.l() { // from class: v50.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.Text.x((l3.o) obj2);
                }
            } : lVar3, (i16 & PKIFailureInfo.certConfirmed) != 0 ? true : z16, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : jVar, (i16 & 16384) != 0 ? true : z17, (32768 & i16) != 0 ? null : num, (65536 & i16) != 0 ? null : label5, (131072 & i16) != 0 ? a.TEXT : aVar, (262144 & i16) != 0 ? j70.a.NORMAL : aVar2, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? null : obj, null);
        }
    }

    public /* synthetic */ c(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj, fr.k kVar) {
        this(str, label, label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, jVar, z17, num, label5, aVar, obj);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public j70.a getAccessibilityReadMode() {
        return this.accessibilityReadMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Object getFieldIndex() {
        return this.fieldIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Label getHelperText() {
        return this.helperText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public Label getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getImeAction() {
        return this.imeAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Integer getIndexTag() {
        return this.indexTag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public ButtonTextData getInfoButtonData() {
        return this.infoButtonData;
    }

    public er.l<l3.o, l3> i() {
        return this.keyboardAction;
    }

    /* JADX INFO: renamed from: j */
    public abstract int getKeyboardType();

    /* JADX INFO: renamed from: k, reason: from getter */
    public Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public Label getLabelContentDescription() {
        return this.labelContentDescription;
    }

    public er.l<Boolean, i0> m() {
        return this.onFocusChanged;
    }

    public er.l<String, i0> n() {
        return this.onValueChanged;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getRemovableIconVisible() {
        return this.removableIconVisible;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public boolean getSingleLine() {
        return this.singleLine;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public b5.j getTextAlign() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public hz.b getValidationState() {
        return this.validationState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public Label getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, boolean z15, int i15, er.l<? super l3.o, l3> lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj) {
        this.testTag = str;
        this.label = label;
        this.value = label2;
        this.hint = label3;
        this.validationState = bVar;
        this.helperText = label4;
        this.infoButtonData = buttonTextData;
        this.onValueChanged = lVar;
        this.onFocusChanged = lVar2;
        this.enabled = z15;
        this.imeAction = i15;
        this.keyboardAction = lVar3;
        this.singleLine = z16;
        this.textAlign = jVar;
        this.removableIconVisible = z17;
        this.indexTag = num;
        this.labelContentDescription = label5;
        this.accessibilityReadMode = aVar;
        this.fieldIndex = obj;
    }

    public /* synthetic */ c(String str, Label label, Label label2, Label label3, hz.b bVar, Label label4, ButtonTextData buttonTextData, er.l lVar, er.l lVar2, boolean z15, int i15, er.l lVar3, boolean z16, b5.j jVar, boolean z17, Integer num, Label label5, j70.a aVar, Object obj, int i16, fr.k kVar) {
        this(str, label, (i16 & 4) != 0 ? Label.INSTANCE.c() : label2, label3, bVar, label4, buttonTextData, lVar, lVar2, z15, i15, lVar3, z16, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : jVar, z17, (32768 & i16) != 0 ? null : num, (65536 & i16) != 0 ? null : label5, (i16 & PKIFailureInfo.unsupportedVersion) != 0 ? j70.a.NORMAL : aVar, obj, null);
    }
}
