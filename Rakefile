
require 'asciidoctor'
require 'asciidoctor-pdf'

task :default do
  Asciidoctor.convert_file 'getting-started-with-mockito.adoc',
                           in_place: true,
                           doctype: :book,
                           backend: 'pdf',
                           safe: :server
end
