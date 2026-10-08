package ar;

import eu.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljava/io/BufferedReader;", "Leu/h;", "", "c", "(Ljava/io/BufferedReader;)Leu/h;", "Ljava/io/Reader;", "d", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class j {
    public static final long a(Reader reader, Writer writer, int i15) throws IOException {
        char[] cArr = new char[i15];
        int i16 = reader.read(cArr);
        long j15 = 0;
        while (i16 >= 0) {
            writer.write(cArr, 0, i16);
            j15 += (long) i16;
            i16 = reader.read(cArr);
        }
        return j15;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = PKIFailureInfo.certRevoked;
        }
        return a(reader, writer, i15);
    }

    public static final eu.h<String> c(BufferedReader bufferedReader) {
        return k.h(new i(bufferedReader));
    }

    public static final String d(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        return stringWriter.toString();
    }
}
