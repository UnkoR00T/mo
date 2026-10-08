package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class Headers implements Iterable<String> {
    private String boundary;
    private final String contentTransferEncoding;
    private String contentType;
    private Map<String, String> contentTypeParameters;
    private final Map<String, List> headers;
    private final List<String> headersAsPresented;
    private boolean multipart;

    private static class KV {
        public final String key;
        public final String value;

        public KV(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public KV(KV kv4) {
            this.key = kv4.key;
            this.value = kv4.value;
        }
    }

    public Headers(InputStream inputStream, String str) {
        this(parseHeaders(inputStream), str);
    }

    private Map<String, String> createContentTypeParameters(String str) {
        String[] strArrSplit = str.split(";");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i15 = 0; i15 != strArrSplit.length; i15++) {
            String str2 = strArrSplit[i15];
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf < 0) {
                throw new IllegalArgumentException("malformed Content-Type header");
            }
            linkedHashMap.put(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static List<String> parseHeaders(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(inputStream);
        while (true) {
            String line = lineReader.readLine();
            if (line == null || line.length() == 0) {
                break;
            }
            arrayList.add(line);
        }
        return arrayList;
    }

    private void put(String str, String str2) {
        synchronized (this) {
            try {
                KV kv4 = new KV(str, str2);
                List arrayList = this.headers.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.headers.put(str, arrayList);
                }
                arrayList.add(kv4);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean containsKey(String str) {
        return this.headers.containsKey(str);
    }

    public void dumpHeaders(OutputStream outputStream) throws IOException {
        Iterator<String> it = this.headersAsPresented.iterator();
        while (it.hasNext()) {
            outputStream.write(Strings.toUTF8ByteArray(it.next().toString()));
            outputStream.write(13);
            outputStream.write(10);
        }
    }

    public String getBoundary() {
        return this.boundary;
    }

    public String getContentTransferEncoding() {
        return this.contentTransferEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getContentTypeAttributes() {
        return this.contentTypeParameters;
    }

    public Iterator<String> getNames() {
        return this.headers.keySet().iterator();
    }

    public String[] getValues(String str) {
        synchronized (this) {
            try {
                List list = this.headers.get(str);
                if (list == null) {
                    return null;
                }
                String[] strArr = new String[list.size()];
                for (int i15 = 0; i15 < list.size(); i15++) {
                    strArr[i15] = ((KV) list.get(i15)).value;
                }
                return strArr;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this) {
            zIsEmpty = this.headers.isEmpty();
        }
        return zIsEmpty;
    }

    public boolean isMultipart() {
        return this.multipart;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.headers.keySet().iterator();
    }

    public Headers(String str, String str2) {
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        ArrayList arrayList = new ArrayList();
        this.headersAsPresented = arrayList;
        arrayList.add("Content-Type: " + str);
        put("Content-Type", str);
        String str3 = getValues("Content-Type") == null ? "text/plain" : getValues("Content-Type")[0];
        int iIndexOf = str3.indexOf(59);
        if (iIndexOf < 0) {
            this.contentTypeParameters = Collections.EMPTY_MAP;
        } else {
            String strSubstring = str3.substring(0, iIndexOf);
            this.contentTypeParameters = createContentTypeParameters(str3.substring(iIndexOf + 1).trim());
            str3 = strSubstring;
        }
        this.contentTransferEncoding = getValues("Content-Transfer-Encoding") != null ? getValues("Content-Transfer-Encoding")[0] : str2;
        if (str3.indexOf("multipart") < 0) {
            this.boundary = null;
            this.multipart = false;
            return;
        }
        this.multipart = true;
        String str4 = this.contentTypeParameters.get("boundary");
        if (str4.startsWith("\"") && str4.endsWith("\"")) {
            this.boundary = str4.substring(1, str4.length() - 1);
        } else {
            this.boundary = str4;
        }
    }

    public Headers(List<String> list, String str) {
        Map<String, String> mapCreateContentTypeParameters;
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.headersAsPresented = list;
        String str2 = "";
        for (String str3 : list) {
            if (str3.startsWith(" ") || str3.startsWith("\t")) {
                str2 = str2 + str3.trim();
            } else {
                if (str2.length() != 0) {
                    put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
                }
                str2 = str3;
            }
        }
        if (str2.trim().length() != 0) {
            put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
        }
        String str4 = getValues("Content-Type") == null ? "text/plain" : getValues("Content-Type")[0];
        int iIndexOf = str4.indexOf(59);
        if (iIndexOf < 0) {
            this.contentType = str4;
            mapCreateContentTypeParameters = Collections.EMPTY_MAP;
        } else {
            this.contentType = str4.substring(0, iIndexOf);
            mapCreateContentTypeParameters = createContentTypeParameters(str4.substring(iIndexOf + 1).trim());
        }
        this.contentTypeParameters = mapCreateContentTypeParameters;
        this.contentTransferEncoding = getValues("Content-Transfer-Encoding") != null ? getValues("Content-Transfer-Encoding")[0] : str;
        if (this.contentType.indexOf("multipart") < 0) {
            this.boundary = null;
            this.multipart = false;
        } else {
            this.multipart = true;
            String str5 = this.contentTypeParameters.get("boundary");
            this.boundary = str5.substring(1, str5.length() - 1);
        }
    }
}
