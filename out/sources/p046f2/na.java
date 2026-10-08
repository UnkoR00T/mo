package p046f2;

import fu.r;
import h2.DateInputFormat;
import lr.m;
import p071kotlin.Metadata;
import q4.e;
import v4.TransformedText;
import v4.e1;
import v4.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0015\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lf2/na;", "Lv4/e1;", "Lh2/w0;", "dateInputFormat", "<init>", "(Lh2/w0;)V", "Lq4/e;", "text", "Lv4/c1;", "a", "(Lq4/e;)Lv4/c1;", "b", "Lh2/w0;", "", "c", "I", "firstDelimiterOffset", "d", "secondDelimiterOffset", "e", "dateFormatLength", "f2/na$a", "f", "Lf2/na$a;", "dateOffsetTranslator", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class na implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int firstDelimiterOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int secondDelimiterOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int dateFormatLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a dateOffsetTranslator = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"f2/na$a", "Lv4/i0;", "", "offset", "e", "(I)I", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i0 {
        a() {
        }

        @Override // v4.i0
        public int b(int offset) {
            if (offset <= na.this.firstDelimiterOffset - 1) {
                return offset;
            }
            if (offset <= na.this.secondDelimiterOffset - 1) {
                return offset - 1;
            }
            return offset <= na.this.dateFormatLength + 1 ? offset - 2 : na.this.dateFormatLength;
        }

        @Override // v4.i0
        public int e(int offset) {
            if (offset < na.this.firstDelimiterOffset) {
                return offset;
            }
            if (offset < na.this.secondDelimiterOffset) {
                return offset + 1;
            }
            return offset <= na.this.dateFormatLength ? offset + 2 : na.this.dateFormatLength + 2;
        }
    }

    public na(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = r.q0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.secondDelimiterOffset = r.w0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // v4.e1
    public TransformedText a(e text) {
        int i15 = 0;
        String strC1 = text.getText().length() > this.dateFormatLength ? r.c1(text.getText(), m.w(0, this.dateFormatLength)) : text.getText();
        String str = "";
        int i16 = 0;
        while (i15 < strC1.length()) {
            int i17 = i16 + 1;
            str = str + strC1.charAt(i15);
            if (i17 == this.firstDelimiterOffset || i16 + 2 == this.secondDelimiterOffset) {
                str = str + this.dateInputFormat.getDelimiter();
            }
            i15++;
            i16 = i17;
        }
        return new TransformedText(new e(str, null, 2, null), this.dateOffsetTranslator);
    }
}
