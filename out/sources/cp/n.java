package cp;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
final class n extends l {
    n() {
    }

    private void g(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, i15);
            byte[] bArr2 = new byte[1024];
            boolean z15 = false;
            while (true) {
                try {
                    try {
                        int iInflate = inflater.inflate(bArr2);
                        if (iInflate == 0) {
                            if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                break;
                                break;
                                break;
                            }
                            inflater.setInput(bArr, 0, inputStream.read(bArr));
                        } else {
                            outputStream.write(bArr2, 0, iInflate);
                            z15 = true;
                        }
                    } catch (DataFormatException e15) {
                        if (!z15) {
                            throw e15;
                        }
                        c2.g("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                    }
                } catch (Throwable th4) {
                    inflater.end();
                    throw th4;
                }
            }
            inflater.end();
        }
        outputStream.flush();
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        try {
            g(inputStream, s.e(outputStream, f(dVar, i15)));
            return new k(dVar);
        } catch (DataFormatException e15) {
            c2.e("PdfBox-Android", "FlateFilter: stop reading corrupt stream due to a DataFormatException");
            throw new IOException(e15);
        }
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        Deflater deflater = new Deflater(l.e());
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
        dp.a.c(inputStream, deflaterOutputStream);
        deflaterOutputStream.close();
        outputStream.flush();
        deflater.end();
    }
}
