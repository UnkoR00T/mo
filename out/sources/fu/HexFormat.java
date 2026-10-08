package fu;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fu.g, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\r\u000f\u0011B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfu/g;", "", "", "upperCase", "Lfu/g$a;", "bytes", "Lfu/g$c;", "number", "<init>", "(ZLfu/g$a;Lfu/g$c;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "c", "()Z", "b", "Lfu/g$a;", "()Lfu/g$a;", "Lfu/g$c;", "getNumber", "()Lfu/g$c;", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HexFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HexFormat f67048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HexFormat f67049f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean upperCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BytesHexFormat bytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NumberHexFormat number;

    /* JADX INFO: renamed from: fu.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001\u0014B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\"\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lfu/g$a;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "I", "g", "()I", "f", "c", "Ljava/lang/String;", "h", "d", "e", "", "Z", "i", "()Z", "noLineAndGroupSeparator", "j", "shortByteSeparatorNoPrefixAndSuffix", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final BytesHexFormat f67054k = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerLine;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String groupSeparator;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String byteSeparator;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String bytePrefix;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String byteSuffix;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean noLineAndGroupSeparator;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        /* JADX INFO: renamed from: fu.g$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfu/g$a$a;", "", "<init>", "()V", "Lfu/g$a;", "Default", "Lfu/g$a;", "a", "()Lfu/g$a;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final BytesHexFormat a() {
                return BytesHexFormat.f67054k;
            }

            private Companion() {
            }
        }

        public BytesHexFormat(int i15, int i16, String str, String str2, String str3, String str4) {
            this.bytesPerLine = i15;
            this.bytesPerGroup = i16;
            this.groupSeparator = str;
            this.byteSeparator = str2;
            this.bytePrefix = str3;
            this.byteSuffix = str4;
            this.noLineAndGroupSeparator = i15 == Integer.MAX_VALUE && i16 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.ignoreCase = h.b(str) || h.b(str2) || h.b(str3) || h.b(str4);
        }

        public final StringBuilder b(StringBuilder sb5, String indent) {
            sb5.append(indent);
            sb5.append("bytesPerLine = ");
            sb5.append(this.bytesPerLine);
            sb5.append(",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("bytesPerGroup = ");
            sb5.append(this.bytesPerGroup);
            sb5.append(",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("groupSeparator = \"");
            sb5.append(this.groupSeparator);
            sb5.append("\",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("byteSeparator = \"");
            sb5.append(this.byteSeparator);
            sb5.append("\",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("bytePrefix = \"");
            sb5.append(this.bytePrefix);
            sb5.append("\",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("byteSuffix = \"");
            sb5.append(this.byteSuffix);
            sb5.append("\"");
            return sb5;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getNoLineAndGroupSeparator() {
            return this.noLineAndGroupSeparator;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getShortByteSeparatorNoPrefixAndSuffix() {
            return this.shortByteSeparatorNoPrefixAndSuffix;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("BytesHexFormat(");
            sb5.append('\n');
            b(sb5, "    ").append('\n');
            sb5.append(")");
            return sb5.toString();
        }
    }

    /* JADX INFO: renamed from: fu.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfu/g$b;", "", "<init>", "()V", "Lfu/g;", "Default", "Lfu/g;", "a", "()Lfu/g;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final HexFormat a() {
            return HexFormat.f67048e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: fu.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 *2\u00020\u0001:\u0001\u0013B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010&\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001a\u0010)\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lfu/g$c;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "Ljava/lang/String;", "getPrefix", "getSuffix", "c", "Z", "getRemoveLeadingZeros", "()Z", "d", "I", "getMinLength", "()I", "getMinLength$annotations", "()V", "e", "isDigitsOnly$kotlin_stdlib", "isDigitsOnly", "f", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "g", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "h", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final NumberHexFormat f67065i = new NumberHexFormat("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String suffix;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean removeLeadingZeros;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int minLength;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnly;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnlyAndNoPadding;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        /* JADX INFO: renamed from: fu.g$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfu/g$c$a;", "", "<init>", "()V", "Lfu/g$c;", "Default", "Lfu/g$c;", "a", "()Lfu/g$c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final NumberHexFormat a() {
                return NumberHexFormat.f67065i;
            }

            private Companion() {
            }
        }

        public NumberHexFormat(String str, String str2, boolean z15, int i15) {
            this.prefix = str;
            this.suffix = str2;
            this.removeLeadingZeros = z15;
            this.minLength = i15;
            boolean z16 = str.length() == 0 && str2.length() == 0;
            this.isDigitsOnly = z16;
            this.isDigitsOnlyAndNoPadding = z16 && i15 == 1;
            this.ignoreCase = h.b(str) || h.b(str2);
        }

        public final StringBuilder b(StringBuilder sb5, String indent) {
            sb5.append(indent);
            sb5.append("prefix = \"");
            sb5.append(this.prefix);
            sb5.append("\",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("suffix = \"");
            sb5.append(this.suffix);
            sb5.append("\",");
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("removeLeadingZeros = ");
            sb5.append(this.removeLeadingZeros);
            sb5.append(',');
            sb5.append('\n');
            sb5.append(indent);
            sb5.append("minLength = ");
            sb5.append(this.minLength);
            return sb5;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("NumberHexFormat(");
            sb5.append('\n');
            b(sb5, "    ").append('\n');
            sb5.append(")");
            return sb5.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat bytesHexFormatA = companion.a();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f67048e = new HexFormat(false, bytesHexFormatA, companion2.a());
        f67049f = new HexFormat(true, companion.a(), companion2.a());
    }

    public HexFormat(boolean z15, BytesHexFormat bytesHexFormat, NumberHexFormat numberHexFormat) {
        this.upperCase = z15;
        this.bytes = bytesHexFormat;
        this.number = numberHexFormat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUpperCase() {
        return this.upperCase;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("HexFormat(");
        sb5.append('\n');
        sb5.append("    upperCase = ");
        sb5.append(this.upperCase);
        sb5.append(",");
        sb5.append('\n');
        sb5.append("    bytes = BytesHexFormat(");
        sb5.append('\n');
        this.bytes.b(sb5, "        ").append('\n');
        sb5.append("    ),");
        sb5.append('\n');
        sb5.append("    number = NumberHexFormat(");
        sb5.append('\n');
        this.number.b(sb5, "        ").append('\n');
        sb5.append("    )");
        sb5.append('\n');
        sb5.append(")");
        return sb5.toString();
    }
}
