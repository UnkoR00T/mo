package n40;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: renamed from: n40.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010\u0015R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010.\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u001a\u00101\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010\u0013R\u001a\u00104\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b \u00103¨\u00065"}, d2 = {"Ln40/c;", "", "Lmx/a;", "addFileLabel", "errorLabel", "", "Ln40/i;", "files", "Ln40/e;", "requirements", "Lkotlin/Function0;", "Loq/i0;", "onAddFileClicked", "", "maxAllowedFiles", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;Ljava/util/List;Ler/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "f", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "getRequirements", "e", "Ler/a;", "getOnAddFileClicked", "()Ler/a;", "I", "h", "Ln50/g;", "cardsData", "j", "requirementsLabel", "i", "Ljava/lang/String;", "requirementsContentDescription", "Ln50/g;", "()Ln50/g;", "addFileCardData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilePickerData {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f131319k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label addFileLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label errorLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<i> files;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e> requirements;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onAddFileClicked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxAllowedFiles;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<DefaultSingleCardData> cardsData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Label requirementsLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String requirementsContentDescription;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final DefaultSingleCardData addFileCardData;

    /* JADX INFO: renamed from: n40.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131330a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-567177649);
            if (t.k()) {
                t.o(-567177649, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.FilePickerData.addFileCardData.<anonymous> (FilePickerData.kt:36)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX INFO: renamed from: n40.c$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f131331a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(495758701);
            if (t.k()) {
                t.o(495758701, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.model.FilePickerData.addFileCardData.<anonymous> (FilePickerData.kt:43)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilePickerData(Label label, Label label2, List<? extends i> list, List<? extends e> list2, er.a<i0> aVar, int i15) {
        this.addFileLabel = label;
        this.errorLabel = label2;
        this.files = list;
        this.requirements = list2;
        this.onAddFileClicked = aVar;
        this.maxAllowedFiles = i15;
        List<? extends i> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).getCardData());
        }
        this.cardsData = arrayList;
        List<e> list4 = this.requirements;
        Label.Companion companion = Label.INSTANCE;
        this.requirementsLabel = mx.b.b(v.v0(list4, companion.d().getText(), null, null, 0, null, new l() { // from class: n40.a
            @Override // er.l
            public final Object b(Object obj) {
                return FilePickerData.l((e) obj);
            }
        }, 30, null), "filePicker_requirements");
        this.requirementsContentDescription = v.v0(this.requirements, companion.d().getText(), null, null, 0, null, new l() { // from class: n40.b
            @Override // er.l
            public final Object b(Object obj) {
                return FilePickerData.k((e) obj);
            }
        }, 30, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, a.f131330a, null, null, 26, null), 3, null);
        this.addFileCardData = new DefaultSingleCardData(null, this.onAddFileClicked, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.addFileLabel, mx.b.b(d.b(this), "filePicker_contentDescription"), b.f131331a, 0, 0, j70.a.NORMAL, 24, null)), null, 5, null), leadingSection, null, null, 3325, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(e eVar) {
        return eVar.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(e eVar) {
        return eVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String().getText();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DefaultSingleCardData getAddFileCardData() {
        return this.addFileCardData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getAddFileLabel() {
        return this.addFileLabel;
    }

    public final List<DefaultSingleCardData> e() {
        return this.cardsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePickerData)) {
            return false;
        }
        FilePickerData filePickerData = (FilePickerData) other;
        return fr.t.c(this.addFileLabel, filePickerData.addFileLabel) && fr.t.c(this.errorLabel, filePickerData.errorLabel) && fr.t.c(this.files, filePickerData.files) && fr.t.c(this.requirements, filePickerData.requirements) && fr.t.c(this.onAddFileClicked, filePickerData.onAddFileClicked) && this.maxAllowedFiles == filePickerData.maxAllowedFiles;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getErrorLabel() {
        return this.errorLabel;
    }

    public final List<i> g() {
        return this.files;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxAllowedFiles() {
        return this.maxAllowedFiles;
    }

    public int hashCode() {
        int iHashCode = this.addFileLabel.hashCode() * 31;
        Label label = this.errorLabel;
        return ((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.files.hashCode()) * 31) + this.requirements.hashCode()) * 31) + this.onAddFileClicked.hashCode()) * 31) + Integer.hashCode(this.maxAllowedFiles);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRequirementsContentDescription() {
        return this.requirementsContentDescription;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Label getRequirementsLabel() {
        return this.requirementsLabel;
    }

    public String toString() {
        return "FilePickerData(addFileLabel=" + this.addFileLabel + ", errorLabel=" + this.errorLabel + ", files=" + this.files + ", requirements=" + this.requirements + ", onAddFileClicked=" + this.onAddFileClicked + ", maxAllowedFiles=" + this.maxAllowedFiles + ')';
    }
}
